//https://leetcode.com/problems/palindrome-number/description/
class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        // char[] charArray = String.valueOf(x).toCharArray();
        String intSting = String.valueOf(x).toString();
        StringBuilder sb = new StringBuilder();
        StringBuilder reverseStringSb = sb.append(intSting).reverse();

        return intSting.equals(reverseStringSb.toString());
    }
}