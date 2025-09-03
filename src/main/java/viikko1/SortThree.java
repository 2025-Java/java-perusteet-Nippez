package viikko1;

public class SortThree {

    public static String ascending(int a, int b, int c) {
        int yks, kaks, kolm;

        if (a <= b && a <= c) {
            yks = a;
            if (b <= c) {
                kaks = b;
                kolm = c;
            } else {
                kaks = c;
                kolm = b;
            }
        } else if (b <= a && b <= c) {
            yks = b;
            if (a <= c) {
                kaks = a;
                kolm = c;
            } else {
                kaks = c;
                kolm = a;
            }
        } else {
            yks = c;
            if (a <= b) {
                kaks = a;
                kolm = b;
            } else {
                kaks = b;
                kolm = a;
            }
        }

        return yks + "," + kaks + "," + kolm;
    }

}
