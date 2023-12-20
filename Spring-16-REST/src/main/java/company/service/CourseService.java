package company.service;

import company.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);
    CourseDTO getCourseById(Long courseId);
    List<CourseDTO> getCoursesByCategory(String category);
    List<CourseDTO> getCourses();
    void updateCourse(Long courseId, CourseDTO courseDTO);
    void deleteCourseById(Long courseId);
    void deleteCourses();
}
