package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

class StrategyNodeNormal<T> implements IStrategyNode<T> {
    private final QueueNode<T> next = new QueueNode<>(new StrategyNodeEmpty<T>());
    private final T item;

    StrategyNodeNormal(T item) {
        this.item = item;
    }

    @Override
    public int getSize() {
        return next.getSize() + 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T getItem() throws AssertionError {
        return item;
    }

    @Override
    public QueueNode<T> getNext() throws AssertionError {
        return next;
    }

    @Override
    public QueueNode<T> getTailNode(QueueNode<T> currentNode) {
        return next.getTailNode();
    }
}
