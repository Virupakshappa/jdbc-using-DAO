package com.janadri.jdbc;

import com.janadri.dao.*;
import com.janadri.pojo.*;

public class JdbcDaoDemo {
    public static void main(String[] args) throws Exception{
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(12);
        System.out.println(s1.sname);
    }
}
