public class Mahasiswa0003 {
  private String nim;
  private String nama;
  private double biayaKuliah; // Atribut numerik sesuai NIM (10.000)

  // Constructor berparameter
  public Mahasiswa0003(String nim, String nama, double biayaKuliah) {
    setNim(nim);
    setNama(nama);
    setBiayaKuliah(biayaKuliah);
  }

  // Getter dan Setter dengan validasi
  public String getNim() {
    return nim;
  }

  public void setNim(String nim) {
    if (nim != null && !nim.trim().isEmpty()) {
      this.nim = nim;
    } else {
      this.nim = "1001260003"; // defauplt NIM jika input kosong
    }
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    if (nama != null && !nama.trim().isEmpty()) {
      this.nama = nama;
    } else {
      this.nama = "Mahasiswa"; // default nama jika input kosong
    }
  }

  public double getBiayaKuliah() {
    return biayaKuliah;
  }

  public void setBiayaKuliah(double biayaKuliah) {
    if (biayaKuliah >= 0) {
      this.biayaKuliah = biayaKuliah;
    } else {
      this.biayaKuliah = 10000.0; // Nilai dasar minimum
    }
  }

  // Method Perhitungan (Total biaya kuliah berdasarkan jumlah SKS yang diambil)
  public double hitungTotalBiaya(int totalSks) {
    return this.biayaKuliah * totalSks;
  }

  // Main Method / Pengelola Objek
  public static void main(String[] args) {
    // Membuat objek pertama
    Mahasiswa0003 mhs1 = new Mahasiswa0003("1001260003", "Indrawan Lisanto", 10000.0);
    Matakuliah0003 mk1 = new Matakuliah0003("IF104", "Pemrograman Berorientasi Objek", 3);

    // Membuat objek kedua (dengan data berbeda)
    Mahasiswa0003 mhs2 = new Mahasiswa0003("1001269999", "Budi Santoso", 10000.0);
    Matakuliah0003 mk2 = new Matakuliah0003("IF102", "Struktur Data", 4);

    System.out.println("=== PROGRAM AKADEMIK (JAVA) ===");
    System.out.println("--- Data Mahasiswa 1 ---");
    System.out.println("NIM         : " + mhs1.getNim());
    System.out.println("Nama        : " + mhs1.getNama());
    System.out.println("Mata Kuliah : " + mk1.getNamaMK() + " (" + mk1.getSks() + " SKS)");
    System.out.println("Biaya/SKS   : Rp " + mhs1.getBiayaKuliah());
    System.out.println("Total Biaya : Rp " + mhs1.hitungTotalBiaya(mk1.getSks()));

    System.out.println("\n--- Data Mahasiswa 2 ---");
    System.out.println("NIM         : " + mhs2.getNim());
    System.out.println("Nama        : " + mhs2.getNama());
    System.out.println("Mata Kuliah : " + mk2.getNamaMK() + " (" + mk2.getSks() + " SKS)");
    System.out.println("Biaya/SKS   : Rp " + mhs2.getBiayaKuliah());
    System.out.println("Total Biaya : Rp " + mhs2.hitungTotalBiaya(mk2.getSks()));
  }
}
