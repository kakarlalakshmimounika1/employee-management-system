package com.example.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.example.bean.Deptpojo;
import com.example.employee.util.DbUtil;
import com.example.inf.Dept;

public class DeptImple implements Dept{

                @Override
                public Boolean deptDetails() {
                                Scanner sa = new Scanner(System.in);
                                Deptpojo dp = new Deptpojo();
                                System.out.println("Enter the id number of employee");
                                dp.setEmpid(sa.nextInt());
                                System.out.println("Enter the department id of employee");
                                dp.setDeptid(sa.nextInt());
                                System.out.println("Enter the department name of the employee");
                                dp.setDeptname(sa.next());
                               
                                System.out.println("Enter the floor of the empoyee");
                                dp.setFloor(sa.nextInt());
                                System.out.println("Enter the block of the employee");
                                dp.setBlock(sa.nextInt());
                               
                                try {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                PreparedStatement st=con.prepareStatement(DbUtil.INSERT_DEPT);
                                                st.setInt(1,dp.getEmpid());
                                                st.setInt(2,dp.getDeptid());
                                                st.setString(3,dp.getDeptname());
                                               
                                                st.setInt(4,dp.getFloor());
                                                st.setInt(5,dp.getBlock());
                                                
                                                int i=st.executeUpdate();
                                                if(i==1)
                                                {
                                                                return true;
                                                }
                                                sa.close();
                                                con.close(); 
                                               }
                                catch (Exception e) {
                                                e.printStackTrace();
                                }
                                return false;
                }

                

}
