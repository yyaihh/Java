package Library.Operation;

import Library.book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("图书列表:");
        for(int i = 0, size = bookList.getSize(); i < size; ++i){
            System.out.println(bookList.getBook(i).toString());
        }
    }
}
