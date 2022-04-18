package akaka;

import java.util.ArrayList;
import java.util.List;


public class qq {
    private String a ;
    private int b;
    private int ab;

    public qq(String a, int b, int ab) {
        this.a = a;
        this.b = b;
        this.ab = ab;
    }

    public qq() {
    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    @Override
    public String toString() {
        return "qq{" +
                "a=" + a +
                ", b=" + b +
                ", ab=" + ab +
                '}';
    }

    public static void main(String[] args) {
        List<qq> qqList =new ArrayList<>();//Khởi tạp
        qqList.add(new qq("Hj",3,4));
        qqList.add(new qq("Nhm",7,99));
        qqList.add(new qq("Hvm",9,5));
        for (int i=0 ;i<qqList.size();i++){
        System.out.println(qqList.get(i));
        }
        qqList.remove(1);//Xóa
        System.out.println(">>>>>>>>>>>>>>>");
        for (int i=0;i<qqList.size();i++) {
            System.out.println(qqList.get(i));
        }
        qqList.set(0,new qq("AS",3,9));//Tạo mới
        System.out.println("PPPPPPPPPPPPPPPPPPP");
        for (int i=0;i<qqList.size();i++) {
            System.out.println(qqList.get(i));
        }
        int indexOf=-1;//Tìm kiếm
        for (int i=0;i<qqList.size();i++) {
            if (qqList.get(i).getA().equals("Hvm")){
                indexOf =i;
            }
        }


    }
}

