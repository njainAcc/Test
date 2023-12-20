package testJava;

import java.io.FileNotFoundException;



class B {
    public void foo()  {

    }
}

interface A1 {
  //  void foo() throws IOException;
}

@FunctionalInterface
interface test1{
	int sum(int a, int b);
/*	public default String temp() {
		System.out.println("default method");
		return "hello";
	}
	*/
}


class A  implements test1  {
//extends B {
//    public void foo()throws RuntimeException{

  //  }
    
    public static void main(String[] args)
    {
    	
    //	test1 t = (a,b) ->(a+b);
    	//System.out.println(t.sum(2, 3));
    	
    }

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
