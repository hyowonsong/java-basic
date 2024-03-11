package java_basic.Chapter10.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = new Child();
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;     // 실행 오류 발생(Child 인스턴스 없음)
        child2.childMethod();
    }
}
