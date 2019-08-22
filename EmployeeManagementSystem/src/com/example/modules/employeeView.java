package com.example.modules;


import java.util.Scanner;
import com.example.impl.employeeViewImple;
import com.example.impl.employeeImple;


public class employeeView extends employeeImple{
       boolean x=true;
       void empView(){
              Scanner sce=new Scanner(System.in);
              employeeViewImple ev = new employeeViewImple();
          do
          {
              int choice;
              System.out.println("welcome Employee");
              System.out.println("1.Personal Details");
              System.out.println("2.Department Details");
              System.out.println("3.Update Details");
              System.out.println("4.Exit");
              System.out.println("Enter your choice:");
              choice=sce.nextInt();
              switch(choice){
              case 1:
                     System.out.println("Enter the id number of employee");
                     int empid=sce.nextInt();
                  super.getemployeeDetail(empid);
                     break;
              case 2:
                     System.out.println("Enter the id number of employee");
                     int id = sce.nextInt();
                     ev.getDeptDetails(id);
                     break;
             
              case 3:
                     System.out.println("Enter the id number of employee");
                     int num=sce.nextInt();
                     Boolean flag = ev.updatDeta(num);
                     if(flag==true)
                     {
                           System.out.println("Updated succesfully");
                     }
                     break;
              case 4:
                     EmpMngm ob = new EmpMngm();
                     ob.show();
                     break;
              default:
                           System.out.println("please enter proper input value");
              }
       }while(x);
          sce.close();
}
	
}
