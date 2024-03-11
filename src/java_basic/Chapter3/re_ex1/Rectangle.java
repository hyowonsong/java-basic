package java_basic.Chapter3.re_ex1;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width+ height);
    }

    boolean isSquare(){
        return this.width == this.height;
    }
}
