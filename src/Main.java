class Animals {
    protected int maxRun;
    protected int maxSwim;

    public Animals(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    void run(int distance) {
        if (distance < maxRun) {
            System.out.println("Тварина пробігла "+ distance);
        } else {
            System.out.println("Тварина не може пробігти "+ distance);

        }

    }
    void swim(int distance) {
        if (distance < maxSwim) {
            System.out.println("Тварина проплила " + distance);
        } else if (distance > maxSwim) {
            System.out.println("Тварина не вміє плавати");
        }else {
            System.out.println("Тварина не може проплисти "+ distance);
        }
    }
}
class Cat extends Animals {
 public Cat() {
    super(201,0);
}
}
 public class Main {
     public static void main(String[] args) {
         Cat cat = new Cat();
         cat.run(200);
         cat.run(300);
         cat.swim(200);
     }
 }

