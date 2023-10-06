package io.github.saumasaha.math.number;

public class Complex implements Arithmetic<Complex>, Comparable<Complex>{
  private Real real;
  private Imaginary imaginary;

  public Complex() {}

  public Complex(Real r, Imaginary i) {
    this.real = r;
    this.imaginary = i;
  }

  public Complex add(Complex c) {
    Real real = this.real.add(c.real);
    Imaginary imaginary = this.imaginary.add(c.imaginary);

    return new Complex(real, imaginary);
  }

  public Complex subtract(Complex c) {
    Real real = this.real.subtract(c.real);
    Imaginary imaginary = this.imaginary.subtract(c.imaginary);

    return new Complex(real, imaginary);
  }

  public int compareTo(Complex c) {
    return 0;
  }

  public String toString() {
    String symbol = this.imaginary.value() < 0 ? "-" : "+";
    return this.real.value() + symbol + Math.abs(this.imaginary.value()) + "i";
  }
}