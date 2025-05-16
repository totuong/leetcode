package Test13;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if (i == s.length() - 1 || (s.charAt(i + 1) != 'D' && s.charAt(i + 1) != 'M')) {
                        result += 100;
                        break;
                    }
                    if (s.charAt(i + 1) == 'D') {
                        result += 400;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        result += 900;
                        i++;
                        break;
                    }
                case 'L':
                    result += 50;
                    break;
                case 'X': {
                    if (i == s.length() - 1 || (s.charAt(i + 1) != 'L' && s.charAt(i + 1) != 'C')) {
                        result += 10;
                        break;
                    }
                    if (s.charAt(i + 1) == 'L') {
                        result += 40;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'C') {
                        result += 90;
                        i++;
                        break;
                    }
                }
                case 'V':
                    result += 5;
                    break;
                case 'I': {
                    if (i == s.length() - 1 || (s.charAt(i + 1) != 'V' && s.charAt(i + 1) != 'X')) {
                        result += 1;
                        break;
                    }
                    if (s.charAt(i + 1) == 'V') {
                        result += 4;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'X') {
                        result += 9;
                        i++;
                        break;
                    }
                }
            }
            i++;
        }
        return result;
    }
}
