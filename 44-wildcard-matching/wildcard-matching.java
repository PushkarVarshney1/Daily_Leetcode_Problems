import java.util.Arrays;

class Solution {
    // Memoization table: stores results of fun(i, j) to avoid redundant computations.
    // memo[i+1][j+1] is used because i and j can be -1, mapping to 0-indexed array.
    Boolean[][] memo;

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        // Initialize memoization table. Size (n+1) x (m+1) to handle empty strings/patterns.
        memo = new Boolean[n + 1][m + 1];
        // Start recursion from the end of both strings/patterns
        return fun(n - 1, m - 1, s, p);
    }

    public boolean fun(int i, int j, String s, String p) {
        // Base Case 1: Both string and pattern are exhausted. Match found.
        if (i < 0 && j < 0) return true;

        // Base Case 2: Pattern exhausted, but string still has characters. No match.
        if (i >= 0 && j < 0) return false;

        // Base Case 3: String exhausted, but pattern still has characters.
        // Match only if all remaining pattern characters are '*'
        if (i < 0 && j >= 0) {
            // Corrected loop: iterate through all remaining pattern characters from 0 to j
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') { // If any character is not '*', then no match.
                    return false;
                }
            }
            return true; // All remaining pattern characters are '*', so it matches empty string.
        }

        // Check if this subproblem has already been solved
        if (memo[i + 1][j + 1] != null) {
            return memo[i + 1][j + 1];
        }

        boolean result;
        // Case 1: Current characters match, or pattern has '?'
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            result = fun(i - 1, j - 1, s, p); // Move both pointers back
        }
        // Case 2: Pattern has '*'
        else if (p.charAt(j) == '*') {
            // '*' can match the current character s[i] (and potentially more characters later)
            // OR '*' can match an empty sequence (and we move to p[j-1])
            result = fun(i - 1, j, s, p) || fun(i, j - 1, s, p);
        }
        // Case 3: No match
        else {
            result = false;
        }

        return memo[i + 1][j + 1] = result;
    }
}