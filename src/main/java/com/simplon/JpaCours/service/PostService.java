package com.simplon.JpaCours.service;

import com.simplon.JpaCours.entity.Post;
import com.simplon.JpaCours.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

}
