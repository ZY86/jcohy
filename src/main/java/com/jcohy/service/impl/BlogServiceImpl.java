package com.jcohy.service.impl;

import com.jcohy.model.Blog;
import com.jcohy.repository.BlogRepository;
import com.jcohy.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright  : 2017- www.jcohy.com
 * Created by jiac on 20:18 2017/12/20
 * Email: jia_chao23@126.com
 * ClassName: BlogServiceImpl
 * Description:
 **/
@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable Pageable) {
        return blogRepository.findAll(Pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void saveOrUpdate(Blog blog) {

    }

    @Override
    public void delete(Long id) {
        blogRepository.delete(id);
    }


}
