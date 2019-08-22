package com.example.impl;
import java.util.*;
import com.example.bean.*;
import com.example.employee.util.DbUtil;
import com.example.inf.employeeInf;
import java.sql.*;

public  class employeeImple implements employeeInf{
            
                public void getemployeeDetail(int id) {
                                try {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                Statement sta=con.createStatement();
                                                String q="select * from employeed where empid='"+id+"'";
                                                ResultSet rs=sta.executeQuery(q);
                                                if(rs.next())
                                                {
                                                                System.out.println("The empid no of employee is "+rs.getInt(1));
                                                                System.out.println("The name of the employee is "+rs.getString(2));
                                                               
                                                             System.out.println("The address of employee is "+rs.getString(3));
                                                                System.out.println("The contact number of the employee "+rs.getLong(4));
                                                                System.out.println("the age of employee is "+rs.getInt(5));
                                                                System.out.println("The blood group of employee is "+rs.getString(6));
                                                                
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
                @Override
                public Boolean insertemployee() {
                                EmpPojo obj=new EmpPojo();
                                Scanner sc=new Scanner(System.in);
                                System.out.println("Enter the Empid of employee");
                                obj.setEmpid(sc.nextInt());
                                System.out.println("Enter the name of the employee");
                                obj.setName(sc.next());
                                System.out.println("Enter the contact number of the employee");
                                obj.setContactnum(sc.nextLong());
                                System.out.println("Enter the address of the employee");
                                obj.setAddress(sc.next());
                                System.out.println("Enter the age of employee");
                                obj.setAge(sc.nextInt());
                                System.out.println("Enter the blood group of employee");
                                obj.setBloodgroup(sc.next());

                                try {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                PreparedStatement s=con.prepareStatement(DbUtil.INSERT_EMPLOYEE);
                                                s.setInt(1,obj.getEmpid());
                                                s.setString(2,obj.getName());
                                                s.setString(3, obj.getAddress());
                                                s.setLong(4, obj.getContactnum());
                                                s.setInt(5,obj.getAge());
                                                s.setString(6,obj.getBloodgroup());
                                                int h = s.executeUpdate();
                                                if(h == 1)
                                                {
                                                                return true;
                                                }
                                                s.close();
                                                con.close();  
                                } catch (Exception e) {
                                                e.printStackTrace();
                                }
                                
                                return false;
                }
                
                @Override
                public Boolean deleteemployee(int id) {
                                try
                                {
                                                Connection con=null;
                                                con=DbUtil.getConnection();
                                                PreparedStatement ps=con.prepareStatement("delete from employeed where empid ="+id);
                                                int j=ps.executeUpdate();
                                                if(j==1)
                                                {
                                                                return true;
                                                }
                                                con.close();
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return false;
                }
                @Override
               	public List<EmpPojo> getAllempDeta() {
					List<EmpPojo> li=new ArrayList<EmpPojo>();
                    try
                    {
                                    Connection con=null;
                                    con=DbUtil.getConnection();
                                    Statement st = con.createStatement();
                                    String sq = DbUtil.SELECT_EMPLOYEE;
                                    ResultSet rs =st.executeQuery(sq);
                                    while(rs.next())
                                    {
                                                    EmpPojo sp = new EmpPojo();
                                                    sp.setEmpid(rs.getInt(1));
                                                    sp.setName(rs.getString(2));
                                                    
                                                    sp.setAddress(rs.getString(3));
                                                    sp.setContactnum(rs.getLong(4));
                                                    sp.setAge(rs.getInt(5));
                                                    sp.setBloodgroup(rs.getString(6));
                                                    li.add(sp);
                                                    
                                    }
                    }
                    catch(Exception e)
                    {
                                    e.printStackTrace();
                    }
                    return li;
					
				}
				

}
