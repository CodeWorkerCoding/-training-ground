package com.nchu.amqp;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fujianjian
 * @project nccpdbtrack
 * @date 2018/7/13 10:51
 */
@Slf4j
public class FunctionTest {

    private ThreadPoolTaskExecutor taskExecutor;

    @Before
    public void init() {
        taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(2);
        taskExecutor.setMaxPoolSize(3);
        taskExecutor.setQueueCapacity(2);
        taskExecutor.setKeepAliveSeconds(3);
        taskExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                BlockingQueue<Runnable> queue = executor.getQueue();
                try {
                    long startTime = System.currentTimeMillis();
                    queue.put(r);
                    long endTime = System.currentTimeMillis();
                    long cost = endTime - startTime;
                    log.info("current time: {}, time cost: {}", endTime, cost);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        taskExecutor.initialize();
    }

    @Test
    public void testAtomicInteger() throws Exception{

        Runnable runnable = new Runnable() {
            private AtomicInteger threadCount = new AtomicInteger(0);

            @Override
            public void run() {
                int ret = threadCount.incrementAndGet();
                log.info("current thread count: {}", ret);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

        for (int i = 0; i < 10; i++) {
            taskExecutor.submit(runnable);
        }
        TimeUnit.SECONDS.sleep(10);
//        log.info("end thread run value: {}", "10");
    }
}
