public class Batman {
    // Attributes
    private Boolean suara;
    private double jarak;
    private int performa;
    private double suhu;
    private String posisiSayap;

    // kons
    public Batman() {
        this.jarak = 0;
        this.performa = 1;
        this.suhu = 30;
    }

    // Method
    public void bicara (Boolean suara) {
        this.suara = suara;
    }

    public void setTerbang(double jarakNew) {
        if (jarakNew > this.performa * 10) {
            System.out.println("performa tidak mendukung");
        } else {
            this.jarak = jarakNew;
        }
    }

    public double getJarak() {
        return this.jarak;
    }

    public void setPerforma(int perform) {
        this.performa = perform;
    }

    public void bergelantungan() {
        if (this.suhu >= 25) {
            this.posisiSayap = "membuka";
        } else {
            this.posisiSayap = "menutup";
        }
    }

    public double getSuhu() {
        return this.suhu;
    }

    public String getPosisiSayap() {
        return this.posisiSayap;
    }
}