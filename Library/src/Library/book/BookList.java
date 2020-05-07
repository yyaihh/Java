package Library.book;

public class BookList {
    private Book[] books = new Book[100];
    private int size = 0;

    public BookList(){
        //测试数据
        books[0] = new Book("三国演义","罗贯中", 88, "小说", false);
        books[1] = new Book("红楼梦","曹雪芹", 88, "小说", true);
        books[2] = new Book("西游记","吴承恩", 88, "小说", false);
        books[3] = new Book("水浒传","施耐庵", 88, "小说", true);
        size = 4;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(int pos, Book book){
        books[pos] = book;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

}