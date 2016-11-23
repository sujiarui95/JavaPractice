package mypackeg;

public class Dog {
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		size = s;
	}
	
	public static void main(String[] args) {
		System.out.println(new Dog().getSize());
	}
}//Dog

