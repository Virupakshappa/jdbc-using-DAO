package com.janadri.dao;

import com.janadri.pojo.*;
import java.sql.*;

public class StudentDAO {
    String uri = "jdbc:mysql://localhost/itachi";
    String user = "root";
    String pwd = "";

    public Student getStudent(int rollno) throws Exception {
        String query = "select sname from student where rollno= " + rollno;
        Student s = new Student();
        s.rollno = rollno;
//        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(uri, user, pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString(1);
        s.sname = name;

        return s;
    }
}
