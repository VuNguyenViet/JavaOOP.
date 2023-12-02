package oop;

public class Staff extends Infomation {
public int staffLevel;
@Override
    public void People(int age, String name, String address) {
        super.People(age, name, address);
    } ;
    public Staff(int age, String name, String address, int staffLevel) {
        super.People(age,name ,address);
        this.staffLevel = staffLevel ;
    }
    public void printInfoStaff() {
        // In thông tin của đối tượng Staff
        System.out.println("Age is:  " + age);
        System.out.println("Name is:  " + name);
        System.out.println("Address is:  " + address);
        System.out.println("Level is:  " + staffLevel);
    }
}
