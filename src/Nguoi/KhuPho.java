package Nguoi;

import java.util.ArrayList;

public class KhuPho {
    private ArrayList<HoGiaDinh>hoGiaDinhs;
    public KhuPho(){
        this.hoGiaDinhs=new ArrayList<HoGiaDinh>();

    }
    public KhuPho(ArrayList<HoGiaDinh>hoGiaDinhs){
        this.hoGiaDinhs=hoGiaDinhs;

    }
    public void add(HoGiaDinh hoGiaDinh) {
        this.hoGiaDinhs.add(hoGiaDinh);


    }
    public void display(){
        for (int i=0;i<hoGiaDinhs.size();i++){
            System.out.println(this.hoGiaDinhs.get(i));
        }
    }

}
