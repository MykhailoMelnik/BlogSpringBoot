package com.blogmelnik.blog.repo;

import com.blogmelnik.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
