package oop;
import java.util.ArrayList;
import java.util.List;

public class Worker extends Infomation {
    public int seniority ;
    @Override
    public void People(int age, String name, String address) {
        super.People(age, name, address);
    }
    public Worker (int age, String name, String address, int seniority) {
        super.People(age,name,address);
        this.seniority = seniority;
    }
    public void printInfo_Worker () {
        System.out.println("Age is  :" + age);
        System.out.println("Name is  :" + name);
        System.out.println("Address is  :" + address);
        System.out.println("Seniority year is  :" + seniority);
    } ;


}
