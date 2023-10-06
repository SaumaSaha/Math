package io.github.saumasaha.math.my_math;

import io.github.saumasaha.math.number.Comparable;

public class MyMath{
  private MyMath() {}

  public static Comparable max(Comparable[] numbers) {
    Comparable maxSoFar = numbers[0];

    for(Comparable n: numbers) {
      if(maxSoFar.compareTo(n) < 0)
        maxSoFar = n;
    }

    return maxSoFar;
  }
}


