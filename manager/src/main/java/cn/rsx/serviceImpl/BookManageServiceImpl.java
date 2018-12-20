package cn.rsx.serviceImpl;

import cn.rsx.dao.BookDao;
import cn.rsx.pojo.po.Book;
import cn.rsx.service.BookManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookManageService")
public class BookManageServiceImpl implements BookManageService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book queryBook(Long bookId) {
        System.out.println(bookId);
        System.out.println(bookDao);
        Book book = bookDao.selectByPrimaryKey(bookId);
        return book;
    }

    @Transactional("transactionManager")
    public void insertIntoBook(Book book) {
        int result1 = bookDao.insert(book);
        if(result1 == 1){
            book.setBookId(21L);
            book.setBookName("哈哈哈");
            book.setPrice(333L);
            bookDao.insert(book);
        }else {
            book.setBookId(22L);
            bookDao.updateByPrimaryKey(book);
        }

    }
}
