package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

interface IStrategyNode<T> {
    int getSize();

    boolean isEmpty();

    T getItem() throws AssertionError;

    QueueNode<T> getNext() throws AssertionError;

    QueueNode<T> getTailNode(QueueNode<T> currentNode);
}
