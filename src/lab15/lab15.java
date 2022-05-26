package lab15;

public class lab15 {
    public static void main(String[] args) {
        int[][] myltiplyTabl = new int[10][10];
        for (int i = 0; i < myltiplyTabl.length; i++) {
            for (int j = 0; j < myltiplyTabl.length; j++) {
                myltiplyTabl[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", myltiplyTabl[i][j]);
            }
            System.out.println();
        }


    }

}
