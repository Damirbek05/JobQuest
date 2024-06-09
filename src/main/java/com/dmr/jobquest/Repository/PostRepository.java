package com.dmr.jobquest.repository;

import com.dmr.jobquest.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {


}
