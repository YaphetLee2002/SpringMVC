package com.skooch.service.impl;

import com.skooch.controller.Code;
import com.skooch.dao.BookDao;
import com.skooch.domain.Book;
import com.skooch.exception.BusinessException;
import com.skooch.exception.SystemException;
import com.skooch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0; //判断修改行数

    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;

    }

    public boolean delete(Integer id) {
        //测试一下业务异常类
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "该数据不可被删除");
        }
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        //测试一下业务异常类
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "该数据不可被修改");
        }

        //测试一下系统异常类
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请重试");
//        }

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
