package com.qb;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExamOne {
//    int x;
    public static void main(String[] args) {
      /*  String friends[] = {"lisa","mike","tom"};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(friends[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index err ");
        }
        System.out.println("\nthis is the end");*/

        /*int y;
        TestExamOne c = new TestExamOne();
        try {
            y = 3/c.x;
        }catch(ArithmeticException e){
            System.out.println("divide by zero error!");
        }
        System.out.println("program ends ok!");*/
      /*  try {
            String str1 = "cug";
            str1 = null;
            System.out.println(str1.charAt(0));
        }catch (NullPointerException e){
            //异常处理方式1
            System.out.println("不好意思在加紧处理");
        }catch (ClassCastException e){
            //异常处理方式2
            System.out.println("在处理");
        }catch (RuntimeException e){
            System.out.println("处理");
        }
        System.out.println("hello");*/
       /* 当try代码块出现异常时,将直接跳到catch里面匹配，异常下面的代码块将不会再执行
       Scanner input = new Scanner(System.in);
        try{
            System.out.println("请输入第一个整数:");
            int a = input.nextInt();
            System.out.println("请输入第二个整数:");
            int b = input.nextInt();
            int result = a/b;
            System.out.println(a +"/"+ b + "=" + result);
        }catch (InputMismatchException e){
            System.out.println("数字格式不正确,请输入两个整数");
        }catch (ArithmeticException e){
            System.out.println("第二个整数不能为0");
        }finally {
            System.out.println("程序结束,释放资源");
            input.close();
        }


    }*/
        int result = test("a");
        System.out.println(result);
    }
        public static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test 结束");
            return 3;
        }
    }
}
