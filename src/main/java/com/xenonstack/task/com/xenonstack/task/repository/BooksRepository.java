package com.xenonstack.task.com.xenonstack.task.repository;

import org.springframework.data.repository.CrudRepository;

import com.xenonstack.task.com.xenonstack.task.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer> {
}