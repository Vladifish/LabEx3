import java.util.Scanner;

/*  Tabuzo, Abdiel Clarence && Velazco, Vladimir Gray
    LabEx3.java
    Purpose: TBD
    ISC2605 - 1CSC

    Notes:
 */
public class LabEx3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Tabuzo, Abdiel Clarence");
        System.out.println("Velazco, Vladimir Gray");
        System.out.println(" ");

        System.out.println("Enter a non-negative integer:");
        int t = input.nextInt();

        if (t == 1)
            pen_pen_de_Sarapen();
    }

    static void pen_pen_de_Sarapen() {
        System.out.print("Enter the number of syllables in the song (s): ");
        int s = input.nextInt();

        System.out.print("Enter the number of children (up to 26) (n): ");
        int n = input.nextInt();

        // queues the children
        Queue<Character> children = new Queue<>(n);
        System.out.print("The children's names are: ");
        for (int i = 0; i < n; i++) {
            char name = (char) ('A' + i);
            System.out.print(name);
            children.enqueue(name);
        }
        System.out.println();

        // the game itself
        Stack<Character> winners = new Queue<>(n);
        while (!children.isEmpty()) {
            Queue<Character> tempQueue = new Queue<>(n);
            for (int i = 0; i < s - 1; i++) { // iterates through syllables

            }
        }
    }
}
