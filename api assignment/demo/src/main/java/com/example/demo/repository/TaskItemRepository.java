package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.TaskItem;

public interface TaskItemRepository extends MongoRepository<TaskItem, String> {
  // any custom query methods can be added here
}
