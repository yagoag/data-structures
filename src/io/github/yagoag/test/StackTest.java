package io.github.yagoag.test;

import io.github.yagoag.main.Stack;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
  Stack<Integer> stack;

  @Before
  public void setup() {
    stack = new Stack<>();
  }

  @Test
  public void popEmptyStack() {
    assert stack.pop() == null;
  }

  @Test
  public void isEmptyPositive() {
    assert stack.isEmpty();
  }

  @Test
  public void peekEmptyStack() {
    assert stack.peek() == null;
  }

  @Test
  public void addItem() {
    stack.add(10);
    assert stack.peek() == 10;
  }

  @Test
  public void popItem() {
    stack.add(10);
    stack.add(20);

    assert stack.pop() == 20;
    assert stack.peek() == 10;
  }

  @Test
  public void popAllItems() {
    stack.add(10);

    assert stack.pop() == 10;
    assert stack.peek() == null;
  }

  @Test
  public void isEmptyNegative() {
    stack.add(10);
    assert !stack.isEmpty();
  }
}
