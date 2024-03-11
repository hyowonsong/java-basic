package java_basic.Chapter3.ex1;

public class Rectangle {
    public int width;
    public int height;

    public int calculateArea(){
        return width * height;
    }

    public int calculatePerimeter(){
        return 2*(height*height);
    }

    public boolean isSquare(){
        return this.width == this.height;
    }

}
