package java_basic.Chapter9.re_ex1;

public class Album extends Item {
    private String artist;
    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}