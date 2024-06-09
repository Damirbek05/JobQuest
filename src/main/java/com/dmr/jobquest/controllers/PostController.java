package com.dmr.jobquest.controllers;

import com.dmr.jobquest.model.Post;
import com.dmr.jobquest.repository.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class PostController {

    @Autowired
    PostRepository repo;



    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }


    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
}
