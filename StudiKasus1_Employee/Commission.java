// Commission.java
// Represents an employee that earns hourly pay plus a sales commission.
public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Konstruktor menerima 6 parameter (5 diteruskan ke super, 1 untuk rate komisi)
    public Commission(String eName, String eAddress, String ePhone, 
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }

    // Menambahkan jumlah penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Menghitung total gaji (gaji jam kerja + komisi penjualan)
    @Override
    public double pay() {
        double payment = super.pay(); // Memanggil pay() milik Hourly
        payment += totalSales * commissionRate;
        totalSales = 0; // Mereset total penjualan
        return payment;
    }

    // Menampilkan data informasi karyawan beserta total sales
    @Override
    public String toString() {
        return super.toString() + "\nTotal sales: " + totalSales;
    }
}