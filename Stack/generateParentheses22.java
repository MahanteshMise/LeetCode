import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backTrack(list,"",0,0,n);
        return list;
    }
    public void backTrack(List<String> list,String str,int open,int close,int n){
        if(str.length() == 2*n){
            list.add(str);
            return;
        }
        if(open<n){
            backTrack(list, str+'(', open+1, close, n);
        }
        if(close<open){
            backTrack(list, str+')', open, close+1, n);
        }
    }
}