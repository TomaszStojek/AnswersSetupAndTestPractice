package org.bcit.midterm.answers;

public class Basic_02_vector {
  private int x;
  private int y;

  public Basic_02_vector(int i, int i1) {
    x = i;
    y = i1;
  }

  public Basic_02_vector add(Basic_02_vector direction) {
    x = direction.getX();
    y = direction.getY();
    return this;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}
