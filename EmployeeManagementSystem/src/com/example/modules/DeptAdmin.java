package com.example.modules;
import java.util.Scanner;
import com.example.impl.DeptImple;

public class DeptAdmin { 
void deptAdmin()
{
       Boolean z=true;
       Scanner sce=new Scanner(System.in);
          do
          {
              System.out.println("welcome DeptAdmin");
              System.out.println("1.Add department details of employee");
              
              System.out.println("2.exit");
              int ch=sce.nextInt();
              DeptImple dep = new DeptImple();
              switch(ch){
              case 1:
                     Boolean flag=dep.deptDetails();
                     if(flag==true)
                     {
                           System.out.println("inserted succesfully");
                     }
              break;
              
              case 2:
                     EmpMngm gm =  new EmpMngm();
                     gm.show();
              break;
              default:
                     System.out.println("Enter proper value");
              }
          }while(z);
          sce.close();
       }
}
