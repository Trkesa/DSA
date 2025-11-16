class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int s1=words[i].length();
                int s2=words[j].length();
                if(s1<=s2){
                    if(words[j].substring(0, s1).equals(words[i]) && words[j].substring(s2 - s1).equals(words[i])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}