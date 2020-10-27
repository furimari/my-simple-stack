package tp2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getV1() {
        //GIVEN a new item
        Item i = new Item(1,2);
        //WHEN doing nothing,
        //THEN getV1 should return 1
        assertEquals(i.getV1(),1);
    }

    @Test
    public void getV2() {
        //GIVEN a new item
        Item i = new Item(1,2);
        //WHEN doing nothing,
        //THEN getV2 should return 2
        assertEquals(i.getV2(),2);
    }

    @Test
    public void setV1() {
        //GIVEN a new item
        Item i = new Item(0,0);
        //WHEN setting v1 to 5
        i.setV1(5);
        //THEN getV1 should return 5
        assertEquals(i.getV1(),5);
    }

    @Test
    public void setV2() {
        //GIVEN a new item
        Item i = new Item(0,0);
        //WHEN setting v2 to 5
        i.setV2(5);
        //THEN getV1 should return 5
        assertEquals(i.getV2(),5);
    }
}