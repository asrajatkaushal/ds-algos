public class FibonacciSeries {
    public int[] fibonacci(int n, int i, int f, int s, int[] series) {
        if(n > 2) {
            series[i] = f + s;
            fibonacci(--n, ++i, s, f + s, series);
        }
        return series;
    }
}                    
