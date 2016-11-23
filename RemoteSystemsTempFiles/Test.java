public abstract class Test{
    public static void main(String[] args){
	System.out.println(beforeFinally());
    }

    public static int beforeFinally(){
	int a = 0;
	try{
	    a = 1;
	    return a;
	}finally{
	    a = 2;
	}//finally
    }//try
}//class Test
