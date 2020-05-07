package Library.User;

import Library.Operation.*;
import java.util.Scanner;

public class NormaUser extends User{
    public NormaUser(String name){
        this.name = name;
        this.operations = new IOperation[] {
                (IOperation) new ExitOperation(),
                (IOperation) new FindOperation(),
                (IOperation) new BorrowOperation(),
                (IOperation) new ReturnOperation()
        };
    }

    @Override
    public int menu(){
        int choice = 0;
        System.out.println("======================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书馆管理系统！");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("======================");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        for(choice = scanner.nextInt(); choice < 0 || choice > 3; choice = scanner.nextInt());
        return choice;
    }
}
