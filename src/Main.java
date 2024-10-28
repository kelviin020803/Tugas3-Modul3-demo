public class Main {
    public static void main(String[] args) {
        MenuKue Kue1 = new MenuKue("Roti", 5000, "Roti yang Lembut", true, 10);
        MenuKue Kue2 = new MenuKue("Wafer", 3000, "Wafer yang Renyah", false, 5);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();

        Kue1.updateStok(5);
        Kue2.setAvailability(true);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();
    }
}
