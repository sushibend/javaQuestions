import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.5
//        Scanner sc = new Scanner(System.in);
//        System.out.println(oneAway(sc.nextLine(), sc.nextLine()));
        //1.6
       // System.out.println(compression("a"));
        // 1.7
//        int[][] mat = {{1,2,3,4}, {5,6,7,8}, {9, 10,11,12},{13,14,15,16}};
//        rotation(mat);

    }

    public static boolean oneAway(String one, String two) {
        if (one.length() == two.length()) {
            // check for one different letter
            return replace(one, two);
        } else if (one.length() - two.length() == 1) {
            return insertOne(one, two);
        } else if (two.length() - one.length() == 1) {
            return insertOne(two, one);
        }
        return false;
    }

    public static boolean replace(String one, String two) {
        boolean stop = false;
        for (int i = 0; i < one.length(); i++) {

            if (one.charAt(i) != two.charAt(i)) {
                if (stop) {
                    return false;
                }
                stop = true;
            }
        }
        return true;
    }

    public static boolean insertOne(String longer, String shorter) {
        boolean stop = false;
        int longerIndex = 0;
        for (int i = 0; i < shorter.length(); i++) {
            if (longer.charAt(longerIndex) != shorter.charAt(i)) {
                if (stop) {
                    return false;
                }
                stop = true;
                longerIndex++;
            }

            longerIndex++;
        }
        return true;
    }


    public static String compression(String tgt) {
        if (tgt.length() == 0) {
            return tgt;
        }

        StringBuilder sb = new StringBuilder();
        char current = tgt.charAt(0);
        int count = 1;
        sb.append(current);
        for (int i = 1; i < tgt.length(); i++) {
            if (sb.length() >= tgt.length()) {
                return tgt;
            }
            if (tgt.charAt(i) == current) {
                count++;
            } else {
                sb.append(count);
                current = tgt.charAt(i);
                sb.append(current);
                count = 1;
            }


        }
        sb.append(count);
        if (sb.length() >= tgt.length()) {
            return tgt;
        }
        return sb.toString();
    }

    public static boolean  rotation(int[][] mat) {


        if (mat.length == 0 || mat.length != mat[0].length) {
            return false;
        }

        printMat(mat);


        int length = mat.length;
        //layers


        for (int i = 0; i < length / 2; i++) {
            // swaps in this layer = length - 1 - i -i
            for (int j = i; j < length-1 - i; j++) {
                // starting point for swapping
                int temp = mat[i][j];
                int dist = length-1;
                // actual swapping takes place
                //left to top
                mat[i][j] = mat[dist-j][i];

                //bottom to left
                mat[dist-j][i] = mat[dist-i][dist - j];

                //right to bottom
                mat[dist-i][dist - j] = mat[j][dist-i];

                //top to right
                mat[j][dist-i] = temp;
                printMat(mat);
            }
        }
        printMat(mat);

        return true;
    }

    public static void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
