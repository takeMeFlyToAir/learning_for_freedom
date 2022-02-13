package com.springboot.springboot_mybatis;

import com.springboot.springboot_mybatis.dao.BookDao;
import com.springboot.springboot_mybatis.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/13 5:52 下午
 */
public class SqlSessionTest {


    @Test
    public void listBookTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookDao mapper = sqlSession.getMapper(BookDao.class);
        List<Book> all = mapper.findAll();
        for (Book book : all) {
            System.out.println(book.toString());
        }
    }


}
