package interfcedemo;

public class Demo {
public static void main(String[] args) {
	
	String str1="abc";
	String str2="abc";
	String str3=new String("intellij");
	
	String intern=str3.intern();
	
	String str4="intellij";
	
	System.out.println(str1==str2);
	
	System.out.println(str3.equals(intern));
	
	System.out.println(str4==intern);
}
}