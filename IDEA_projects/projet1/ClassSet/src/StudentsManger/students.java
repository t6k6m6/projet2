package StudentsManger;

public class students {
    private String no;
    private String name;

    private int age;
    private String birthday;

    public students() {
    }

    public students(String no, String name, int age, String birthday){
        this.no=no;
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void show(){
        String sname=getName();
        String sno=getNo();
        int sage=getAge();
        String sbirthday=getBirthday();
        System.out.println(sno+" "+sname+" "+sage+" "+sbirthday);
    }

}
