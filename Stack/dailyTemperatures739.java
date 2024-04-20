class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<Integer>();
        int n = temperatures.length;
        for(int i = n-1;i>-1;i--){
            while(!st.empty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                result[i] = 0;
            }
            else{
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;
    }
}