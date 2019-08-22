package com.example.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.bean.EmpPojo;
import com.example.impl.employeeImple;

public class Admin extends EmpMngm{
       boolean x=true;
       void AdminPrivilages(){
              Scanner sce=new Scanner(System.in);
          do
          {
              int choice;
              System.out.println("welcome Admin");
              System.out.println("1.Add Employee");
              System.out.println("2.Get Employee details");
              System.out.println("3.delete the Employee");
              System.out.println("4.get all Employee details");
              System.out.println("5.Exit");
              System.out.println("Enter your choice:");
              choice=sce.nextInt();
              employeeImple imp=new employeeImple();
              switch(choice){
              case 1:
                     boolean t=imp.insertemployee();
                     if(t==true)
                     {
                           System.out.println("inserted succesfully");
                     }
                     break;
              case 2:
                  System.out.print("Enter the employee id to get details");
                  int dt=sce.nextInt();
                  imp.getemployeeDetail(dt);
                     break;
              case 3:
                     System.out.println("enter the Empid  of the Employee to delete");
                     int a=sce.nextInt();
                     Boolean flag=imp.deleteemployee(a);
               if(flag==true){
                    System.out.println("The Employee record is deleted");
               }
                     break;
              case 4:
                     List<EmpPojo> stu = new ArrayList<EmpPojo>();
                     stu=imp.getAllempDeta();
                     System.out.println(stu);
                     break;
              case 5:
                     EmpMngm st = new EmpMngm();
                     st.show();
                     break;
              default:
                           System.out.println("please enter proper input value");
              }
       }while(x);
          sce.close();
}
}
