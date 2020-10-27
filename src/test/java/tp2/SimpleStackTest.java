package tp2;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {


    @Test
    public void isEmpty() {
        //GIVEN an empty stack
        SimpleStack s = new SimpleStack();
        //WHEN we do nothing,
        //THEN isEmpty should be true
        assertTrue(s.isEmpty());
        //WHEN we push something,
        s.push(new Item(4,6));
        //THEN isEmpty should be false
        assertFalse(s.isEmpty());
    }

    @Test
    public void getSize() {
        //GIVEN an empty stack
        SimpleStack s = new SimpleStack();
        //WHEN we do nothing
        //THEN getSize should equal to 0
        assertEquals(s.getSize(),0);
        //WHEN we push one item
        s.push(new Item(5,5));
        //THEN getSize should equal 1
        assertEquals(s.getSize(),1);
        //WHEN we add many items (1000)
        for(int i=0;i<1000;i++){
            s.push(new Item(5,5));
        }
        //THEN getSize should equal to 1001
        assertEquals(s.getSize(),1001);
    }

    @Test
    public void push()  {
        //GIVEN an empty stack
        SimpleStack s = new SimpleStack();
        //WHEN we push ONE item
        Item i = new Item(1,3);
        s.push(i);
        //THEN the stack cannot be empty AND its size equals to one
        assertFalse(s.isEmpty());
        assertEquals(s.getSize(),1);
        //AND the item should be at the top of the stack
        assertSame(s.peek(),i);
    }

    @Test
    public void peek() throws EmptyStackException{
        //GIVEN an empty stack
        SimpleStack s = new SimpleStack();
        //WHEN doing nothing,
        //THEN peek should throw an error
        assertThrows(EmptyStackException.class,()->s.peek());

        //WHEN adding an item
        Item i = new Item(5,5);
        s.push(i);
        //THEN peek should return this item
        assertSame(s.peek(),i);
    }

    @Test
    public void pop() throws EmptyStackException {
        //GIVEN an empty stack
        SimpleStack s = new SimpleStack();
        //WHEN doing nothing,
        //THEN pop should throw an error
        assertThrows(EmptyStackException.class,()->s.pop());
        //WHEN having added one item
        Item i = new Item(5,5);
        s.push(i);
        //THEN pop should return this item AND stack should be empty
        assertSame(s.pop(),i);
        assertTrue(s.isEmpty());
    }
}