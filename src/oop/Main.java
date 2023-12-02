package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Infomation woker:");
        Worker Info_Worker = new Worker(27, "Nguyen Tuan Nhat", "Tp Ho Chi Minh", 7 );
        Info_Worker.printInfo_Worker();

        System.out.println("2.Infomation Staff:");
        Staff Info_Staff = new Staff(22,"Nguyen Thuy Linh", "Dai Hoc Bạck khoa", 7 ) ;
        Staff Info_Staff2 = new Staff(25, "Nguyen Van A", "Dai hoc kinh te", 6) ;
        Info_Staff.printInfoStaff();
        Info_Staff2.printInfoStaff();

        System.out.println("3.Infomation Engineer:");
        Engineer Info_Engineer = new Engineer(27, "Nguyen Viet Vu", "Tp Ho Chi Minh", "IT Engineer");
        Info_Engineer.printInfo_Engineer();
    }
    }
