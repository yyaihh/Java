package Library.Operation;

import Library.book.Book;
import Library.book.BookList;
import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("新增书籍");
        System.out.print("请输入书名: ");
        String name = scanner.next();
        System.out.print("请输入作者: ");
        String author = scanner.next();
        System.out.print("请输入价格: ");
        int price = scanner.nextInt();
        System.out.print("请输入种类: ");
        String type = scanner.next();
        Book book = new Book(name, author, price, type,false);
        int pos = bookList.getSize();
        bookList.setBook(pos, book);
        bookList.setSize(pos + 1);
        System.out.println("新增图书成功！");
    }
}
