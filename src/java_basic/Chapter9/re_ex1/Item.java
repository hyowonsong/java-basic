package java_basic.Chapter9.re_ex1;

public class Item {
    private String name;      // name, price 는 private 관리
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void print(){
        System.out.println("이름:" + name + ", 가격:" + price);
    }

}
