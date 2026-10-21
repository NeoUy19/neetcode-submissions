class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arrival= new double[position.length][2];
        for (int i = 0 ; i < position.length ; i++){
            arrival[i][0] = position[i];
            arrival[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(arrival, (a,b) -> Double.compare(b[0], a[0]));
        double leader = 0;
        int numFleets = 0;
        for(int i = 0 ; i < arrival.length ;i++){
            if (arrival[i][1] > leader){
                numFleets++;
                leader = arrival[i][1];
            }
        }

        return numFleets;
    }
}
