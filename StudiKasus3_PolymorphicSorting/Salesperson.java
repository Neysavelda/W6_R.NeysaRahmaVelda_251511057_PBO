public class Salesperson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // Melengkapi compareTo untuk urutan penjualan dan pemutus tie nama
    public int compareTo(Object other) {
        Salesperson s = (Salesperson) other;
        if (totalSales < s.totalSales) return -1;
        if (totalSales > s.totalSales) return 1;

        int result = lastName.compareTo(s.lastName);
        if (result == 0) {
            result = firstName.compareTo(s.firstName);
        }
        return result;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSales() { return totalSales; }
}