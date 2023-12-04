package company.repository;

import company.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findByCategory(String category);

    List<Course> findByCategoryOrderByName(String category);

    boolean existsByName(String name);

    int countCourseByCategory(String category);

    List<Course> findCourseByNameStartingWith(String startName);

//    Stream<Course> streamByCategory(String category);
 }
