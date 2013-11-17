/**
 * 
 */

/**
 * @author NeoDoctorK
 *
 */
public class ExceptionTest extends Exception {
	
	private int port;

	public ExceptionTest(int port, String reasion) {
		super(reasion);
		this.port = port;
	}
	
}
