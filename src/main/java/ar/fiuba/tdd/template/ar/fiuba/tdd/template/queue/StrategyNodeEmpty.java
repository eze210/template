package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

class StrategyNodeEmpty<T> implements IStrategyNode<T> {
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public T getItem() throws AssertionError {
        throw new AssertionError();
    }

    @Override
    public QueueNode<T> getNext() throws AssertionError {
        throw new AssertionError();
    }

    @Override
    public QueueNode<T> getTailNode(QueueNode<T> currentNode) {
        return currentNode;
    }
}
