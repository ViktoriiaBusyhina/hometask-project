package generics;

import java.util.List;

public class Box<T> {

    private T value;

    private List<T> list;

    public Box(T value, List<T> list) {
        this.value = value;
        this.list = list;
    }

    public void print() {
        System.out.println(value.getClass());
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
