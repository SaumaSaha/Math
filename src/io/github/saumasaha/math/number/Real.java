package io.github.saumasaha.math.number;

public class Real implements Arithmetic<Real>, Comparable<Real>{
  private int num;

  public Real() {}

  public Real(int num) {
    this.num = num;
  }

  public Real add(Real n) {
    return new Real(this.num + n.num);
  }

  public Real subtract(Real n) {
    return new Real(this.num - n.num);
  }

  public int value() {
    return this.num;
  }

  public int compareTo(Real n) {
    return this.num - n.num;
  }

  public String toString() {
    return this.num + "";
  }
}