package com.training.org;
import org.springframework.stereotype.Repository;

import com.training.org.Employee;
import com.training.org.Employees;

@Repository
public class UpdateEmployee
{
    private static Employees list = new Employees();

    static
    {
        list.getEmployeeList().add(new Employee(1, "a", "b", 100));
        list.getEmployeeList().add(new Employee(2, "c", "sam", 20000));
        list.getEmployeeList().add(new Employee(3, "D", "gjfkd", 200));
    }

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}

