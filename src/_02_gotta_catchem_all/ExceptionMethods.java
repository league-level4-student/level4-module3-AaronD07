package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double x, double y) {
	double z = x/y;
	return z;
	}
	public static String reverseString(String str) {
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;  
		}  
		
		
}
