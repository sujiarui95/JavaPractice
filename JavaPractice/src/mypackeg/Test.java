package mypackeg;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
/*		String str1 = "str11111";
		System.out.println(str1);		
		tell(str1);
		System.out.println(str1);
		
		Demo demo = new Demo();
		demo.temp = "nisha";
		System.out.println(demo.temp);
		tell(demo);
		System.out.println(demo.temp);
	}
	public static void tell(Demo demo1){
		   demo1.temp = "shenjingbing";
	}
	public static void tell(String str2){
		str2 = "str22222";*/
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
/*		System.out.println("str1 == str2: "+ (str1==str2));
		System.out.println("str1.equals(str3): "+str1.equals(str3));
		
		int beginIndex = 1;
		int num = Integer.valueOf(new String("123").substring(beginIndex)).intValue();
		System.out.println(num);*/
		
		//		
        ArrayList myList = new ArrayList();
        String str4 = new String("Hello");
        //: add str1 to myList
        myList.add(str1);
        System.out.println(myList.size());
        //: String str3 = new String("hello");
        //: myList.contains(str3) = true
        boolean contains = myList.contains(str3);
        System.out.println(contains);
		System.out.println(myList.size());
		
	}
}

