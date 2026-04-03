package HashSet;

import ArrayList.Car;
import ArrayList.CarArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSetTest {

    private CarSet carSet;

    @BeforeEach
    void setUp() {
        for(int i  = 0 ; i < 100 ; i++){
            carSet.add(new Car("brand" + i  , i));
        }
        //init
    }

    @Test
    void whenAdded3ObjectsThenSizeIncreasedBy1() {
        assertEquals(100 , carSet.size());
        Car car1 = new Car("mma" , 2);
        Car car2 = new Car("mma" , 2);
        Car car3 = new Car("mma" , 2);
        assertTrue(carSet.add(car1));
        assertFalse(carSet.add(car2));
        assertFalse(carSet.add(car3));
        assertEquals(101 , carSet.size());
    }

    @Test
    void WhenRemovedObjectThenSizeMustBeDecreased() {
        Car car1 = new Car("mma" , 2);
        assertEquals(100 , carSet.size());
        assertTrue(carSet.remove(car1));
        assertEquals(99 , carSet.size());
        assertFalse(carSet.remove(car1));
        assertEquals(99 , carSet.size());

    }

    @Test
    void size() {
    }

    @Test
    void WhenSetClearedThenSize0() {
        carSet.clear();
        assertEquals(0  , carSet.size());
    }
}