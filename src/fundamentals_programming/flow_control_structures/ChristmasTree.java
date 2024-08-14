package fundamentals_programming.flow_control_structures;

import java.util.Scanner;

/**
 * ChristmasTree
 * Topics : loops, conditionals, I/O
 * The ChristmasTree exercise requires the user to input a number representing the height of the tree, excluding the trunk. The tree should be printed using asterisks (*) and must be perfectly centered. After printing the tree, the trunk should also be printed, and it must be centered relative to the tree.
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the tree");
        int lines = scan.nextInt();
        int spaces = lines - 1;
        //loops for tree height, without trunk
        for(int i=0; i<lines; i++) {
            //loop for center tree with spaces
            for (int k = spaces; k > 0; k--) {
                System.out.print(" ");
            }
            spaces--;
            //loop for draw the tree
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        if(lines>4) {
            int base = (lines * 2) - 1;
            int width_trunk = lines % 2 == 0 ? lines - 3 : lines - 2;
            int height_trunk = width_trunk / 2;
            spaces = (base - width_trunk) / 2;
            //loops for draw the trunk
            for (int i = 0; i < height_trunk; i++) {
                for (int k = spaces; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < width_trunk; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}