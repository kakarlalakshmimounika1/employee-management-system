package com.example.bean;

public class EmpPojo {
    
private int empid;
private String name;
private String address;
private long contactnum;
private int age;
private String Bloodgroup;

public int getAge() {
       return age;
}
public void setAge(int age) {
       this.age = age;
}
public int getEmpid() {
       return empid;
}
public void setEmpid(int Empid) {
       this.empid = Empid;
}
public String getName() {
       return name;
}
public void setName(String name) {
       this.name = name;
}
public String getAddress() {
       return address;
}
public void setAddress(String address) {
       this.address = address;
}
public long getContactnum() {
       return contactnum;
}
public void setContactnum(long contactnum) {
       this.contactnum = contactnum;
}

public String getBloodgroup() {
       return Bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
       Bloodgroup = bloodgroup;
}
@Override
public String toString() {
       return "EmployeetBean [empid=" + empid + ", name=" + name + ", address=" + address + ", contactnum=" + contactnum
                     + ", age=" + age + ", Bloodgroup=" + Bloodgroup + "]";
}
}

