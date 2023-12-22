package AlgorithmsAndStructures.alishev;

public class GreedlyAlgorithms {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 300));
    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nexStop = currentStop;

            while (nexStop < stations.length - 1
                    && stations[nexStop + 1] - stations[currentStop] <= capacity) {
                nexStop++;
            }
            if (currentStop == nexStop) {
                return -1;
            }
            if (nexStop < stations.length - 1) {
                result++;
            }
            currentStop = nexStop;
        }

        return result;

    }
}
