package CarLinkedTest;

import ArrayList.Car;
import ArrayList.CarList;
import LinkedList.CarLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LinkedTest {
    private CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarLinkedList();
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
    @Test
    public void insertIntoMiddle(){
        Car car = new Car("Bmw" , 1);
        carList.add(car , 50);
        Car carFromList = carList.get(50);
        assertEquals("Bmw" ,  carFromList.getBrand());
    }
    @Test
    public void insertIntoFirstPosition(){
        Car car = new Car("Bmw" , 1);
        carList.add(car , 0);
        Car carFromList = carList.get(0);
        assertEquals("Bmw" ,  carFromList.getBrand());
    }

    @Test
    public void insertIntoLastPosition(){
        Car car = new Car("Bmw" , 1);
        carList.add(car , 100);
        Car carFromList = carList.get(100);
        assertEquals("Bmw" ,  carFromList.getBrand());
    }








}