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
		
		int arr[]={10,20,30};
		int num = arr.length;
		System.out.println( num );
	}
}
