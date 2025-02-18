package com.mindsprint.project1.oops;

public class EmployeeUsage {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Jhon",1150000);
        System.out.println(e1);
        Employee e2 = new Employee();
        e2.setId(1002);
        e2.setName("Tets");
        e2.setSalary(100000);
        System.out.println("Id: "+e2.getId()+"\nName: "+e2.getName()+"\nSalary: "+e2.getSalary());
    }
}
