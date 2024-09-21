import java.util.ArrayList;
import java.util.List;

public class RemoveKDigits {
    public static void main(String[] args) {
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String num = "1432219"; // "10";//"10200";
        int k = 3;
        String result = removeKDigits.removeStringV4(num, k);
        System.out.println(result);
    }

    public String removeKDigitsV3(String num, int k) {
        if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        // Remove remaining characters from the end if k > 0
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public String removeKDigitsV5(String num, int k) {
        if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        // Remove remaining characters from the end if k > 0
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }


    public String removeKDigits(String num, int limit) {
        if (num == null || num.length() == 0 || limit <= 0 || limit >= num.length()) {
            return "0";
        }
        char[] charArray = num.toCharArray();
        List<String> list = new ArrayList<>();
        int nextCounter = 0;
        for (int i = 0; i < charArray.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = nextCounter, k = 0; j < charArray.length; j++) {
                if (k < limit) {
                    k++;
                    continue;
                } else {
                    sb.append(charArray[j]);
                }
            }
            list.add(sb.toString());
            nextCounter++;
        }
        System.out.println(list);
        // for (int i = 1; i <= num.length(); i++) {
        // String currentSubstring = num.substring(i, i + k);
        // int currentAsciiValue = findAsciiValue(currentSubstring);
        // if (currentAsciiValue < minAsciiValue) {
        // minAsciiSubstring = currentSubstring;
        // minAsciiValue = currentAsciiValue;
        // }
        // }

        return "0";

    }

    public String removeStringV4(String num, int k) {
        if (num.length() == k)
            return "0";

        for (int i = 0; i < num.length(); i++) {
            int removeCounter = 0;
            int nextCounter = i;
            StringBuilder sb = new StringBuilder(num);
            int removeIndex = 0;
            while (removeCounter == k) {
                sb.deleteCharAt(removeIndex);
                removeCounter++;
            }
            System.out.println(sb.toString());

        }

        return num;

    }

    public String removeKDigitsV2(String num, int k) {
        if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        // Remove remaining characters from the end if k > 0
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public String removeKDigitV1(String num, int k) {
        if (num == null || num.length() == 0 || k <= 0 || k > num.length()) {
            return "0";
        }

        String minAsciiSubstring = num.substring(0, k);
        int minAsciiValue = findAsciiValue(minAsciiSubstring);

        for (int i = 1; i <= num.length() - k; i++) {
            String currentSubstring = num.substring(i, i + k);
            int currentAsciiValue = findAsciiValue(currentSubstring);
            if (currentAsciiValue < minAsciiValue) {
                minAsciiSubstring = currentSubstring;
                minAsciiValue = currentAsciiValue;
            }
        }

        return minAsciiSubstring;

    }

    public int findAsciiValue(String str) {
        int asciiSum = 0;
        for (char ch : str.toCharArray()) {
            asciiSum += (int) ch;
        }
        return asciiSum;
    }
}
