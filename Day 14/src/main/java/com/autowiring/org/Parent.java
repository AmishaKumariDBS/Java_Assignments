package com.autowiring.org;

public class Parent {
    private Child child;
    public Parent(){
    System.out.println("Default");}
    public Parent (Child child){
        System.out.println("Parameterized");
        this.child = child;

    }
    public Child getChild(){
        System.out.println("Getchild is called");
        return child;
    }
    public void setChild(Child child){
        this.child = child;
    }
    public void showParentDetails() {
        System.out.println("Parent Details are");
        child.showChildDetails();
    }
}
