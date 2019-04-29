package com.severo.spring.microservices.core.repository;


import com.severo.spring.microservices.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
