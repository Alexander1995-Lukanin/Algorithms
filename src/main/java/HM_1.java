public class HM_1 {
    public static void main(String[] args) {
        System.out.println  (exponentiation (3, 2));
        System.out.println(exponentiationTwo (-2f,3));
        System.out.println (sumThreeNumbers());
    }
    //        1. возведение в степень
    public static double exponentiation(double b, long e){
        double v = 1d;
        while(e > 0) {
            if((e & 1) != 0) {
                v *= b;
            }
            b *= b;
            e >>= 1;
        }
        return v;
    }

    //        2. возведение в степень (с использованием свойства чётности степени)
    public static float exponentiationTwo (float x, float degree){
        float p = 1;
        int count =0;
        if (degree<0){
            degree*=-1;
            count+=1;
        }
            while (degree>0) {
                if (degree/2==0) {
                    degree=degree/2;
                    x=x*x;
                }
                else {
                    degree=degree-1;
                    p=p*x;
                }
            }
            if (count==1) {
                return 1/p;
            }
            else return p;
            }

    //        3. получить сумму всех чисел в ряду от 0 до 100.
        public static int sumThreeNumbers(){
            int a=0;
            int b=100;
            return (b+a+1)*b/2;

        }
}
