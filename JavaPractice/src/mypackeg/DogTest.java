package mypackeg;

public class DogTest {
	public static void main(String[] args) {
		/*Dog dog = new Dog();
		dog.setSize(100);
		System.out.println(dog.getSize());*/
		Dog[] dogs = new Dog[7];
		System.out.println(dogs);//输出dogs数组的地址值
		System.out.println(dogs[1]);//输出null 空指针
	}
	
}
