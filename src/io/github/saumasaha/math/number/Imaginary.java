package io.github.saumasaha.math.number;

public class Imaginary implements Arithmetic<Imaginary> {
  private int num;

  public Imaginary() {}

  public Imaginary(int num) {
    this.num = num;
  }

  public Imaginary add(Imaginary n) {
    return new Imaginary(this.num + n.num);
  }

  public Imaginary subtract(Imaginary n) {
    return new Imaginary(this.num - n.num);
  }

  public int value() {
    return this.num;
  }

  public String toString() {
    return this.num + "i";
  }
}