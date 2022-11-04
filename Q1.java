public class Q1 {
    public static void main(String[] args) {
        int n = 1;
        int m = -1;
        if (n < -m) System.out.print(n+"\n");
        else System.out.print(m+"\n");
        n = 1;
        m = -1;
        if (-n >= m)
        { System.out.print(n+"\n"); }
        else { System.out.print(m+"\n"); }
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1)
        { System.out.print(x+"\n"); }
        else { System.out.print(y+"\n"); }
        x = Math.sqrt(2);
        y = 2;
        if (x * x == y)
        { System.out.print(x+"\n"); }
        else { System.out.print(y+"\n"); }
    }
}
