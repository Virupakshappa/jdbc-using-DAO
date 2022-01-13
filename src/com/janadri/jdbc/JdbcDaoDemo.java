package com.janadri.jdbc;

import com.janadri.dao.*;
import com.janadri.pojo.*;

public class JdbcDaoDemo {
    public static void main(String[] args) throws Exception{
        StudentDAO dao = new StudentDAO();
        dao.connect();
        Student s1 = dao.getStudent(12);
        System.out.println(s1.sname);

        //for adding the student details
//        Student s2 = new Student();
//        s2.sname="Ashwath";
//        s2.rollno=7;
//        dao.connect();
//       dao.addStudent(s2);
    }
}
