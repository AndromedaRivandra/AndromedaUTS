public class Minuman extends Menu {
    public String giziMinuman, rasaMinuman;

    public Minuman(String namaMenu, double hargaMenu) {
        super(namaMenu, hargaMenu);
    }

    public void pemesananMinuman(String namaMenu, double hargaMenu) {
        System.out.println("Pesanan Minuman: " + namaMenu + " (Rp" + hargaMenu + ")");
    }
}

