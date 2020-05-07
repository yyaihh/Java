package Library.User;

import Library.Operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name){
        this.name = name;
        this.operations = new IOperation[] {
                (IOperation) new ExitOperation(),
                (IOperation) new FindOperation(),
                (IOperation) new AddOperation(),
                (IOperation) new DelOperation(),
                (IOperation) new DisplayOperation(),
        };
    }

    @Override
    public int menu(){
        int choice;
        System.out.println("======================");
        System.out.println("Hello 管理员 " + this.name + ", 欢迎使用图书馆管理系统！");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示所有图书");
        System.out.println("0. 退出系统");
        System.out.println("======================");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        for(choice = scanner.nextInt(); choice < 0 || choice > 4; choice = scanner.nextInt());
        return choice;
    }
}
