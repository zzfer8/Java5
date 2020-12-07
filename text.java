package pack5;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class text {
    public static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public static boolean writetxtfile(String Content, String filepath) {
        boolean flag = false;
        try {
            PrintWriter pw = new PrintWriter(filepath);
            pw.write(Content);
            pw.flush();
            pw.close();
            flag = true;
        } catch (Exception e) {
            //
            e.printStackTrace();
        }
        return flag;
    }
    public static void main(String args[]) {
        File file = new File("C:\\Users\\pc\\Desktop\\A.txt");
        Student abc = new Student();

        System.out.println("请输入姓名：");
        Scanner name = new Scanner(System.in);
        abc.setName(name.nextLine());
        System.out.println("请输入学号：");
        Scanner student_number = new Scanner(System.in);
        abc.setStudent_number(student_number.nextInt());
        System.out.println("请输入年龄：");
        Scanner age = new Scanner(System.in);
        abc.setAge(age.nextLine());
        System.out.println("请输入班级：");
        Scanner class_name = new Scanner(System.in);
        abc.setClass_name(class_name.next());
        System.out.println(abc);
        String s = "";
        char[] chars = txt2String(file).toCharArray();
        for (int i = 2; i < 240; i++) {
            s += chars[i];
            if ((i - 1) % 7 == 0 && (i - 1) % 2 == 0) {
                s += "。" + "\n";
            } else if ((i - 1) % 7 == 0 && (i - 1) % 2 != 0) {
                s += ",";
            }
        }
        try{b:while(true){System.out.println("选择功能：1.查询字或词出现的次数。2.退出程序");
         Scanner zi = new Scanner(System.in);
         int q=zi.nextInt();

        switch (q) {
            case 1:
                System.out.println("输入您想查询的字或词");
                Scanner j = new Scanner(System.in);
                String g = j.next();
                int count = 0;
                int index = 0;
                    while ((index = s.indexOf(g, index)) != -1) {
                        index = index + g.length();
                        count++;
                    }
                    System.out.println(g + "出现的次数：" + count);
                break;
            case 2:break b;
            default:
                System.out.println("请输入1或2选择功能");
        }}}
        catch(Exception w){
            System.out.println("请输入数字选择功能！！！");
        }
        writetxtfile(abc+s, "C:\\Users\\pc\\Desktop\\B.txt");

    }
}
