package org.harish.spring.jdbc.withoutconfig;

import org.harish.spring.jdbc.dao.StudentDAO;
import org.harish.spring.jdbc.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        Student s =  new Student(123,"xyz","pune");
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        StudentDAO dao = (StudentDAO) con.getBean("name");
        dao.insertStudent(s);
    }
}
