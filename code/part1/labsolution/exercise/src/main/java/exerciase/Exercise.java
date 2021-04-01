package exercise;

import java.util.*;

import static java.util.stream.Collectors.joining;

public final class Exercise {
  public static String commaSeparatedNamesOfLength(List<String> names, int length) {
    return names.stream()
      .filter(name -> name.length() == length)
      .map(String::toUpperCase)
      .collect(joining(", "));
  }

  public static double calculate(List<Integer> numbers) {
    return numbers.stream()
      .filter(e -> e % 2 == 0)
      .filter(e -> e > 3)
      .filter(e -> Math.sqrt(e) < 3)
      .mapToInt(e -> e * 2)
      .sum();
  }
}
