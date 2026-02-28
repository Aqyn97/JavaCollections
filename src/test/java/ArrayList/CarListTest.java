package ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CarListTest {
    private CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarArrayList();
        for(int i  = 0 ; i < 100 ; i++){
            carList.add(new Car("brand" + i  , i));
        }
        //init
    }
    @Test
    public void whenAdded100ElementsThenSizeMustBe100(){
        assertEquals(100 , carList.size());
    }
    @Test
    public void whenElementRemovedByIndexThenSizeMustDecreased(){
        assertTrue(carList.removeAt(5));
        assertEquals(99 , carList.size());
    }
    @Test
    public void whenElementRemovedThenSizeMustDecreased(){
        Car car = new Car("Kia" , 17);
        carList.add(car);
        assertEquals(101 , carList.size());
        carList.removeAt(17);
        assertEquals(100 , carList.size());
    }
    @Test
    public void whenNonExistentElementRemovedThenReturnFalse(){
        Car car = new Car("Kia" , 17);
        assertFalse(carList.remove(car));
        assertEquals(100 , carList.size());
    }
    @Test
    public void whenListClearedThenSizeMustBe0(){
        carList.clear();
        assertEquals(0 , carList.size());
    }
    @Test
    public void whenIndexOutOfBoundsException(){
        assertEquals(100 ,carList.size());
    }
    @Test
    public void methodGetReturnedRightValue(){
        Car car = carList.get(0);
        assertEquals("brand0" , car.getBrand());
    }







}