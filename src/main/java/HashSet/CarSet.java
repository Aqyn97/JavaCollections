package HashSet;

import ArrayList.Car;

public interface CarSet {
    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();
}
