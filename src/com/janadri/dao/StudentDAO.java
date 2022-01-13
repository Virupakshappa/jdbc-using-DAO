package com.janadri.dao;

import com.janadri.pojo.*;
import java.sql.*;

public class StudentDAO {
    String uri = "jdbc:mysql://localhost/itachi";
    String user = "root";
    String pwd = "";
    Connection con = null;
    public void connect() throws Exception{
        //        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(uri, user, pwd);
    }
    public Student getStudent(int rollno) throws Exception {
        String query = "select sname from student where rollno= " + rollno;
        Student s = new Student();
        s.rollno = rollno;

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString(1);
        s.sname = name;

        return s;

        /*for adding the details to student table use the below method*/

//public void addStudent(Student s) throws Exception {
//    String query = "insert into student values(?,?)";
//    PreparedStatement pst = con.prepareStatement(query);
//    pst.setInt(1, s.rollno);
//    pst.setString(2, s.sname);
//    pst.executeUpdate();
//
   }
}
