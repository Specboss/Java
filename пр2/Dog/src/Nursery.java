import java.util.ArrayList;

public class Nursery {
ArrayList<Dog> dogs;
public Nursery(){
    dogs = new ArrayList<>();
}
    public void addDog(Dog... dogs){
        for (Dog d: dogs
             ) {
            this.dogs.add(d);
        }
    }
    public void printDogs(){
        for(Dog d : dogs){
            d.PrintDogInfo();
        }
    }
}
