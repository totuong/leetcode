package Test93;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    //s="25422210101
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
//        int n = s.length();
//
//        for (int i = 1; i < 4 && i < n - 2; i++) {
//            String s1 = s.substring(0, i);
//            if (!isValid(s1)) continue;
//
//            for (int j = 1; j < 4 && i + j < n - 1; j++) {
//                String s2 = s.substring(i, i + j);
//                if (!isValid(s2)) continue;
//
//                for (int k = 1; k < 4 && i + j + k < n; k++) {
//                    String s3 = s.substring(i + j, i + j + k);
//                    String s4 = s.substring(i + j + k);
//
//                    if (!isValid(s3) || !isValid(s4)) continue;
//
//                    res.add(s1 + "." + s2 + "." + s3 + "." + s4);
//                }
//            }
//        }
//
        return res;
    }
    private void backtrack(String s, int start, List<String> path, List<String> res) {
        if (path.size() == 4) {
            if (start == s.length()) {
                res.add(String.join(".", path));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;

            String segment = s.substring(start, start + len);
            if (!isValid(segment)) continue;

            path.add(segment);
            backtrack(s, start + len, path, res);
            path.remove(path.size() - 1); // backtrack
        }
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false;
        try {
            int num = Integer.parseInt(s);
            return num >= 0 && num <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
