package org.harish.spring.jdbc;

import org.harish.spring.jdbc.dao.StudentDAO;
import org.harish.spring.jdbc.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config_jdbc_con.xml");
        StudentDAO studentDAO = (StudentDAO) con.getBean("name");
        Student s = new Student(1, "Shweta", "xyz");
        System.out.println(studentDAO.insertStudent(s));
        System.out.println("program dome");
    }
}
