import java.util.Scanner;

public class Main {
/* Creator: Mads Nielsen
    d. 21 - 09 - 2017
    commit test
    for at uploade på github :  VCS -> Import to version control -> Share ... Github.
    for at commit: VCS -> Commit (ctrl+k) -> (commit)commit and push -> push.
 */
    public static void main(String[] args) {
        //læser input
        Scanner enterRadius = new Scanner(System.in);
        System.out.println("Enter a number for radius :");
           
        //Variabler der kalkulerer areal, og indhenter nextDouble
        double radius = enterRadius.nextDouble();
        double areal = (radius*radius*Math.PI);

        System.out.println("Arealet er , med "+radius+" som radius : " + areal);
    }
}
