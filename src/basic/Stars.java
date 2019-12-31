package basic;

public class Stars {
	
	public static void main(String[] args) {
		
		//increasing stars
	/*	
		for(int i =1 ; i<=5;i++) {
			for(int j =1 ;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println("");
			//System.out.println("=");
		}*/
		
	//reducing stars
		
	/*	for(int i =1 ; i<=5;i++) {
			for(int j =5 ;j>=i;j-- ) {
				System.out.print("*");
			}
			System.out.println("");
			//System.out.println("=");
		}
		*/

		
		
	//sridhar program	--triangle program
		
	/*	int a=5;
		for(int i=5;i>=0;i--) {
			
			for(int k=1; k<=a-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}*/   //---end
		
	
		// reducing stars with space increasing infront of stars in each row
		
	 /* for(int i =1 ; i<=5;i++) {
			for(int k=2; k<=i;k++) {
				System.out.print(" ");
			}
			for(int j =5 ;j>=i;j-- ) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
		*/
		
		
		//triangle program
		
	/*	for(int i =1 ; i<=5;i++) {
			for(int k=1; k<=i;k++) {
				System.out.print(" ");
			}
			for(int j =5 ;j>=i;j-- ) {
				
				System.out.print("* ");
			}
			System.out.println("");

		}*/
		
		
		// stars increasing with space decreasing infront of stars in each row
		
		 for(int i =1 ; i<=5;i++) {
		for(int k=5; k>=i;k--) {
			System.out.print(" ");
		}
		for(int j =1 ;j<=i;j++) {
			
			System.out.print("*");
		}
		
		System.out.println("");
	}
		
	}

}
