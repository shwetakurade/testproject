package string_class;

public class string3 {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is rahul";
		String s4="abcabcabc";
		String s5=" ";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println(s1.substring(3,6));
		System.out.println(s1.substring(4));
		System.out.println(s5.isEmpty());
		System.out.println(s3.startsWith("my"));
		
		System.out.println("------------");
		
		
	}

}
