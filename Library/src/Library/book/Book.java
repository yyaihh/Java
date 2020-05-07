package Library.book;

public class Book {
    private String name;
    private String author;
    private String type;
    private int price;
    private boolean isBorrowed = false;

    public Book(String name, String author, int price, String type, boolean isBorrowed){
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    public String toString(){
        String ret = "《" + name + "》 - 作者: " + author + " - 类型: " + type + " - 价格: " + price + " - 状态: ";
        if(isBorrowed){
            ret += "已借";
        } else{
            ret += "未借";
        }
        return ret;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}