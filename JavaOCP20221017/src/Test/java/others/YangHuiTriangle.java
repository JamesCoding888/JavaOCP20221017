package others;
public class YangHuiTriangle {
    public static void main(String[] args) {
        int n = 8; // 楊輝三角形的行數
        int[][] triangle = new int[n][n];

        // 初始化楊輝三角形
        for (int i = 0; i < n; i++) {
            // 每行的開頭和結尾都是 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // 計算中間的值
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // 輸出楊輝三角形
        for (int i = 0; i < n; i++) {
            // 打印空格，使三角形居中
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            // 打印數字
            for (int j = 0; j < i + 1; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
