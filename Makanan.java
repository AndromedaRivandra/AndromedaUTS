public class Makanan extends Menu {
    public String giziMakanan, rasaMakanan;

    public Makanan(String namaMenu, double hargaMenu) {
        super(namaMenu, hargaMenu);
    }

    public void pemesananMakanan(String namaMenu, double hargaMenu) {
        System.out.println("Pesanan Makanan: " + namaMenu + " (Rp" + hargaMenu + ")");
    }
}

