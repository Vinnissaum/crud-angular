package com.vinissaum.crudspring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinissaum.crudspring.model.Course;
import com.vinissaum.crudspring.repositories.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/api/courses")
@AllArgsConstructor // Lombok constructor
public class CourseController {
  
  private final CourseRepository courseRepository;

  @GetMapping
  public List<Course> list() {
    return courseRepository.findAll();
  }
}
