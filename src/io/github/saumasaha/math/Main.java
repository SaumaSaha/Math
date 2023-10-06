package io.github.saumasaha.math;

import io.github.saumasaha.math.number.Real;
import io.github.saumasaha.math.number.Imaginary;
import io.github.saumasaha.math.number.Complex;
import io.github.saumasaha.math.number.Comparable;
import io.github.saumasaha.math.my_math.MyMath;

class Main {
  public static void main(String[] args) {
    Real r1 = new Real(1);
    Real r2 = new Real(2);
    Imaginary i1 = new Imaginary(2);
    Imaginary i2 = new Imaginary(3);
    Complex c1 = new Complex(r1, i1);
    Complex c2 = new Complex(r2, i2);

    Complex sum = c1.add(c2);
    Complex diff = c1.subtract(c2);

    System.out.println(sum);
    System.out.println(diff);

    Comparable[] arr = {r1, r2};
    Comparable number =  MyMath.max(arr);

    System.out.println(number);
  }
}