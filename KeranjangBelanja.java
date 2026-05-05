import java.util.ArrayList;

public class KeranjangBelanja {
    public int jumlahItemMenu;
    public ArrayList<Menu> daftarPesanan = new ArrayList<>();

    public void tambah(Menu menu) {
        daftarPesanan.add(menu);
        jumlahItemMenu = daftarPesanan.size();
    }
}

