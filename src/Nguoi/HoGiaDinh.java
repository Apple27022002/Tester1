package Nguoi;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    private String Address;
    private int memberAmount;
    private ArrayList<Nguoi> giaDinh;

    public HoGiaDinh() {
        this.giaDinh = new ArrayList<Nguoi>();
    }

    public HoGiaDinh(ArrayList<Nguoi> giaDinh, String address, int memberAmount) {
        this.giaDinh = giaDinh;
        Address = address;
        this.memberAmount = memberAmount;

    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMemberAmount() {
        return memberAmount;
    }

    public void setMemberAmount(int memberAmount) {
        this.memberAmount = memberAmount;
    }

    public void add(Nguoi Nguoi) {
        this.giaDinh.add(Nguoi);
    }

    public void Display() {
        for (int i = 0; i < this.giaDinh.size(); i++) {
            System.out.println(this.giaDinh.get(i));
        }
        System.out.println("Dia Chi la " + this.getAddress() + " , So thanh vien la " + getMemberAmount());
    }

    public int search(int canCuoc) {
        for (int i = 0; i < this.giaDinh.size(); i++) {
            if (giaDinh.get(i).getCanCuoc() == canCuoc) {
                return i;

            }

        }

        return -1;
    }

    public void fix(int canCuoc,
                    Nguoi nguoi){
        int indexOfCanCuoc=search(canCuoc);
        if (indexOfCanCuoc==-1){
            System.out.println("THanh vien khong ton tai");
        }
        else {
            giaDinh.set(indexOfCanCuoc,nguoi);
        }
    }
    public void Xoa(int canCuoc){
        int indexOfCanCuoc=search(canCuoc);
        if (indexOfCanCuoc==-1){
            System.out.println("Not real");
        }
        else {
            giaDinh.remove(indexOfCanCuoc);
        }
    }
    public void addMember(Nguoi nguoi) {
        this.giaDinh.add(nguoi);


    }

}