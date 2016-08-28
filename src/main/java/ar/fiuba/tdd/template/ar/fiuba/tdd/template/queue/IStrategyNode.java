package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

public interface IStrategyNode<T> {
    public int getSize();
    public boolean isEmpty();
    public T getItem() throws AssertionError;
    public QueueNode<T> getNext() throws AssertionError;
    public QueueNode<T> getTailNode(QueueNode<T> currentNode);
}
