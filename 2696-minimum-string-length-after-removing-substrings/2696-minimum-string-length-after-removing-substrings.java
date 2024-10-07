class Solution {
    public int minLength(String s) {
while (true) {
if (!s.contains("AB") && !s.contains("CD")) {
break;
}
s = s.replace("AB", "").replace("CD","");
}
return s.length();
    }
}