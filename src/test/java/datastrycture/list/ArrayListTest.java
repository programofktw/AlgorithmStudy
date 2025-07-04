package datastrycture.list;

import basic.datastructure.list.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void 기본_Size_체트(){
        ArrayList<String> list = new ArrayList<>();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void testAddAndGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        assertEquals(2, list.getSize());
        assertEquals("apple", list.get(0));
        assertEquals("banana", list.get(1));
    }

    @Test
    public void testInsert() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.insert("b", 1);

        assertEquals("b", list.get(1));
        assertEquals(3, list.getSize());
    }

    @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("x");
        list.add("y");
        list.add("z");

        list.remove("y");
        assertEquals(2, list.getSize());
        assertEquals("z", list.get(1));
    }

    @Test
    public void testClear(){
        ArrayList<String> list = new ArrayList<>();

        list.add("x");
        list.add("y");
        list.add("z");

        list.clear();

        assertEquals(0,list.getSize());
    }

    @Test
    public void testOutOfBounds(){
        ArrayList<String> list = new ArrayList<>();

        list.add("x");

        assertThrows(ArrayIndexOutOfBoundsException.class,()->list.get(10));
    }

    @Test
    public void testRejectNull(){
        ArrayList<String> list = new ArrayList<>();

        assertThrows(IllegalArgumentException.class,()->list.add(null));
    }
}
