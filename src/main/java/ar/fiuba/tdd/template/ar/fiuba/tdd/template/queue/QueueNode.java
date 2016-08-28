package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

class QueueNode<T> {
    private IStrategyNode<T> strategy;

    QueueNode(IStrategyNode<T> strategy) {
        this.strategy = strategy;
    }

    void setStrategy(IStrategyNode<T> strategy) {
        this.strategy = strategy;
    }

    boolean isEmpty() {
        return strategy.isEmpty();
    }

    int getSize() {
        return strategy.getSize();
    }

    T getItem() {
        return strategy.getItem();
    }

    QueueNode<T> getNext() {
        return strategy.getNext();
    }

    QueueNode<T> getTailNode() {
        return strategy.getTailNode(this);
    }
}
