package com.JavaExercicesForLinkedRH.LinkedCrud.service;
import com.JavaExercicesForLinkedRH.LinkedCrud.entities.Course;
import com.JavaExercicesForLinkedRH.LinkedCrud.exceptions.CourseAlreadyExistsException;
import com.JavaExercicesForLinkedRH.LinkedCrud.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
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
        try {
            String sql = ("INSERT INTO Course (Name, Description, Duration) VALUES (?,?,?)");
            int insert = jdbcTemplate.update(sql, course.getName(), course.getDescription(), course.getDuration());
            if (insert == 1) {
                logger.info("New Course created " + course.getName());
            }

        }catch(DuplicateKeyException e){
            e.getMessage();
            throw new CourseAlreadyExistsException(course);


        }
    }

    @Override
    public Optional<Course> getCoursesById(int id) {
        String sql = ("SELECT * FROM Course WHERE Course_Id = ? ");
        Course course = null;
        try {
            course = jdbcTemplate.queryForObject(sql, new Object[]{id} , rowMapper );
            logger.info("Course: " + course.getName());

        }catch (DataAccessException e){
            logger.info("Course not found " + id);
            e.getMessage();
            e.printStackTrace();
        }

         return Optional.ofNullable(course);
    }

    @Override
    public void update(Course course, int id) {
        try {
            String sql = ("UPDATE Course SET Name = ?, Description = ?, Duration = ? WHERE Course_Id = ?");
            int update = jdbcTemplate.update(sql, course.getName(), course.getDescription(), course.getDuration());

            if (update == 1) {
                logger.info("Course updated: " + course.getName());
            }

        } catch (IllegalStateException e) {
            e.getMessage();
            throw new CourseAlreadyExistsException(course);
        }
    }

    @Override
    public void delete(int id) {
        String sql = ("DELETE FROM Course WHERE Course_Id = ?");
        Object[] course = new Object[] {id};
        jdbcTemplate.update(sql, course);




    }
}
