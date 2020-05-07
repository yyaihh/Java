package Library.Operation;

import java.util.Scanner;
import Library.book.BookList;
import Library.book.Book;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("还书操作");
        System.out.println("请输入你要还的书名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0, size = bookList.getSize(); i < size; ++i){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println(name + "还书成功");
                return;
            }
        }
        System.out.println("还书失败！");
    }
}
