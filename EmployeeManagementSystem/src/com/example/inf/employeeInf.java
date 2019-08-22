package com.example.inf;
import java.util.List;
import com.example.bean.EmpPojo;

public interface employeeInf {
void getemployeeDetail(int id);
Boolean insertemployee();
Boolean deleteemployee(int id);
List <EmpPojo> getAllempDeta();
}
