class Solution {
    public String sortVowels(String s) {
        Set<Character>vs=Set.of('A','E','I','O','U','a','e','i','o','u');
        List<Character>v=new ArrayList<>();
        for(char c:s.toCharArray())
            if(vs.contains(c))
            v.add(c);
        Collections.sort(v);
    StringBuilder m=new StringBuilder();
    int j=0;
    for(char c:s.toCharArray()){
        if(vs.contains(c))
        m.append(v.get(j++));
        else
        m.append(c);
    }
        return m.toString();
        
    }
}