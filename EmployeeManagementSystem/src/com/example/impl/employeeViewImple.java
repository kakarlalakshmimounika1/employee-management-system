package com.example.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.example.employee.util.DbUtil;
import com.example.inf.employeeViewData;
public class employeeViewImple implements employeeViewData{

                public void getDeptDetails(int id) {
                                try {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                Statement sta=con.createStatement();
                                                String q="select * from department where empid='"+id+"'";
                                                ResultSet rs=sta.executeQuery(q);
                                                if(rs.next())
                                                {
                                                                System.out.println("The empid "+rs.getInt(1));
                                                                System.out.println("The department id of the employee is "+rs.getString(2));
                                                                System.out.println("The department name of the employee "+rs.getString(3));
                                                                System.out.println("The floor of student is "+rs.getInt(4));
                                                                System.out.println("The block of student is "+rs.getInt(5));
                                                               
                                                }
                                                else
                                                {
                                                                System.out.println("No record found with that number");
                                                }
                                                con.close();
                                                
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                
                }

             
                public Boolean updatDeta(int id) {
                                System.out.println("Enter the new contact number");
                                Scanner sa=new Scanner(System.in);
                                long d=sa.nextLong();
                                try
                                {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                PreparedStatement pse=con.prepareStatement("update employeed set contactnum=?  where empid ="+id);
                                                pse.setLong(1,d);
                                                int k=pse.executeUpdate();
                                                if(k==1)
                                                {
                                                                return true;
                                                }
                                                con.close();
                                                sa.close();
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                
                                return false;
                }

}

