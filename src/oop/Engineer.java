package oop;

public class Engineer extends Infomation {
    public String major;

    @Override
    public void People(int age, String name, String address) {
        super.People(age, name, address);
    }
    public  Engineer(int age, String name, String address, String major) {
        super.People(age, name, address);
        this.major = major ;
    }

    public void printInfo_Engineer () {
        System.out.println("Age is:  " + age) ;
        System.out.println("Name is:  " + name );
        System.out.println("Address is:  " + address);
        System.out.println("Major is:  " + major);
    }
}
