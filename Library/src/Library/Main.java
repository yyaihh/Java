package Library;

import java.util.Scanner;
import Library.User.*;
import Library.book.*;
import Library.Exception.*;

public class Main {
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args){
        BookList bookList = new BookList();
        User user = null;
        try{
            user = login();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        } catch (UserError userError) {
            userError.printStackTrace();
        }
        while(true){
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
    public static User login() throws UserError, PasswordError{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您的身份，1表示普通用户，0表示管理员");
        int choice  = 0;
        for(choice = scanner.nextInt(); choice != 0 && choice != 1; choice = scanner.nextInt());
        System.out.print("请输入您的姓名: ");
        String name = scanner.next();
        if(choice == 1){
            return new NormaUser(name);
        }
        if (!Main.userName.equals(name)) {
            throw new UserError("用户名错误, 退出系统！");
        }
        System.out.print("请输入管理员密码: ");
        String password = scanner.next();
        if (!Main.password.equals(password)) {
            throw new PasswordError("密码错误，退出系统！");
        }
        return new Admin(name);
    }
}
