package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Infomation woker:");
        Worker Info_Worker = new Worker();
        Info_Worker.infoWorker();
        Info_Worker.printInfo_Worker();

        System.out.println("2.Infomation Staff:");
        Staff Info_Staff = new Staff() ;
        Info_Staff.infoStaff();
        Info_Staff.printInfoStaff();

        System.out.println("3.Infomation Engineer:");
        Engineer Info_Engineer = new Engineer();
        Info_Engineer.infoEngineer();
        Info_Engineer.printInfo_Engineer();
    }
    }
