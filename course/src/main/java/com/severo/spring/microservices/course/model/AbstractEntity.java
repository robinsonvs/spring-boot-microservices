package com.severo.spring.microservices.course.model;

import java.io.Serializable;

public interface AbstractEntity extends Serializable {
    Long getId();
}