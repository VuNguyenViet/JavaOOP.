package oop;

public class Staff extends Infomation {
//    Khai báo các biến mà sẽ là đặc trưng cho đối tượng con
public int staffLevel;
//Kế thừa từ đối tượng cha qua OverRide
@Override
    public void People(int age, String name, String address) {
        super.People(age, name, address);
    } ;
//Kế thừa được rồi thì ta viết ra 1 đối tượng con mới kế thừa các thuộc tính của đối tượng cha

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
