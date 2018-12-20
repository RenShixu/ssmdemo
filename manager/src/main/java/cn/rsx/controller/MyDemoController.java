package cn.rsx.controller;

import cn.rsx.pojo.po.Book;
import cn.rsx.service.BookManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyDemoController {
    private static Long bookId = 55L;

    @Autowired
    private BookManageService bookManageService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/book/{bookId}/{num}")
    @ResponseBody
    public Book findBook(@PathVariable("bookId") Long bookId,@PathVariable("num") Integer num){
        System.out.println("restfull第二个参数：" + num);
        return bookManageService.queryBook(bookId);
    }

    @RequestMapping("/insert")
    public String toInsertPage(){
        return "insert";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String insertBook(Book book){
        book.setBookId(bookId);
        bookId ++;
        System.out.println(book);
        bookManageService.insertIntoBook(book);
       return "result";
    }
}
