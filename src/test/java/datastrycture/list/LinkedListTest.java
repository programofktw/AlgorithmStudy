package datastrycture.list;


import basic.datastructure.list.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new LinkedList<>();
    }

    @Test
    void testAddAndGet() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.getSize());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void testInsert() {
        list.add("A");
        list.add("C");
        list.insert("B", 1);

        assertEquals(3, list.getSize());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void testUpdate() {
        list.add("A");
        list.update(0, "Z");

        assertEquals("Z", list.get(0));
    }

    @Test
    void testDelete() {
        list.add("A");
        list.add("B");
        list.delete(0);

        assertEquals(1, list.getSize());
        assertEquals("B", list.get(0));
    }

    @Test
    void testRemove() {
        list.add("A");
        list.add("B");
        list.add("A");

        list.remove("A");

        assertEquals(2, list.getSize());
        assertEquals("B", list.get(0));
        assertEquals("A", list.get(1));
    }

    @Test
    void testRemoveAll() {
        list.add("A");
        list.add("B");
        list.add("A");

        int removed = list.removeAll("A");

        assertEquals(2, removed);
        assertEquals(1, list.getSize());
        assertEquals("B", list.get(0));
    }

    @Test
    void testContains() {
        list.add("A");
        list.add("B");

        assertTrue(list.contains("A"));
        assertFalse(list.contains("C"));
    }

    @Test
    void testFindFirstIndex() {
        list.add("X");
        list.add("Y");
        list.add("X");

        assertEquals(0, list.findFirstIndex("X"));
        assertEquals(1, list.findFirstIndex("Y"));
        assertEquals(-1, list.findFirstIndex("Z"));
    }

    @Test
    void testAddAll() {
        LinkedList<String> another = new LinkedList<>();
        another.add("A");
        another.add("B");

        list.add("X");
        list.addAll(another);

        assertEquals(3, list.getSize());
        assertEquals("X", list.get(0));
        assertEquals("A", list.get(1));
        assertEquals("B", list.get(2));
    }

    @Test
    void testClear() {
        list.add("A");
        list.add("B");

        list.clear();

        assertEquals(0, list.getSize());
        assertFalse(list.contains("A"));
    }
}