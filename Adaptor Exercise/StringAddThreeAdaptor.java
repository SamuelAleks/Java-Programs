package adaptorAssignment;

public class StringAddThreeAdaptor implements AddThreeAdaptor {
    private IStringAdd stringAdd;

    public StringAddThreeAdaptor() {
        stringAdd = new StringAdd();
    }

    public int add(int x, int y, int z) {
        String s = x + " " + y + " " + z;
        return stringAdd.stringAdd(s, 3);
    }
}