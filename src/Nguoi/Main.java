package Nguoi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HoGiaDinh hoGiaDinh=new HoGiaDinh();
        Nguoi nguoi1= new Nguoi("manh",22,"sv",312);
        Nguoi nguoi2 =new Nguoi("nam",29,"Cong nhan",119);
        Nguoi nguoi3 =new Nguoi("Nhan",25,"Gay",161);
        Nguoi nguoi4 =new Nguoi("ngu",23,"Cong",511);
        Nguoi nguoi5 =new Nguoi("dan don",20,"Tho lam banh",211);
        hoGiaDinh.setAddress("So 2 ngo 151");
        hoGiaDinh.setMemberAmount(7);
        hoGiaDinh.addMember(nguoi1);
        hoGiaDinh.addMember(nguoi2);
        hoGiaDinh.addMember(nguoi3);
        hoGiaDinh.addMember(nguoi4);
        hoGiaDinh.addMember(nguoi5);
        hoGiaDinh.Display();
        System.out.println("________________________");
        hoGiaDinh.Xoa(119);
        hoGiaDinh.Display();
        System.out.println("________________________");
        hoGiaDinh.fix(312,nguoi1);
        hoGiaDinh.Display();
        System.out.println("________________________");




    }
}
