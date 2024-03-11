package java_basic.Chapter11;

import java_basic.Chapter11.ex2.Animal;
import java_basic.Chapter11.ex2.Cat;
import java_basic.Chapter11.ex2.Caw;
import java_basic.Chapter11.ex2.Dog;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
