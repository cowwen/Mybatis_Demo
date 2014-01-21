package com.cowwen.tutorial.demo.mapper;

import com.cowwen.tutorial.demo.entity.Blog;

/**
 * Created with IntelliJ IDEA.
 * User: cowwen
 * Date: 14-1-20
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
public interface BlogMapper {
    public Blog selectBlog(long id);
}
