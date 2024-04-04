package adaptorAssignment;

public class DirectAddThreeAdaptor implements AddThreeAdaptor {
    private IDirectAdd directAdd;

    public DirectAddThreeAdaptor() {
        directAdd = new DirectAdd();
    }

    public int add(int x, int y, int z) {
        return directAdd.directAdd(x, y, z);
    }
}