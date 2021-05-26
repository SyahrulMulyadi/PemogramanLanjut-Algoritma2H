package TugasAlgoritma.gui;

public class Mahasiswa {
    private String nama,nim,jenjang,masuk,fakultas,jurusan,jenis,urut;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String jenjang, String masuk, String fakultas, String jurusan, String jenis, String urut) {
        this.nama = nama;
        this.nim = nim;
        this.jenjang = jenjang;
        this.masuk = masuk;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.jenis = jenis;
        this.urut = urut;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getMasuk() {
        return masuk;
    }

    public void setMasuk(String masuk) {
        this.masuk = masuk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getUrut() {
        return urut;
    }

    public void setUrut(String urut) {
        this.urut = urut;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", jenjang='" + jenjang + '\'' +
                ", masuk='" + masuk + '\'' +
                ", fakultas='" + fakultas + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", jenis='" + jenis + '\'' +
                ", urut='" + urut + '\'' +
                '}';
    }
}
