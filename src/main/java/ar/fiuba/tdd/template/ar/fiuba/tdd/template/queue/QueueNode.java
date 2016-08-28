package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

public class QueueNode<T> {
    IStrategyNode<T> strategy;

    public QueueNode(IStrategyNode<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategyNode<T> strategy){
        this.strategy = strategy;
    }

    public boolean isEmpty() {
        return strategy.isEmpty();
    }

    public int getSize() {
        return strategy.getSize();
    }

    public T getItem() {
        return strategy.getItem();
    }

    public QueueNode<T> getNext() {
        return strategy.getNext();
    }

    public QueueNode<T> getTailNode() {
        return strategy.getTailNode(this);
    }
}
