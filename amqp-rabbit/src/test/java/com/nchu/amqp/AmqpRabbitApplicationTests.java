package com.nchu.amqp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.QueryBuilder;
import com.nchu.amqp.producer.RabbitMQMessageProducer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqpRabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RabbitMQMessageProducer rabbitMQMessageProducer;

	@Test
	public void testProducer() {

		String msg = "hello world";
		String routeKey = "maxwellQueue";
		for (int i = 0; i < 10; i++) {
			this.rabbitMQMessageProducer.producerMessage(routeKey, msg);
		}
	}

	@Autowired
	private MongoTemplate mongoTemplate;
	@Test
	public void testMongoDBOperate() {
		JSONObject json = new JSONObject();
		json.put("test", "age");
		this.mongoTemplate.save(json);

	}

	@Test
	public void testMongoDBSave() {
		DBTrace.DBTraceBuilder builder = DBTrace.builder();
		for (int i = 0; i < 10; i++) {
			this.mongoTemplate.save(builder
					.address("localhost")
					.name("allen")
					.id(String.valueOf(i))
					.build());
		}
		log.info("the mongodb collection name: {}", this.mongoTemplate.getCollectionName(DBTrace.class));
		Query query = new Query();
		List<DBTrace> dbTraces = mongoTemplate.find(query, DBTrace.class);
		log.info("the db result: {}", dbTraces.toString());
	}


	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DBTrace {

		private String id;

		private String name;

		private String address;
	}



}
