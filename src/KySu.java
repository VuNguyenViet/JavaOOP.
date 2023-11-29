public class KySu extends Infomation {
    public String chuyenNganh;
    public void kysu1 () {
        this.chuyenNganh = "ky su IT";
        this.age = 27;
        this.name = " Vunguyen";
        this.address= "TP Ho Chi Minh" ;

    }
    public void PrintKysu () {
        System.out.println("Chuyên nghành của Kỹ sư là   " + chuyenNganh);
        System.out.println("Tuổi của kỹ sư là" + age) ;
        System.out.println(" Kỹ sư tên là" + name );
        System.out.println("Địa chỉ ở  " + address);

    }
}
