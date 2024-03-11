package java_basic.Chapter7.re_ex1;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name){
        System.out.println(name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println(totalCars);
    }

}
