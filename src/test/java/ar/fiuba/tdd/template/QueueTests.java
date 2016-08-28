package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue.LinkedQueue;
import ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTests {

    @Test
    public void emptyQueueIsEmptyTest() {
        Queue<Integer> queue = new LinkedQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void emptyQueueSizeIsZeroTest() {
        Queue<Integer> queue = new LinkedQueue<>();
        assertEquals(queue.size(), 0);
    }

    @Test(expected = AssertionError.class)
    public void emptyQueueThrowsAssertionErrorWhenTryingRemove() {
        Queue<Integer> queue = new LinkedQueue<>();
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void emptyQueueThrowsAssertionErrorWhenTryingGetTop() {
        Queue<Integer> queue = new LinkedQueue<>();
        queue.top();
    }

    @Test
    public void oneElementTest() {
        Queue<Integer> queue = new LinkedQueue<>();

        /* queue starts empty */
        assertTrue(queue.isEmpty());
        queue.add(1);

        /* queue has 1 element */
        assertFalse(queue.isEmpty());
        assertEquals(queue.top(), new Integer(1));

        /* top() call did not remove the element */
        assertEquals(queue.size(), 1);
        assertFalse(queue.isEmpty());

        /* removing the element lets the queue empty */
        queue.remove();
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }

    @Test
    public void fifoTest() {
        Queue<Integer> queue = new LinkedQueue<>();

        /* inserts a fixed number of elements */
        int numberOfElementsToAdd = 200;
        for (int i = 1; i <= numberOfElementsToAdd; ++i) {
            queue.add(i);
        }

        /* checks its order */
        for (Integer i = 1; i <= numberOfElementsToAdd; ++i) {
            assertEquals(queue.top(), i);
            queue.remove();
        }

        assertTrue(queue.isEmpty());
    }

    @Test
    public void sizeTest() {
        Queue<Integer> queue = new LinkedQueue<>();

        /* queue starts empty */
        assertTrue(queue.isEmpty());

        /* add a fixed number of elements, checking size for each add operation */
        int numberOfElementsToAdd = 200;
        for (int i = 1; i <= numberOfElementsToAdd; ++i) {
            queue.add(i);
            assertFalse(queue.isEmpty());
            assertEquals(queue.size(), i);
        }

        /* remove checking size for each remove operation */
        for (int i = numberOfElementsToAdd; i >= 1; --i) {
            assertFalse(queue.isEmpty());
            assertEquals(queue.size(), i);
            queue.remove();
        }

        /* removing all elements lets the queue empty */
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }

}
