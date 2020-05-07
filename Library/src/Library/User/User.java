package Library.User;

import Library.book.BookList;
import Library.Operation.*;

abstract public class User {
    protected String name = null;
    protected IOperation[] operations = null;

    abstract public int menu();

    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
}
