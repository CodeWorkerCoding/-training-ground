package com.nchu.swagger2.action;

import com.nchu.swagger2.model.pojo.Book;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/8 11:33
 */
@RestController
@RequestMapping("/book")
public class BookAction {

    private static Map<String, Book> bookMap = Collections.synchronizedMap(new HashMap<String, Book>());


    @ApiOperation(value = "获取数据列表", notes = "测试List")
    @GetMapping("/list")
    public List<Book> list() {
        List<Book> list = new ArrayList<>(bookMap.values());
        return list;
    }

    @ApiOperation(value = "新增一本书", notes = "测试add")
    @PostMapping("add")
    public String addBook(@RequestBody Book book) {
        bookMap.put(book.getId(), book);
        return "success";
    }

}
