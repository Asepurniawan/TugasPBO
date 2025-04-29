public class Main {
    public static void main(String[] args) {
        Batman batman1 = new Batman();
        Batman batman2 = new BatmanJR();

        batman1.setTerbang(8);
        batman2.setTerbang(8);

        System.out.println("Batman jarak: " + batman1.getJarak());
        System.out.println("BatmanJR jarak: " + batman2.getJarak());

        if (batman2 instanceof BatmanJR) {
            BatmanJR batmanJR = (BatmanJR) batman2;
            batmanJR.tembak();
            System.out.println("Peluru BatmanJR: " + batmanJR.getPeluru());
        }

        BatmanJR junior = new BatmanJR();
        junior.setPeluru(10);
        junior.tembak();
        System.out.println("Peluru setelah menembak: " + junior.getPeluru());

        junior.setPerforma(3);
        junior.setTerbang(35); // Should work now with higher performa
        System.out.println("Jarak terbang BatmanJR: " + junior.getJarak());
    }
}