package adaptorAssignment;

public class ArrayAddThreeAdaptor implements AddThreeAdaptor {
    private IArrayAdd arrayAdd;

    public ArrayAddThreeAdaptor() {
        arrayAdd = new ArrayAdd();
    }

    public int add(int x, int y, int z) {
        int[] a = { x, y, z };
        return arrayAdd.arrayAdd(a, 3);
    }
}