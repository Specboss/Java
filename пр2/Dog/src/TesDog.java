public class TesDog {
    public static void main(String[] args){
        Dog d1 = new Dog(5, "Бобик");
        Dog d2 = new Dog(6, "Алтай");
        Dog d3 = new Dog(7, "Мухтар");
        Dog d4 = new Dog(8, "Шарик");
        Nursery n = new Nursery();;
        n.addDog(d1, d2, d3, d4);
        n.printDogs();
    }
}