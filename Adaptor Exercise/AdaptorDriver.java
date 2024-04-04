// A simple adaptor assignment that adds three integers.  
// Three different services IDirectAdd and IArrayAdd, and IStringAdd 
// with different interfaces are used.  
// The message passed to the service is add(k, m, n) regardless of which 
// interface being used.

package adaptorAssignment;

public class AdaptorDriver {

	public static void main(String[] args) {

		int k = 18;
		int m = 37;
		int n = 5;

		// With Adaptor, the message is always add(k, m, n)
		AddThreeAdaptor addThree;

		// Use IDirectAdd service
		addThree = new DirectAddThreeAdaptor();
		System.out.println(addThree.add(k, m, n));

		// Use IArrayAdd service
		addThree = new ArrayAddThreeAdaptor();
		System.out.println(addThree.add(k, m, n));

		// Use IStringAdd service
		addThree = new StringAddThreeAdaptor();
		System.out.println(addThree.add(k, m, n));

	}
}
