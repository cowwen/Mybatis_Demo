package com.cowwen.tutorial.demo.mapper;

import com.cowwen.tutorial.demo.entity.Blog;
import com.cowwen.tutorial.demo.entity.BlogDetail;

/**
 * Created with IntelliJ IDEA.
 * User: cowwen
 * Date: 14-1-20
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
public interface BlogDetailMapper {
    public BlogDetail selectBlogDetails(long id);
}
