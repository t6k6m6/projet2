package StudentsManger;
import java.util.ArrayList;
import java.util.Scanner;
//学生管理系统

public class system {

    static ArrayList<students> stus=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**********学生管理系统**********");
        System.out.println("1     添加学生");
        System.out.println("2     删除学生");
        System.out.println("3     修改学生");
        System.out.println("4     查看学生");
        System.out.println("5     退出系统");


        while (true){
            System.out.println("请选择操作");
            int target=sc.nextInt();
            if(target==1){
                addStudent();
            } else if (target==2) {

                if(stus.size()==0){
                    System.out.println("当前系统没有学生记录。请先添加学生");

                }else{

                    delStudent();

                }

            } else if (target==3) {

                modStudent();


            }else if (target==4){

                allStudent();


            } else if (target==5) {
                System.out.println("退出系统,谢谢使用");
                break;
            }
        }
    }

    //添加学生信息
    public static void addStudent(){
        Scanner sc=new Scanner(System.in);
        //获取输入的学生信息
        System.out.println("请输入下列学生信息");

        System.out.println("学号:");
        String stuno=sc.next();
        if(isExist(stuno)){
            System.out.println("学号以存在，请重新输入");

        }else {
            System.out.println("姓名:");
            String stuname=sc.next();

            System.out.println("年龄:");
            int stuage=sc.nextInt();

            System.out.println("生日:");
            String stubir=sc.next();

            //创建学生
            students s1=new students(stuno,stuname,stuage,stubir);
            stus.add(s1);
        }


        //System.out.println(stus);

    }

    //删除学生信息
    public static void delStudent() {
        Scanner sc = new Scanner(System.in);
        //获取输入的学生信息
        System.out.println("请输入想要删除的学生学号");
        System.out.println("学号:");
        String delno = sc.next();

        //默认想要删除的学生信息不存在
        boolean exist = false;

        for (int i = 0; i < stus.size(); i++) {
            students icestu = stus.get(i);
            if (delno.equals(icestu.getNo())) {
                exist = true;
                stus.remove(i);
                System.out.println("学生信息删除成功");
            }
        }
        if (!exist) {
            System.out.println("不存在该学生");

        }
    }

    public static void modStudent() {
        Scanner sc = new Scanner(System.in);
        //获取输入的学生信息
        System.out.println("请输入想要修改的学生学号");
        System.out.println("学号:");
        String delno = sc.next();

        //默认想要删除的学生信息不存在
        boolean exist = false;

        for (int i = 0; i < stus.size(); i++) {
            students icestu = stus.get(i);
            if (delno.equals(icestu.getNo())) {
                exist = true;
                students sm=stus.get(i);
                System.out.println("请输入修改后学生的姓名");
                String modname = sc.next();
                sm.setName(modname);

                System.out.println("请输入修改后学生的年龄");
                int modage = sc.nextInt();
                sm.setAge(modage);

                System.out.println("请输入修改后学生的生日");
                String modbirthday = sc.next();
                sm.setBirthday(modbirthday);

                System.out.println("学生信息修改成功");
            }
        }
        if (!exist) {
            System.out.println("不存在该学生");

        }
    }

    //查看学生信息
    public static void allStudent(){

        if (stus.size()!=0){
            for (int i=0;i<stus.size();i++){
                stus.get(i).show();
            }
        }else {
            System.out.println("当前系统没有学生记录");
        }
        }

        //判断是否已有当前学号
    public static boolean isExist(String note){
        ArrayList<String> noset=new ArrayList<>();
        Boolean isexist=false;

        if (stus.size()!=0){
            for (int i=0;i<stus.size();i++){
                String nos=stus.get(i).getNo();
                noset.add(nos);
            }

            for (int i=0;i<noset.size();i++){
                String ice=noset.get(i);
                if (note.equals(ice)) {
                    isexist=true;
                }
            }

        }
        return isexist;

    }
}


