public class MenuKue {
    private String namaKue;
    private int hargaKue;
    private String deskripsiKue;
    private boolean ketersediaan;
    private int stokKue;

    public MenuKue(String namaKue, int hargaKue, String deskripsiKue, boolean ketersediaan, int stokKue) {
        this.namaKue = namaKue;
        this.hargaKue = hargaKue;
        this.deskripsiKue = deskripsiKue;
        this.ketersediaan = ketersediaan;
        this.stokKue = stokKue;
    }

    public void tampilkanMenu() {
        System.out.println("Nama Kue: " + namaKue);
        System.out.println("Harga Kue: " + hargaKue);
        System.out.println("Deskripsi Kue: " + deskripsiKue);
        System.out.println("Availability: " + (ketersediaan ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("Stok Kue: " + stokKue);
    }

    public void updateStok(int jumlahStok) {
        stokKue += jumlahStok;
    }

    public void setAvailability(boolean availability) {
        ketersediaan = availability;
    }

}