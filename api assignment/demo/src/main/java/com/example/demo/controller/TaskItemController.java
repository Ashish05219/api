package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaskItem;
import com.example.demo.service.TaskItemService;

@RestController
public class TaskItemController {

  @Autowired
  private TaskItemService taskItemService;

  @GetMapping("/taskItems")
  public ResponseEntity<Page<TaskItem>> getTaskItems(Pageable pageable) {
    Page<TaskItem> taskItems = taskItemService.getTaskItems(pageable);
    return ResponseEntity.ok(taskItems);
  }
}