public class Fibo {
    public int Beregn(int i) {
        int result = 0;
        if (i<=0){
            return -1;
        } else if (i >= 100000){
            return -1;
        } else {
            for (int x = i; x>=0;x--){
                result += x;
            }
            return result;
        }
    }
}
