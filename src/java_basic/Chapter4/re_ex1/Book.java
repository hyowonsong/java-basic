package java_basic.Chapter4.re_ex1;

public class Book {
    String title;
    String author;
    int page;

    // 기본생성자
    Book() {
        this("", "", 0);
    }


    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " +
                page);
    }
}
