class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int [temperatures.length];
        for (int i = 0 ; i < temperatures.length-1 ;i++){
            int days = 0;
            for (int j = i+1 ; j < temperatures.length ; j++){
                days++;
                if (temperatures[j] > temperatures[i]){
                    result[i] = days;
                    break;
                }
            }
        }
        return result;
    }
}
