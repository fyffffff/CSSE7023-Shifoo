package genericsclass;

// write your code here
public class Pair<T1 extends Object, T2 extends Object> {
    private final T1 obj1;
    private final T2 obj2;

    public Pair(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T1 getFirst() {
        return this.obj1;
    }

    public T2 getSecond() {
        return this.obj2;
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(this.obj1.toString(), this.obj2.toString());
    }
}