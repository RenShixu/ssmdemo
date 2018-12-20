package cn.rsx.service;

import cn.rsx.pojo.po.Book;

public interface BookManageService {
    Book queryBook(Long bookId);

    void insertIntoBook(Book book);
}
