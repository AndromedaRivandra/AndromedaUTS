public class Transaksi {
    public String metodePembayaran;
    public double nominalPembayaran;
    private String nomorRekening;

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void strukPembayaran(KeranjangBelanja keranjang) {
        System.out.println(" STRUK PEMBAYARAN ");
        double total = 0;
        
        for (Menu menu : keranjang.daftarPesanan) {
            System.out.println("- " + menu.getNamaMenu() + " : Rp" + menu.getHargaMenu());
            total += menu.getHargaMenu();
        }
        
        System.out.println("Total Tagihan : Rp" + total);
        System.out.println("Dibayar       : Rp" + nominalPembayaran);
        System.out.println("Kembalian     : Rp" + (nominalPembayaran - total));
    }
}

