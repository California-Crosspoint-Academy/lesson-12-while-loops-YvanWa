// yvan
public class exercise{
    public static void main(String[]args){
       import java.util.Scanner;

        // Q1: Skeleton of while-loop
        // while(condition) {
        //     // body
        // }

        // Q2: Skeleton of do-while loop
        // do {
        //     // body
        // } while(condition);

        // Q3: 
        int mVar = 97;
        int k = 1, p = 0;
        while (mVar <= 195) {
            k = k * k + 3 * mVar;
            p = p + mVar + 1;
            mVar++;
        }

        // Q4: 
        int v = 2;
        k = 1;
        double q = 0.0;
        do {
            k = k * k + 3 * v;
            q = Math.sqrt(q + v + 1);
            v *= 3;
        } while (v <= 195);

        // Q5:  !done

        // Q6: Error → 'do;'  should be 'do { } while(condition);'

        // Q7: Infinite loop

        // Q8: Infinite loop 

        // Q9: Errors → 1) 'done' not declared/initialized  2) Extra semicolon after closing brace

        // Q10: Complete code
        int i = 0, j;
        while (i <= 3) {
            for (j = 0; j <= 2; j++) {
                System.out.print(i + "," + j + " ");
            }
            i++;
        }
        System.out.println();

        // Q11: Use 'break;' to exit loop prematurely

        // Q12:  while-loop or for-loop

        // Q13: Complete code
        double m = 92.801;
        j = 0;
        do {
            j = j + 2;
            if (j > -100)
                continue;
            m += 3;
        } while (j < 6);
        System.out.println(m);

        // Q14
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter an integer (0 to stop): ");
            num = sc.nextInt();
            if (num != 0) {
                System.out.println("Square: " + (num * num));
            }
        } while (num != 0);


        // Q1:  D 

        // Q2:  D 

        // Q3:  A 

        // Q4:  E

        // Q5:  E 
}
}
