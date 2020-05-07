package Library;

import java.util.Scanner;
import Library.User.*;
import Library.book.*;

public class Main {
    public static void main(String[] args){
        BookList bookList = new BookList();
        User user = login();
        while(true){
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的姓名: ");
        String name = scanner.next();
        System.out.println("请选择您的身份，1表示普通用户，0表示管理员");
        int choice  = 0;
        for(choice = scanner.nextInt(); choice != 0 && choice != 1; choice = scanner.nextInt());
        if(choice == 1){
            return new NormaUser(name);
        }
        return new Admin(name);
    }
}
