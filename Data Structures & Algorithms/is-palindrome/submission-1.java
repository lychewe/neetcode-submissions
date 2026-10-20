class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            while(i < j && isPalindromeHelper(s.charAt(i))) {
                i++;
            }

            while(i < j && isPalindromeHelper(s.charAt(j))) {
                j--;
            }
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isPalindromeHelper(char c) {
        return((c < 'a' || c > 'z') && (c < '0' || c > '9'));
    }
}
