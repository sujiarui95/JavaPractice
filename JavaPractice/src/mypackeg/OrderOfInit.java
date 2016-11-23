package mypackeg;


//Demonstrates initialization order.

//When the constructor is called to create a
//Window object, you'll see a message:
/*class Window {
Window(int marker) { System.out.println("Window(" + marker + ")"); }
}

class House {
Window w1 = new Window(1); // Before constructor
House() {
 // Show that we're in the constructor:
 System.out.println("House()");
 w3 = new Window(33); // Reinitialize w3
}
Window w2 = new Window(2); // After constructor
void f() { System.out.println("f()"); }
Window w3 = new Window(3); // At end
}

public class OrderOfInit {
public static void main(String[] args) {
 House h = new House();
 h.f(); // Shows that construction is done
}
}*/

class Window{
	Window(int marker){System.out.println("Window(" + marker +")");}
}
class House{
	Window w1 = new Window(1);
	House(){
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f(){System.out.println("f()");}
	Window w3 = new Window(3);
}

public class OrderOfInit{
	public static void main(String[] args) {
		House house = new House();
		house.f();
	}
}