package TextPackage1;

public class Nonprimetiveaaray2 {

	public static void main (String[] args ) {
		// seema, ravi, ram , sham
	String a = "s";
		String b= "ram";
		String c="sham";
		System.out.println(c);
				System.out.println(b);
		System.out.println(a);
		
		String [] i = {"pratic","sali","rohit"};
		System.out.println(i[0]);
		System.out.println(i[2]);
		
		String j[]= {"aaa","bb","ccc"};
		System.out.println(j[2]);
	System.out.println(j[0]);
		
		String k[]= new String [5];
		k[0]="ddd";
		k[4]="fff";
		
		System.out.println(k[0]);
		
		int len = i.length;
		for (int y = 0 ; y<=len-1; y++)
		{
			System.out.println(i[y]);
		}
		System.out.println(len);
	}
	
}
