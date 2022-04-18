package Nguoi;

public class Nguoi {
    private String name;
    private int age;
    private String job;
    private int canCuoc;

    public Nguoi() {
    }

    public Nguoi(String name, int age, String job, int canCuoc) {
       this.name = name;
       this.age = age;
        this.job = job;
        this.canCuoc = canCuoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getCanCuoc() {
        return canCuoc;
    }

    public void setCanCuoc(int canCuoc) {
        this.canCuoc = canCuoc;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Job='" + job + '\'' +
                ", canCuoc=" + canCuoc +
                '}';
    }
}
