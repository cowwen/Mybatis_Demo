package com.cowwen.tutorial.demo;

import com.cowwen.tutorial.demo.entity.Blog;
import com.cowwen.tutorial.demo.entity.BlogDetail;
import com.cowwen.tutorial.demo.mapper.BlogDetailMapper;
import com.cowwen.tutorial.demo.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created with IntelliJ IDEA.
 * User: cowwen
 * Date: 14-1-20
 * Time: 下午5:53
 * To change this template use File | Settings | File Templates.
 */
public class MyBatisMain {

    private static final transient Logger log = LoggerFactory.getLogger(MyBatisMain.class);

    public static void main(String[] args) throws IOException {
        String resources = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BlogDetail blog = null;
        try{
            BlogDetailMapper mapper = sqlSession.getMapper(BlogDetailMapper.class);
            blog = mapper.selectBlogDetails(1);
        }finally {
            sqlSession.close();
        }

        log.info("Blog id: " + blog.getId() + " subject:" +
                blog.getSubject() + " content:" + blog.getContent() +
                " reference author id: " + blog.getAuthor().getId() +
                " author name: " + blog.getAuthor().getName());

    }

    public static void main1(String[] args) throws IOException {
        String resources = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Blog blog = null;
        try{
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            blog = mapper.selectBlog(1);
        }finally {
             sqlSession.close();
        }

        log.info("Blog id: " + blog.getId() + " subject:" +
                blog.getSubject() + " content:" + blog.getContent() +
                " reference author id: " + blog.getAuthorId());

    }
}
