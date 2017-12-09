package com.nchu.swagger2.action;

import com.nchu.swagger2.model.pojo.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/8 11:33
 */
@Api(value = "图书相关接口", protocols = "https")
@RestController
@RequestMapping("/book")
public class BookAction {

    private static Map<String, Book> bookMap = Collections.synchronizedMap(new HashMap<String, Book>());


    @ApiOperation(value = "获取数据列表", notes = "测试List", response = List.class)
    @GetMapping("/list")
    public List<Book> list() {
        List<Book> list = new ArrayList<>(bookMap.values());
        return list;
    }

    @ApiOperation(value = "新增一本书", notes = "测试add")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "book", value = "书本实体", required = true, dataType = "Book", paramType = "RequestBoy")
    )
    @PostMapping("add")
    public String addBook(@RequestBody Book book) {
        bookMap.put(book.getId(), book);
        return "success";
    }

    @ApiIgnore
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {

        return "success";
    }

}
