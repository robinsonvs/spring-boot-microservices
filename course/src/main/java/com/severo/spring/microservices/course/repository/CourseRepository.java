package com.severo.spring.microservices.course.repository;

import com.severo.spring.microservices.course.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
