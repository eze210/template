package ar.fiuba.tdd.template.ar.fiuba.tdd.template.queue;

public interface Queue<T> {
    boolean isEmpty();
    
    int size();

    void add(T item);

    T top();

    void remove();
}
