public class NhanVien extends Infomation {
   public int level;
   public void nhanvien1 () {
       this.level = 4;
       this.age = 25;
       this.name = "Nguyen Thuy Linh" ;
       this.address =" Dai Hoc Bach Khoa" ;
   }
   public  void PrintNhanvien () {
       System.out.println("Level la" + level);
       System.out.println("Tuoi la    " + age);
       System.out.println("Ten la" + name);
       System.out.println("Dia chi la" + address);

   }

}
