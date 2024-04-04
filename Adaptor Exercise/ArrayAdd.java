// An implementation of IArrayAdd

package adaptorAssignment;

public class ArrayAdd implements IArrayAdd {

	public int arrayAdd(int a[], int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}
		return sum;
	}

}
