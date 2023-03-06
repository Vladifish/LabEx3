import java.util.Scanner;

/*  Tabuzo, Abdiel Clarence && Velazco, Vladimir Gray
    LabEx3.java
    Purpose: TBD
    ISC2605 - 1CSC

    Notes:
 */
public class LabEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Tabuzo, Abdiel Clarence");
        System.out.println("Velazco, Vladimir Gray");
        System.out.println(" ");

        System.out.println("Enter a non-negative integer:");
        int t = input.nextInt();

        System.out.print("Enter the number of syllables in the song (s): ");
        int s = input.nextInt();

        System.out.print("Enter the number of children (up to 26) (n): ");
        int n = input.nextInt();

        Queue<String> queue = new Queue<>();

        for (int i = 0; i < n; i++) {
            char childName = (char) ('A' + i);
            queue.enqueue(Character.toString(childName));
        }

        System.out.print("The children's names are: ");

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
















    }
}
