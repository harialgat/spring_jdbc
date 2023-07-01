package org.harish.spring.jdbc.dao;

import org.harish.spring.jdbc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("name")
public class StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertStudent(Student student) {
        String query = "insert into student(id,name,city) values (?,?,?)";
        try {
            jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
