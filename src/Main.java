class Animals {
    protected int maxRun;
    protected int maxSwim;

    public Animals(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    void run(int distance) {
        if (distance < maxRun) {
            System.out.println(getClass().getSimpleName()+" пробігла "+ distance);
        } else {
            System.out.println(getClass().getSimpleName()+" не може пробігти "+ distance);

        }

    }
    void swim(int distance) {
        if (distance < maxSwim) {
            System.out.println(getClass().getSimpleName()+" проплила " + distance);
        } else if (distance > maxSwim) {
            System.out.println(getClass().getSimpleName()+" не може проплисти "+ distance);
        }else if (distance == 0) {
            System.out.println(getClass().getSimpleName()+" не вміє плавати");
        }
    }
}
class Cat extends Animals {
 public Cat() {
    super(201,0);
}
}
class Dog extends Animals {
    public Dog() {
        super(501,11);
    }
}
 public class Main {
     public static void main(String[] args) {
         Cat cat = new Cat();
         Dog dog = new Dog();
         cat.run(200);
         cat.run(300);
         cat.swim(0);
         dog.run(200);
         dog.swim(18);
         cat.swim(200);
     }
 }

