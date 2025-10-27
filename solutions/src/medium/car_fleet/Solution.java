package medium.car_fleet;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    private static class Car {
        int position;
        int speed;

        Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 0) return 0;

        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));

        for (int i = 0; i < position.length; i++) {
            position[i] = cars[i].position;
            speed[i] = cars[i].speed;
        }

        Stack<Double> times = new Stack<>();

        for (Car car : cars) {
            times.push((target - car.position) * 1.0 / car.speed);
            if (times.size() >= 2 && times.peek() <= times.get(times.size()-2)) times.pop();
        }


        return times.size();
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.carFleet(100, new int[] {0,2,4}, new int[] {4,2,1}));
//    }
}
