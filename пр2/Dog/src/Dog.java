public class Dog {
    String name;
    int age;
    public Dog(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void PrintDogInfo(){
        System.out.println("Имя: " + name  + ", Возраст: "  + age+ ", Возраст в человеческих годах: " + toHumanAge());
    }
    public int toHumanAge(){
        return age * 7;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name + " "  + age +  " " + toHumanAge();
    }
}
