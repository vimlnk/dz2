class Animals {
    protected int maxRun;
    protected int maxSwim;
    static int countAn =0;
    private String name;

    public Animals(int maxRun, int maxSwim, String name) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.name = name;
        countAn++;

    }

    public String getName() {
        return name;
    }

    void run(int distance) {
        if (distance < maxRun) {
            System.out.println(getName()+" пробігла "+ distance + " м.");
        } else {
            System.out.println(getName()+" не може пробігти "+ distance+ " м.");

        }

    }
    void swim(int distance) {
        if (distance < maxSwim) {
            System.out.println(getName()+" проплила " + distance+ " м.");
        } else if (distance > maxSwim) {
            System.out.println(getName()+" не може проплисти "+ distance+ " м.");
        }else if (distance == 0) {
            System.out.println(getName()+" не вміє плавати");
        }
    }
    public static int setCountAn() {
        return countAn;
    }
}
class Cat extends Animals {
    private static int catsCount= 0;

    public Cat(String name) {
    super(201,0,name);
    catsCount++;
}
public int getCatsCount() {
    return catsCount;
}

}
class Dog extends Animals {
   private static int dogsCount= 0;

    public Dog(String name) {
        super(501,11,name);
        dogsCount++;
    }
    public int getDogsCount() {
        return dogsCount;
    }


}
 public class Main {
     public static void main(String[] args) {
         Cat cat = new Cat("Кіт Mурзик");
         Dog dog = new Dog("Cобака Бобік");
         Cat cat2 = new Cat("Кіт Мурчик");
         Cat cat3 = new Cat("Кіт Cніжинка");
         Dog dog1 = new Dog("Собака Рекс");
         Dog dog2 = new Dog("Собака Мейсі");
         Dog dog3 = new Dog("Собака Грейсі");
         cat2.run(300);
         cat.run(200);
         cat3.swim(0);
         dog.run(400);
         dog1.run(600);
         dog3.swim(9);
         dog2.swim(18);

         System.out.println("Кількість котиків: "+cat.getCatsCount());
         System.out.println("Кількість собачок: "+dog.getDogsCount());
         System.out.println("Загальна кількість тварин:  "+ Animals.setCountAn());
     }
 }

