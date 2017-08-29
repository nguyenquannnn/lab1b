/**
 * 
 */
package addressbook.app;
import lib.Address;

/**
 * @author 1632647
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address myAddress = new Address("3040", "Sherbrooke");
		System.out.println(myAddress.getAddress());

	}

}
