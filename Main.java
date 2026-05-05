public class Main {
    public static void main(String[] args) {
        Makanan nasgor = new Makanan("Nasi Goreng", 25000);
        Minuman teh = new Minuman("Es Teh", 5000);

        nasgor.pemesananMakanan(nasgor.getNamaMenu(), nasgor.getHargaMenu());
        teh.pemesananMinuman(teh.getNamaMenu(), teh.getHargaMenu());

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambah(nasgor);
        keranjang.tambah(teh);

        Transaksi trx = new Transaksi();
        trx.metodePembayaran = "Transfer";
        trx.nominalPembayaran = 50000;
        trx.setNomorRekening("123456789");
        
        trx.strukPembayaran(keranjang);
    }
}
