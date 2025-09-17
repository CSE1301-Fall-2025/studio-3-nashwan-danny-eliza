public class Sieve {
    public static void main(String[] args) {
        boolean [] a = new boolean[10];
        for (int i = 0; i < a.length; i++) {
        a[i] = true; }

        for (int i = 2; i < Math.sqrt(100); i++) {
        if (a[i] == true) {
        for (int j = i*i; j<10; j+=i) {
        a[j] = false;
        }
        if (a[i] == true)
        System.out.println(i);
}
}
}
}
    