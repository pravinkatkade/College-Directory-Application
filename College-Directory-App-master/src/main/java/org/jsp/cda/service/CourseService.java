package org.jsp.cda.service;

import org.jsp.cda.entity.Course;
import org.springframework.http.ResponseEntity;

public interface CourseService {

	ResponseEntity<?> saveCourse(Course course);

}