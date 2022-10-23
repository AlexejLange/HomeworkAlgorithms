package homeworkHanoi;
/**
 * Algorithms. Homework Hanoi
 * @author Alexej Lange
 * @version 30 Sep 2022
 */

public class Hanoi {
    public static void main(String[] args) {
        playHanoi(3, 'A', 'B', 'C');
    }

    public static void playHanoi(int diskQuantity, char start, char help, char finish) {
        if (diskQuantity == 1) {
            System.out.printf("Disk 1 move %s -> %s\n", start, finish);
        } else {
            playHanoi(diskQuantity - 1, start, finish, help);
            System.out.printf("Disk %d move %s -> %s\n", diskQuantity, start, finish);
            playHanoi(diskQuantity - 1, help, start, finish);
        }
    }
}
