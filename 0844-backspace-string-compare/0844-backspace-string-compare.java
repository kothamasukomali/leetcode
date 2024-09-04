import java.util.Stack;

class Solution {
    public static String com(String a) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '#') {
                st.push(a.charAt(i));
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        
        // Convert stack to string
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String m = com(s);
        String z = com(t);
        return m.equals(z);
    }
}
