package com.string.calculator;

public class StringCalculator {

 public int add(String stringInput) {

  if ((stringInput.equals(null)) || (stringInput.equals("")))
   return -2;

  // String use the regular \\D(non digit) expression to split numbers
  String stringArr[] = stringInput.split("\\D");
  int total = 0;
  for (String stringVal : stringArr) {
   total += Integer.parseInt(stringVal);
  }
  return total;
 }

}