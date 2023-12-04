package oop;
public  class Infomation {
//    Luồng xủ lý bắt đầu từ đây, tạo ra 1 đối tượng cha có các thuộc tính mà nhiều đối tượng con cùng có chung
     int age ;
     String name ;
     String address;
//     Khai báo các biến để tạo ra 1 đối tượng có các thuộc tính chung của các đối tượng con
    public void People (int age ,String name, String address   ) {
        this.age = age;
        this.name = name;
        this.address = address;
    };
//    Tạo ra  đối tượng cha thì tạo tiếp các đôi tượng con
//    Lấy đối tượng con tiêu biểu là Staff, cmt sẽ nằm ở đó
}
