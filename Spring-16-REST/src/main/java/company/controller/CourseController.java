package company.controller;


import company.dto.CourseDTO;
import company.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller and @ResponseBody with this annotation @RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> list = courseService.getCourses();

        return list;
    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId) {
        return courseService.getCourseById(courseId);
    }
}
