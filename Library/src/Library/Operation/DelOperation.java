package Library.Operation;

import Library.book.BookList;
import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除书籍的名称: ");
        String name = scanner.next();
        int i = 0, size = bookList.getSize();
        for(; i < size; ++i){
            if(bookList.getBook(i).getName().equals(name)){
                break;
            }
        }
        if(i >= size){
            System.out.println("没有找到所要删除的书籍！");
            return;
        }
        bookList.setBook(i, bookList.getBook(size - 1));
        bookList.setSize(size - 1);
        System.out.println("删除成功！");
    }
}
