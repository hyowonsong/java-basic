package java_basic.Chapter9.re_ex1;

public class Book extends Item{      //author, isbn private 관리
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name, price);    // 중요!! super 로 부모 참조
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:" + author + ",isbn" + isbn);
    }

}
