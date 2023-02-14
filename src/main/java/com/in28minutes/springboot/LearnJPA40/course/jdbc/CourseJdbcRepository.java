package com.in28minutes.springboot.LearnJPA40.course.jdbc;

import com.in28minutes.springboot.LearnJPA40.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values(?, ?, ?);
            """;

    private static String DELETE_COURSE =
            """
                DELETE FROM course WHERE id = ?;
            """;

    private static String SELECT_QUERY =
            """
                SELECT * FROM course WHERE id = ?;
            """;

    public Course findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
        //ResultSet -> Bean => Row Mapper =>
        //id

    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_COURSE, id);
    }

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());

    }

}
