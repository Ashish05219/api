package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskItem;
import com.example.demo.repository.TaskItemRepository;

@Service
public class TaskItemService {

  @Autowired
  private TaskItemRepository taskItemRepository;

  public Page<TaskItem> getTaskItems(Pageable pageable) {
    return taskItemRepository.findAll(pageable);
  }
}