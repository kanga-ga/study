package _01_.quiz;
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog() {
        super("Do"); // 부모 클래스의 생성자를 호출하여 초기화
        System.out.println("Dog created.");
    }
}


public class sss {
    public static void main(String[] args) {
    Dog dog=new Dog();
    }
}
