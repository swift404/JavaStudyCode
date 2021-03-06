package lagou.homework2;



import java.util.Scanner;

/**
 *
 */
public class WuZiQi {
    /**
     * 五子棋
     * 目标： 编程实现控制台版并支持两人对战的五子棋游戏
     * (1)绘制棋盘
     * (2)提示黑方（用 1 表示）和白方（用 2 表示）分别下棋（X，Y 轴位置）并重新绘制棋盘。
     * (3)每当一方下棋后判断是否获胜 。
     * (4)提示：采用二维数组来模拟棋盘。
     *
     * @param args
     */
    public static void main(String[] args) {
        //先绘制棋盘
        int[][] map = new int[16][16];
        //利用数组直接将棋盘绘的第一列第一行坐标绘制出
        for (int i = 1; i < 16; i++) {
            map[0][i] = i;
            map[i][0] = i;
        }
        Scanner input = new Scanner(System.in);
        Show(map);
        boolean flag = true;//
        int x;
        int y;
        while (true) {
            do {
                System.out.println("请黑方落子(格式：行号 列号):");
                x = input.nextInt();
                y = input.nextInt();
            } while (!IsEmpty(map, x, y));
            map[x][y] = 1;
            Show(map);
            if (!Win(map)) {
                break;
            }
            do {
                System.out.println("请白方落子(格式：行号 列号):");
                x = input.nextInt();
                y = input.nextInt();
            } while (!IsEmpty(map, x, y));//IsEmpty  = flase

            map[x][y] = 2;
            Show(map);

            if (!Win(map)) {
                break;
            }
            if (x>15&&x<0&&y>15&&y<0)
            {
                System.out.println("输入的坐标超出范围请重新输入");
            }

        }

    }

    //显示棋盘，并将棋盘坐标对齐


    public static void Show(int[][] map) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if ((i == 0 && j > 9) || (j == 0 && i > 9)) {
                    System.out.print(map[i][j] + " ");
                } else {
                    System.out.print(map[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }

    //判断黑白双方是否获胜
    public static boolean Win(int[][] map) {
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                if (map[i][j] == 1) {  //如果是map【i】【j】 = 1，则是白棋
                    //此处将棋子从上到下，从左到右，从左下到右上，从坐上到右下四种情况都列出，符合其中一种则胜利
                    if ((map[i][j + 1] == 1 && map[i][j + 2] == 1 && map[i][j + 3] == 1 && map[i][j + 4] == 1) || (map[i + 1][j] == 1 && map[i + 2][j] == 1 && map[i + 3][j] == 1 && map[i + 4][j] == 1) || (map[i + 1][j + 1] == 1 && map[i + 2][j + 2] == 1 && map[i + 3][j + 3] == 1 && map[i + 4][j + 4] == 1)) {
                        System.out.println("黑子获胜");
                        return false;
                    }
                } else if (map[i][j] == 2) {
                    if ((map[i][j + 1] == 2 && map[i][j + 2] == 2 && map[i][j + 3] == 2 && map[i][j + 4] == 2) || (map[i + 1][j] == 2 && map[i + 2][j] == 2 && map[i + 3][j] == 2 && map[i + 4][j] == 2) || (map[i + 1][j + 1] == 2 && map[i + 2][j + 2] == 2 && map[i + 3][j + 3] == 2 && map[i + 4][j + 4] == 2)) {
                        System.out.println("白子获胜");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //判断此位置是否已有棋子
    public static boolean IsEmpty(int[][] map, int x, int y) {
        if (map[x][y] == 0) {
            return true;//如果这个位置等于0，则返回true值，证明此处为空，可以下棋
        }else {
            System.out.println("此位置已有棋子，请重新输入");
            return false;
        }

    }
}