// An implementation of IArrayAdd

package adaptorAssignment;

public class StringAdd implements IStringAdd {

	public int stringAdd(String s, int k) {
		int sum = 0;
		String delim = " ";
		String[] tokens = ((String) s).split(delim);
		for (int i = 0; i < k; i++) {
			sum += Integer.valueOf(tokens[i]);
		}
		return sum;
	}

}
