package com.example.modules;

import java.util.Scanner;

public class EmpMngm {
   void show(){
              boolean y=true;
              do
              {
                     int choices;
                     System.out.println("Welcome to employee management system");
                     System.out.println("1.Admin");
                    
                     System.out.println("2.Department Admin");
                     System.out.println("3.Employee");
                     System.out.println("4.Exit");
                     System.out.println("Enter your choice:");
                     Scanner sce=new Scanner(System.in);
                     choices=sce.nextInt();
                     switch(choices){
                     case 1:
                     Admin ad=new Admin();
                     ad.AdminPrivilages();
                     break;
                     
                     case 2:
                           DeptAdmin dept = new DeptAdmin();
                           dept.deptAdmin();
                     break;
                     case 3:
                           employeeView ev = new employeeView();
                           ev.empView();
                     break;
                     case 4:
                           System.exit(0);
                     break;
                     default:
                           System.out.println("Enter proper value");
                     }
                     sce.close();
                     }while(y);
       }

}
