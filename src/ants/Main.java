package ants;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(3, 3, 1));

    }

    public static int calculate(int n, int left, int rignt) {
        int count = 0;
        count = goForward(n, left, rignt, count);
        return count;
    }

    private static int goForward(int n, int left, int rignt, int count) {
        if (left - 1 == rignt) {
            count = goBackward(n, left, rignt, count);
            return count;
        }
        left--;
        if (left < 0)
            return ++count;
        if (rignt + 1 == left) {
            count = goBackward(n, left, rignt, count);
            return count;
        }
        rignt++;
        if (rignt > n)
            return ++count;
        count++;
        count = goForward(n, left, rignt, count);
        return count;
    }

    private static int goBackward(int n, int left, int rignt, int count) {
        left++;
        if (left > n)
            return ++count;
        rignt--;
        if (rignt < 0)
            return ++count;
        count++;
        count = goBackward(n, left, rignt, count);
        return count;
    }
}
