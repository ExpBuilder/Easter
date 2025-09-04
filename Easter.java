public class Easter {
    public static void main(String[] args) {
        /* Joe J.
        This project predicts the date Easter falls on the year imputed in 'int y'. This will work for all years including and after 1583.*/
        int y = 2025;
        int a = y % 19;
        int b = y / 100;
        int c = y %  100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int r = (32 + 2 * (i + e) - (h + k))  % 7;
        int m = (a  + 11 * h + 22 * r) / 451;
        int n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(k);
        System.out.println(r);
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
        System.out.println("Easter in " + y + " falls in " + n + "/" + (p + 1));
     }
}
