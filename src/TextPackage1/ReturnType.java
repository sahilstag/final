package TextPackage1;



public class ReturnType {
	
	public static int add ( int a, int b) {
		int c= a+b;
		return c;
	}
	
		public static void main (String[] args){
		int c=	ReturnType.add(10, 5);
			
			if (c>30) {
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		
	}

}
