public final class BatmanJR extends Batman {
    // atribut
    private int peluru;

    // konstruktor
    public BatmanJR() {
        super();
        this.peluru = 5;
    }

    // Method
    public void tembak() {
        if (getPeluru() == 0) {
            System.out.println("peluru dalam keadaan kosong");
        } else {
            this.peluru--;
        }
    }

    public void setPeluru(int tambahPeluru) {
        this.peluru = tambahPeluru;
    }

    public int getPeluru() {
        return this.peluru;
    }
}