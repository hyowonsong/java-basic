package java_basic.Chapter4.ex1;

public class Book {
    String title;
    String author;
    int page;

    // 기본생성자
    Book() {
        this("", "", 0);
    }

    // title 과 author 만을 매개변수로 받는 생성자
    // 지금 메서드 오버로딩해서 매개변수를 여러개 생성하였음
    Book(String title, String author) {
        // 여기 this 는 반드시 바로 와야 한다.
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " +
                page);
    }
}