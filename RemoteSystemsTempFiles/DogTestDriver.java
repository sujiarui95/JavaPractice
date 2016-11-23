class Dog{
    int size;
    String breed;
    String name;

    void bark(){
	System.out.println("WangWang!");
    }

    void size(){
	System.out.println("The size of my dog is " + size);
    }
}

public class DogTestDriver{
    public static void main(String[] args){
	Dog mydog = new Dog();
	mydog.size = 2333;
	mydog.bark();
	mydog.size();
    }
}
