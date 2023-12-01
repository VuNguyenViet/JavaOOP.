package oop;

public class Staff extends Infomation {
   public int staffLevel;
   public void infoStaff () {
       this.staffLevel = 4;
       this.age = 25;
       this.name = "Nguyen Thuy Linh" ;
       this.address =" Back Khoa University" ;
   }
   public  void printInfoStaff () {
       System.out.println("Level is:  " + staffLevel);
       System.out.println("Age is:  " + age);
       System.out.println("Name is:  " + name);
       System.out.println("Address is:  " + address);

   }

}
