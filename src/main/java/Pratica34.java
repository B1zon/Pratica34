/**
 * @author Gabriel Rodrigues Garcia <b1zon@hotmail.com>
 */
public class Pratica34 {
    public static void main(String[] args) {
        long fat = 1;
        for (int i = 0; fat > 0; i++){
             fat = fatorial(i);
             if(fat>0)
                System.out.printf("Fatorial de %d = %d\n",i,fat);
        }
        int m1 = mdc(12,24);
        int m2 = mdc(7,5);
        System.out.printf("Maior divisor comum de (%d,%d) = %d\n",12,24,m1);
        System.out.printf("Maior divisor comum de (%d,%d) = %d\n",7,5,m2);
    }
    public static long fatorial(int num){
        if (num < 2) { 
            return 1;
        } else { 
            return num * fatorial(num - 1);
        }   
    }
    public static int mdc(int m, int n){
        if (n > m)
            return mdc(n, m);
        else
            if (n > 0)
                return mdc(n, m % n);
            else
                return m; 
    }
}
