public class CongNhan extends Infomation {
    public int thamnien ;
    public void congnhan1 () {
        this.thamnien = 7;
        this.age = 26;
        this.address = "TP ho chi minh";
        this.name = "Nguyen Tuan Nhat" ;
    }
    public void PrintCongnhan () {
        System.out.println("Tham nien cua cong nhan 1 la " + thamnien);
        System.out.println("Tuoi cua cong nhan 1 la " + age);
        System.out.println("Dia chi cua cong nhan 1 la " + address);
        System.out.println("Ten cua cong nhan 1 la " + name);

    }

}
