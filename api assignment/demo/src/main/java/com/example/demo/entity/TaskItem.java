package com.example.demo.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "taskItems")
public class TaskItem {

  @Id
  private String id;
  private String name;
  private String description;
  private String status;

  // getters and setters
}