package mypackeg;

public class DotComTest {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("String 2");
		char[] chars = {'a',' ','s','t','r','i','n','g'};
		String s3 = new String(chars);
		String s4 = new String(chars,2,6);
		byte[] bytes = {0,1,2,3,4,5,6,7,8,9};
		for(char i:chars){
			System.out.println(i);
		}
		
		StringBuffer sb = new StringBuffer(s3);
		String s5 = new String(sb);
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
	}
}
