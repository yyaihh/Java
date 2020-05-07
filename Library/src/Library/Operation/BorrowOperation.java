package Library.Operation;

import Library.book.Book;
import Library.book.BookList;
import java.util.Scanner;
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("结束操作！");
        System.out.print("请输入需要借的书籍: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i = 0, size = bookList.getSize(); i < size; ++i){
            Book tmp = bookList.getBook(i);
            if(tmp.getName().equals(name)){
                if(tmp.isBorrowed() == false){
                    tmp.setBorrowed(true);
                    System.out.println("借书成功！");
                    return;
                }
            }
        }
        System.out.println("没有匹配的书籍！借书失败！");
    }
}
