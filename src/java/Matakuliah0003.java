public class Matakuliah0003 {
  private String kodeMK;
  private String namaMK;
  private int sks;

  // Constructor berparameter
  public Matakuliah0003(String kodeMK, String namaMK, int sks) {
    setKodeMK(kodeMK);
    setNamaMK(namaMK);
    setSks(sks);
  }

  // Getter dan Setter dengan validasi
  public String getKodeMK() {
    return kodeMK;
  }

  public void setKodeMK(String kodeMK) {
    if (kodeMK != null && !kodeMK.trim().isEmpty()) {
      this.kodeMK = kodeMK;
    } else {
      this.kodeMK = "IF000";
    }
  }

  public String getNamaMK() {
    return namaMK;
  }

  public void setNamaMK(String namaMK) {
    if (namaMK != null && !namaMK.trim().isEmpty()) {
      this.namaMK = namaMK;
    } else {
      this.namaMK = "Unknown";
    }
  }

  public int getSks() {
    return sks;
  }

  public void setSks(int sks) {
    if (sks > 0 && sks <= 6) {
      this.sks = sks;
    } else {
      this.sks = 3; // Default SKS standar
    }
  }
}
