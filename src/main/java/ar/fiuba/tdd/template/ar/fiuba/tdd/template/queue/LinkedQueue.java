package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

public class LinkedQueue<T> implements Queue<T> {
    private QueueNode<T> first;

    public LinkedQueue() {
        first = new QueueNode<>(new StrategyNodeEmpty<T>());
    }

    @Override
    public boolean isEmpty() {
        return first.isEmpty();
    }

    @Override
    public int size() {
        return first.getSize();
    }

    @Override
    public T top() {
        return first.getItem();
    }

    @Override
    public void remove() {
        first = first.getNext();
    }

    @Override
    public void add(T item) {
        first.getTailNode().setStrategy(new StrategyNodeNormal<>(item));
    }
}
