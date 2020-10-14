package com.springexample.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.springexample.demo.Address;

public class Student{
    private String studName;
    private Address address;
    List<String> projects = new ArrayList<>();
    public Student(){

        System.out.println("default constr student is called");
        Address address = new Address();
    }
    public Student(String studName, Address address)
    {
        super();

        System.out.println("default constr student is called");
        this.studName = studName;
        this.address = address;

    }

    public Student(String s) {
        this.studName =s;

    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address ad) {
        System.out.println("setAddress is called");
        this.address = ad;
    }
    public List<String> getProj(){
        return projects;
    }
    public void setProj(List projects){
        String str="";
        Iterator<String> it =  projects.iterator();
        while(it.hasNext()){
            str+= it.next();
        }

    }
    public String getStudName()
    {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }
    public String toString() {
        return "Student[ name" + studName + "]";
    }
}