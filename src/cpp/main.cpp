#include <iostream>
#include <string>

using namespace std;

// Class Model 1: Matakuliah
class Matakuliah0003 {
private:
    string kodeMK;
    string namaMK;
    int sks;

public:
    // Constructor berparameter
    Matakuliah0003(string kode, string nama, int jumlahSks) {
        setKodeMK(kode);
        setNamaMK(nama);
        setSks(jumlahSks);
    }

    // Setter & Getter dengan validasi
    void setKodeMK(string kode) {
        if (!kode.empty()) kodeMK = kode;
        else kodeMK = "IF000";
    }
    string getKodeMK() const { return kodeMK; }

    void setNamaMK(string nama) {
        if (!nama.empty()) namaMK = nama;
        else namaMK = "Unknown";
    }
    string getNamaMK() const { return namaMK; }

    void setSks(int jumlahSks) {
        if (jumlahSks > 0 && jumlahSks <= 6) sks = jumlahSks;
        else sks = 3;
    }
    int getSks() const { return sks; }
};

// Class Model 2 & Pengelola: Mahasiswa
class Mahasiswa0003 {
private:
    string nim;
    string nama;
    double biayaKuliah; // Atribut numerik sesuai NIM (10.000)

public:
    // Constructor berparameter
    Mahasiswa0003(string nomorInduk, string namaMhs, double biaya) {
        setNim(nomorInduk);
        setNama(namaMhs);
        setBiayaKuliah(biaya);
    }

    // Setter & Getter dengan validasi
    void setNim(string nomorInduk) {
        if (!nomorInduk.empty()) nim = nomorInduk;
        else nim = "1001260003";
    }
    string getNim() const { return nim; }

    void setNama(string namaMhs) {
        if (!namaMhs.empty()) nama = namaMhs;
        else nama = namaMhs;
    }
    string getNama() const { return nama; }

    void setBiayaKuliah(double biaya) {
        if (biaya >= 0) biayaKuliah = biaya;
        else biayaKuliah = 10000.0;
    }
    double getBiayaKuliah() const { return biayaKuliah; }

    // Method Perhitungan Total Biaya Kuliah
    double hitungTotalBiaya(int totalSks) const {
        return biayaKuliah * totalSks;
    }
};

int main() {
    // Membuat Objek 1
    Mahasiswa0003 mhs1("1001260003", "Indrawan Lisanto", 10000.0);
    Matakuliah0003 mk1("IF104", "Pemrograman Berorientasi Objek", 3);

    // Membuat Objek 2 (Data berbeda)
    Mahasiswa0003 mhs2("1001269999", "Budi Santoso", 10000.0);
    Matakuliah0003 mk2("IF102", "Struktur Data", 4);

    cout << "=== PROGRAM AKADEMIK (C++) ===" << endl;
    cout << "--- Data Mahasiswa 1 ---" << endl;
    cout << "NIM         : " << mhs1.getNim() << endl;
    cout << "Nama        : " << mhs1.getNama() << endl;
    cout << "Mata Kuliah : " << mk1.getNamaMK() << " (" << mk1.getSks() << " SKS)" << endl;
    cout << "Biaya/SKS   : Rp " << mhs1.getBiayaKuliah() << endl;
    cout << "Total Biaya : Rp " << mhs1.hitungTotalBiaya(mk1.getSks()) << endl;

    cout << "\n--- Data Mahasiswa 2 ---" << endl;
    cout << "NIM         : " << mhs2.getNim() << endl;
    cout << "Nama        : " << mhs2.getNama() << endl;
    cout << "Mata Kuliah : " << mk2.getNamaMK() << " (" << mk2.getSks() << " SKS)" << endl;
    cout << "Biaya/SKS   : Rp " << mhs2.getBiayaKuliah() << endl;
    cout << "Total Biaya : Rp " << mhs2.hitungTotalBiaya(mk2.getSks()) << endl;

    return 0;
}
