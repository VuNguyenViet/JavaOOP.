package oop;

public class Worker extends Infomation {
    public int seniority ;
    public void infoWorker () {
        this.seniority = 7;
        this.age = 26;
        this.address = "Ho Chi Minh City";
        this.name = "Nguyen Tuan Nhat" ;
    }
    public void printInfo_Worker () {
        System.out.println("Seniority year is  :" + seniority);
        System.out.println("Age is  :" + age);
        System.out.println("Address is  :" + address);
        System.out.println("Name is  :" + name);

    }

}
