package com.example.kidsmathlearning.Model;

public class Tru {
    private int soTru;
    private int soBiTru;
    private int Hieu;

    public Tru() {
    }

    public Tru(int soTru, int soBiTru, int hieu) {
        this.soTru = soTru;
        this.soBiTru = soBiTru;
        Hieu = hieu;
    }

    public int getSoTru() {
        return soTru;
    }

    public void setSoTru(int soTru) {
        this.soTru = soTru;
    }

    public int getSoBiTru() {
        return soBiTru;
    }

    public void setSoBiTru(int soBiTru) {
        this.soBiTru = soBiTru;
    }

    public int getHieu() {
        return Hieu;
    }

    public void setHieu(int hieu) {
        Hieu = hieu;
    }
}
