package com.severo.spring.microservices.course.endpoint.service;

import com.severo.spring.microservices.core.model.Course;
import com.severo.spring.microservices.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list (Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}
