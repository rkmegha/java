import java.util.*;

public class Symmetric {
    int row;
    int column;
    int[][] array = new int[10][10];

    public void get_metrix() {
        int rc, cc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix , row count : ");
        this.row = sc.nextInt();
        System.out.print("Enter size of matrix , column count  : ");
        this.column = sc.nextInt();
        System.out.print("Enter matrix elements : ");
        for (rc = 0; rc < this.row; rc++) {
            for (cc = 0; cc < this.column; cc++) {
                this.array[rc][cc] = sc.nextInt();
            }
        }
    }

    public void is_symmetric() {
        int rc, cc, flag = 0;
        int[][] transpose = new int[10][10];

        for (rc = 0; rc < this.row; rc++) {
            for (cc = 0; cc < this.column; cc++) {
                transpose[cc][rc] = array[rc][cc];
            }
        }

        for (rc = 0; rc < this.row; rc++) {
            for (cc = 0; cc < this.column; cc++) {
                if (this.array[rc][cc] != transpose[rc][cc]) {
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("The matrix is Symmetric");
        } else {
            System.out.println("The matrix is not Symmetric");
        }
