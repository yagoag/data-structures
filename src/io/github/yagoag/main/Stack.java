package io.github.yagoag.main;

public class Stack<E> {
  Node<E> top;

  public Stack() {
    top = null;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public E peek() {
    if (top == null) return null;
    return top.getValue();
  }

  public E pop() {
    if (top == null) return null;

    E popped = top.getValue();
    top = top.getNext();
    return popped;
  }

  public void add(E value) {
    top = new Node<>(value, top);
  }

  private class Node<E> {
    E value;
    Node<E> next;

    Node(E value, Node<E> next) {
      this.value = value;
      this.next = next;
    }

    public E getValue() {
      return value;
    }

    public Node<E> getNext() {
      return next;
    }
  }
}
