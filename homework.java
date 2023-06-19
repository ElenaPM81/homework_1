
import java.util.Arrays;
import java.util.Random;

public class homework {

        public static void main(String[] args) {
                // выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
                int k = 2000;
                int i = new Random().nextInt(k);
                System.out.println(i);
                // посчитать и сохранить в n номер старшего значащего бита выпавшего числа

                String a = String.valueOf((Integer.toBinaryString(i).length()));
                System.out.println(a);

                // найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
                // массив m1

                int x = Short.MAX_VALUE - i;
                System.out.println(x);
                int n = Integer.valueOf(a);
                // int [] m = new int [x];

                for (int j = 0; j <= x; j++) {
                        if (j % n == 0) {
                                int[] m = { j };

                                System.out.println(Arrays.toString(m));
                        }

                }
// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
                int x2 = i - Short.MIN_VALUE;
                System.out.println(x2);

                for (int t = 0; t <= x2; t++){
                        if(t % n != 0){
                         int[] m2 = {t}; 
                         System.out.println(Arrays.toString(m2));      
                        }
                        


                }


        }
}
