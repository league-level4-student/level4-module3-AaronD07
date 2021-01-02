/**
 * 
 */
package _01_introduction;

/**
 * @author aaron
 *
 */
public class CustomException extends Exception{
public static void terminate() {
	System.exit(0);
}
public static void testMethod2(int x) throws CustomException {
	if(x<0) {
		throw new CustomException();
	}
}
{

try {
	testMethod2(6);
} catch (Exception e) {
	CustomException.terminate();
	// TODO Auto-generated catch block
	System.out.println("y");
	e.printStackTrace();
}

}
}
