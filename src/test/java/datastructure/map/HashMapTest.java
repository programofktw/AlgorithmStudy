package datastructure.map;

import basic.datastructure.map.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

    private HashMap<String, Integer> map;

    @BeforeEach
    public void setUp() {
        map = new HashMap<>();
    }

    @Test
    public void testPutAndGet() {
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("carrot", 3);

        assertEquals(1, map.get("apple"));
        assertEquals(2, map.get("banana"));
        assertEquals(3, map.get("carrot"));
    }

    @Test
    public void testPutDuplicateKeyOverrides() {
        map.put("apple", 1);
        map.put("apple", 999); // override

        assertEquals(999, map.get("apple"));
        assertEquals(1, map.size()); // size should stay 1
    }

    @Test
    public void testContainsKey() {
        map.put("apple", 1);
        map.put("banana", 2);

        assertTrue(map.containsKey("apple"));
        assertTrue(map.containsKey("banana"));
        assertFalse(map.containsKey("carrot"));
    }

    @Test
    public void testRemove() {
        map.put("apple", 1);
        map.put("banana", 2);

        assertEquals(1, map.remove("apple"));
        assertNull(map.get("apple"));
        assertFalse(map.containsKey("apple"));
        assertEquals(1, map.size());

        assertNull(map.remove("not_exist"));
    }

    @Test
    public void testClear() {
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("carrot", 3);

        assertFalse(map.isEmpty());
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("apple"));
    }

    @Test
    public void testSize() {
        assertEquals(0, map.size());
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(2, map.size());
        map.remove("a");
        assertEquals(1, map.size());
        map.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("x", 100);
        assertFalse(map.isEmpty());
        map.remove("x");
        assertTrue(map.isEmpty());
    }

    @Test
    public void testBulkInsertPerformance() {
        int N = 100;
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            map.put("key" + i, i);
        }
        long end = System.nanoTime();

        assertEquals(N, map.size());
        System.out.println("[PUT 100개] 걸린 시간: " + (end - start) / 1_000_000.0 + " ms");
    }

    @Test
    public void testGetPerformance() {
        int N = 100;
        for (int i = 0; i < N; i++) {
            map.put("key" + i, i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            assertEquals(i, map.get("key" + i));
        }
        long end = System.nanoTime();

        System.out.println("[GET 100개] 걸린 시간: " + (end - start) / 1_000_000.0 + " ms");
    }

    @Test
    public void testRemovePerformance() {
        int N = 100;
        for (int i = 0; i < N; i++) {
            map.put("key" + i, i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            assertEquals(i, map.remove("key" + i));
        }
        long end = System.nanoTime();

        assertEquals(0, map.size());
        System.out.println("[REMOVE 100개] 걸린 시간: " + (end - start) / 1_000_000.0 + " ms");
    }
}

