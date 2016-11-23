public class Test{
    public static void main(String[] args){
	boolean result;
	//通过new调用构造器创建两个String实例
	String str1 = new String("Hello");
	String str2 = new String("Hello");
	
	//两个实例不相等，因为每次new都创建一个新指针
	System.out.println("两个内容相同的字符串new出的String实例是否相等: "+(str1 == str2));

	String str3 = "Hello";
	String str4 = "Hello";
	System.out.println("直接赋值相同内容字符串给两个String变量时是否相等:"+(str3 == str4));
    }
}



