package com.JavaExercicesForLinkedRH.LinkedCrud.service;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseService implements CourseRepository {
    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<Course> rowMapper = ((rs, rowNum) -> {
        Course course = new Course();
        course.setCourseId(rs.getInt("Course_Id"));
        course.setName(rs.getString("Name"));
        course.setDescription(rs.getString("Description"));
        course.setDuration(rs.getInt("Duration"));
        return course;
    });

    public CourseService(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Course> courses() {
        String sql = ("SELECT Course_Id, Name, Description, Duration FROM Course");
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Course course) {
        String sql = ("INSERT INTO Course (Name, Description, Duration) VALUES (?,?,?)");
       int insert = jdbcTemplate.update(sql, course.getName(), course.getDescription(), course.getDuration());
       if(insert == 1){
           logger.info("New Course created" + course.getName());
       }

    }

    @Override
    public Optional<Course> getCourses(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
