class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> openBrackets = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openBrackets.push(sb.length());
            } else if (ch == ')') {
                int start = openBrackets.pop();
                int end = sb.length() - 1;
                reverse(sb, start, end);
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
    
    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}