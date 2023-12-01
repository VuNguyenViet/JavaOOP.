package oop;

public class Engineer extends Infomation {
    public String major;
    public void infoEngineer () {
        this.major = "IT engineer";
        this.age = 27;
        this.name = " Nguyen Viet Vu";
        this.address= "Ho Chi Minh City" ;

    }
    public void printInfo_Engineer () {
        System.out.println("Major is:  " + major);
        System.out.println("Age is:  " + age) ;
        System.out.println("Name is:  " + name );
        System.out.println("Address is:  " + address);

    }
}
