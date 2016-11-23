package mypackeg;

public class SimpleConstructor {
	public SimpleConstructor() {
		// TODO Auto-generated constructor stub
	System.out.println("Hah~");
	}
	int size;
	float price;
	void showSize(){	
		System.out.println(this.size);
	}
	public float getPrice(float p) {
		p = this.price;
		return p;
	}
	
	
	public static void main(String[] args) {
		SimpleConstructor simpleConstructor = new SimpleConstructor();
		simpleConstructor.size = 10;
		simpleConstructor.showSize();
		
		float p = 0 ;
		simpleConstructor.price = 100;
		p = simpleConstructor.getPrice(p);
		System.out.println(p);
	}
}
