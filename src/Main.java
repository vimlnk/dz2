class Animals {
    static int totalAn = 0;

    Animals(){
        totalAn++;
    }
    void run(int distance){
        System.out.println("Тварина пробігла "+ distance +"м.");
    }
    void swim(int distance){
        System.out.println("Тварина проплила "+ distance+ "м.");
    }
}
class Cat extends Animals {

}
class Dog extends Animals{

}