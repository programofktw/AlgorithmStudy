package datastructure.map;


import basic.datastructure.map.ListMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListMapTest {

    private ListMap<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new ListMap<>();
    }

    @Test
    void testPutAndGet() {
        map.put("apple", 3);
        map.put("banana", 5);
        assertEquals(3, map.get("apple"));
        assertEquals(5, map.get("banana"));
    }

    @Test
    void testUpdateValue() {
        map.put("apple", 3);
        map.put("apple", 10); // overwrite
        assertEquals(10, map.get("apple"));
    }

    @Test
    void testContainsKey() {
        map.put("apple", 3);
        assertTrue(map.containsKey("apple"));
        assertFalse(map.containsKey("orange"));
    }

    @Test
    void testRemove() {
        map.put("apple", 3);
        map.put("banana", 5);

        Integer removed = map.remove("apple");
        assertEquals(3, removed);
        assertNull(map.get("apple"));
        assertFalse(map.containsKey("apple"));

        // Removing nonexistent key
        assertNull(map.remove("not_exist"));
    }

    @Test
    void testClear() {
        map.put("a", 1);
        map.put("b", 2);
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    void testSizeAndIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("a", 1);
        assertEquals(1, map.size());
        map.put("b", 2);
        assertEquals(2, map.size());
        map.remove("a");
        assertEquals(1, map.size());
        map.remove("b");
        assertTrue(map.isEmpty());
    }

    @Test
    void testNullKeyThrowsException() {
        assertThrows(NullPointerException.class, () -> map.put(null, 1));
        assertThrows(NullPointerException.class, () -> map.get(null));
        assertThrows(NullPointerException.class, () -> map.remove(null));
        assertThrows(NullPointerException.class, () -> map.containsKey(null));
    }
}