package java_basic.Chapter9.super1;

public class Child extends Parent {
    public String value = "child";
    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능
        System.out.println("super value = " + super.value); // 부모 참조
        this.hello(); //this 생략 가능
        super.hello();
    }

    public void childMethod() {
    }
}