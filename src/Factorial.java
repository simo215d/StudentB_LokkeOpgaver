public class Factorial {
    public int calc(int i) {
        int result = 1;
        if (i<=0){
            return -1;
        } else if (i >= 1000){
            return -1;
        } else {
            for (int x = i; x>0; x--){
                result *= x;
            }
            return result;
        }
    }
}
