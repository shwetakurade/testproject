package string_class;

public class string {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s4="abc abc abc";
		String s3="my name is rahul";
		String s5=" ";
		s4.split("space");
		String[]ar=s4.split("space");
		System.out.println(s1.concat(s2));
		System.out.println(s1+s5+s2+s5+s4);
		System.out.println(s4+s5);
		


		System.out.println(ar[3]);
		System.out.println(ar.length);
		System.out.println("------------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);

		}
		
		
		}

		
	}


