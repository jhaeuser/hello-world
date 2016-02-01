package newPackage;

public class HelloWorld {


	public static void main (String[] args) {


		
		
		String mystring = "Hello World";
				
		// 
		System.out.print("Hello World \non two lines \t" + mystring );
		
		System.out.print("\r");
		
		int a=50;
		int b=100;
		
		
		switch(a) {
		case 50:System.out.print("fall 50"); break;
		case 100:System.out.print("fall 50"); break;
		}
		
		for(b=0;b<=100;b++) {
			System.out.print(b);
			
		}
		
		System.out.print("\r");
		
		while( b<120 ) {
			System.out.print( "&" );
			b++;		
		}
		
		System.out.print("\r");
		
		int n=1;
		int sum = 0;
		while(n <= 100) {
			sum +=n; 
			System.out.println( sum );
			n++;
		}
		
		System.out.print("\n **** ARRAY **** ");
		
		double []myArray;
		myArray = new double[10];
		for( int m=0; m < myArray.length; m++ ) {
			myArray[m]= Math.pow(m, 2);
			System.out.print( myArray[m] );
			System.out.print("\n");
			
		}
		
		
		
		
		
	}
}
