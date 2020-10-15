package com.training.org;
import java.util.List;
import java.util.ArrayList;
public class Employee {
    private Integer empId;
    private String first;
    private String last;
    private Integer salary;
    List<Employee> emp= new ArrayList<>();
    public Employee(Integer empId, String first, String last, Integer salary){
        this.empId = empId;
        this.first = first;
       this.last = last;
        this.salary = salary;

    }
public Integer getEmpId(){return empId;}
public String getFirst(){return first;}
public String getLast(){return last;}
public Integer getSalary(){return salary;}
   public void setEmpId(Integer empId){
        this.empId = empId;
   }
   public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public void setEmployee(ArrayList<Employee> employees)
    {
        this.emp = employees;
    }

    public List<Employee> getAllEmployee()
    {
        return emp;
    }
    public void addEmployee(Employee employee)
    {
        emp.add(employee);
    }
    @Override
    public String toString() {
        return "Employee [id=" + empId + ", name=" + first + last +", salary=" + salary + "]";
    }
}
