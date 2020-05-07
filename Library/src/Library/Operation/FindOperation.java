package Library.Operation;

import Library.book.BookList;
import java.util.Scanner;
import Library.book.Book;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        boolean flag = false;
        System.out.println("查找图书！");
        System.out.print("请输入需要查找书籍的名字: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0, size = bookList.getSize(); i < size; ++i){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                flag = true;
                System.out.println(book.toString());
            }
        }
        if(flag == false){
            System.out.println("没有匹配的书籍！");
        }
    }
}
