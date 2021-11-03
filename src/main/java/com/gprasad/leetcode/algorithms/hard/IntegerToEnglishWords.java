package com.gprasad.leetcode.algorithms.hard;
/*
273. Integer to English Words
Hard

Convert a non-negative integer num to its English words representation.

Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
Example 4:

Input: num = 1234567891
Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"


Constraints:

0 <= num <= 231 - 1
 */
public class IntegerToEnglishWords {
  String BLANK = "";
  String SPACE = " ";

  private String one(int num) {
    switch (num) {
      case 1:
        return "One";
      case 2:
        return "Two";
      case 3:
        return "Three";
      case 4:
        return "Four";
      case 5:
        return "Five";
      case 6:
        return "Six";
      case 7:
        return "Seven";
      case 8:
        return "Eight";
      case 9:
        return "Nine";
    }
    return BLANK;
  }

  private String twoLessThan20(int num) {
    switch (num) {
      case 10:
        return "Ten";
      case 11:
        return "Eleven";
      case 12:
        return "Twelve";
      case 13:
        return "Thirteen";
      case 14:
        return "Fourteen";
      case 15:
        return "Fifteen";
      case 16:
        return "Sixteen";
      case 17:
        return "Seventeen";
      case 18:
        return "Eighteen";
      case 19:
        return "Nineteen";
    }
    return BLANK;
  }

  private String ten(int num) {
    switch (num) {
      case 2:
        return "Twenty";
      case 3:
        return "Thirty";
      case 4:
        return "Forty";
      case 5:
        return "Fifty";
      case 6:
        return "Sixty";
      case 7:
        return "Seventy";
      case 8:
        return "Eighty";
      case 9:
        return "Ninety";
    }
    return BLANK;
  }

  private String two(int num) {
    if (num == 0) return BLANK;
    if (num < 10) return one(num);
    if (num < 20) return twoLessThan20(num);
    int tenthPlace = num / 10;
    int once = num - tenthPlace * 10;
    if (tenthPlace != 0) return ten(tenthPlace) + SPACE + one(once);
    return ten(tenthPlace);
  }

  private String three(int num) {
    if (num == 0) return BLANK;
    int hundered = num / 100;
    int leftOver = num - hundered * 100;
    String str = BLANK;
    if (hundered * leftOver != 0) return one(hundered) + " Hundred " + two(leftOver);
    if (hundered != 0 && leftOver == 0) return one(hundered) + " Hundred";
    return two(leftOver);
  }

  public String numberToWords(int num) {
    if (num == 0) return "Zero";
    int billion = num / 1000000000;
    int million = (num - billion * 1000000000) / 1000000;
    int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
    int hundereds = (num - billion * 1000000000 - million * 1000000 - thousand * 1000);
    String strB = three(billion);
    String strM = three(million);
    String strT = three(thousand);
    String strH = three(hundereds);
    String result = BLANK;
    if (billion != 0) result = strB.concat(" Billion");
    if (million != 0)
      result =!result.isEmpty()? result.concat(SPACE).concat(strM).concat(" Million"): strM.concat(" Million");
    if(thousand!=0)
      result =!result.isEmpty()? result.concat(SPACE).concat(strT).concat(" Thousand"): strM.concat(" Thousand");
    if(hundereds!=0)
      result =!result.isEmpty()? result.concat(SPACE).concat(strH): strH;
    return result;
  }
}

class SolutionXX {
  public String one(int num) {
    switch (num) {
      case 1:
        return "One";
      case 2:
        return "Two";
      case 3:
        return "Three";
      case 4:
        return "Four";
      case 5:
        return "Five";
      case 6:
        return "Six";
      case 7:
        return "Seven";
      case 8:
        return "Eight";
      case 9:
        return "Nine";
    }
    return "";
  }

  public String twoLessThan20(int num) {
    switch (num) {
      case 10:
        return "Ten";
      case 11:
        return "Eleven";
      case 12:
        return "Twelve";
      case 13:
        return "Thirteen";
      case 14:
        return "Fourteen";
      case 15:
        return "Fifteen";
      case 16:
        return "Sixteen";
      case 17:
        return "Seventeen";
      case 18:
        return "Eighteen";
      case 19:
        return "Nineteen";
    }
    return "";
  }

  public String ten(int num) {
    switch (num) {
      case 2:
        return "Twenty";
      case 3:
        return "Thirty";
      case 4:
        return "Forty";
      case 5:
        return "Fifty";
      case 6:
        return "Sixty";
      case 7:
        return "Seventy";
      case 8:
        return "Eighty";
      case 9:
        return "Ninety";
    }
    return "";
  }

  public String two(int num) {
    if (num == 0) return "";
    else if (num < 10) return one(num);
    else if (num < 20) return twoLessThan20(num);
    else {
      int tenner = num / 10;
      int rest = num - tenner * 10;
      if (rest != 0) return ten(tenner) + " " + one(rest);
      else return ten(tenner);
    }
  }

  public String three(int num) {
    int hundred = num / 100;
    int rest = num - hundred * 100;
    String res = "";
    if (hundred * rest != 0) res = one(hundred) + " Hundred " + two(rest);
    else if ((hundred == 0) && (rest != 0)) res = two(rest);
    else if ((hundred != 0) && (rest == 0)) res = one(hundred) + " Hundred";
    return res;
  }

  public String numberToWords(int num) {
    if (num == 0) return "Zero";

    int billion = num / 1000000000;
    int million = (num - billion * 1000000000) / 1000000;
    int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
    int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;

    String result = "";
    if (billion != 0) result = three(billion) + " Billion";
    if (million != 0) {
      if (!result.isEmpty()) result += " ";
      result += three(million) + " Million";
    }
    if (thousand != 0) {
      if (!result.isEmpty()) result += " ";
      result += three(thousand) + " Thousand";
    }
    if (rest != 0) {
      if (!result.isEmpty()) result += " ";
      result += three(rest);
    }
    return result;
  }
}
