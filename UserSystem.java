package mySql.day06.AnLi;

import java.util.Scanner;

public class UserSystem {
    private static UserService userService = new UserService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--欢迎使用--");
        while (true){
            if(register()){
                break;
            }
        }
    }

    //注册的方法
    private static boolean register(){
        System.out.println("请输入注册信息");
        System.out.println("用户名：");
        String name = scanner.next();
        if(userService.isExist(name)){
            System.out.println("用户名已经存在");
            return false;
        }
        System.out.println("密码：");
        String password = scanner.next();
        //封装数据
        User user = new User(name,password);
        if(userService.register(user)){
            System.out.println("注册成功");
            return true;
        }else {
            System.out.println("注册失败");
            return false;
        }
    }
}
