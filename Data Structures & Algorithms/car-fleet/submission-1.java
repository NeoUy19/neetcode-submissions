class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arrival = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            arrival[i][0] = position[i];
            arrival[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(arrival, (a, b) -> Double.compare(b[0], a[0]));

        Deque<Double> stack = new ArrayDeque<>();
        for (double[] car : arrival) {
            double time = car[1];
            stack.push(time);
            if (stack.size() > 1) {
                double top = stack.pop();        // this car
                double ahead = stack.peek();     // the fleet in front
                if (top > ahead) {
                    stack.push(top);             // slower — survives as its own fleet
                }
                // otherwise it was absorbed; leaving it popped is the merge
            }
        }
        return stack.size();
    }
}
