package com.example.kidsmathlearning.Model;

public class Cong {
    private int soThuNhat;
    private int soThuHai;
    private int Tong;

    public Cong() {
    }

    public Cong(int soThuNhat, int soThuHai, int tong) {
        this.soThuNhat = soThuNhat;
        this.soThuHai = soThuHai;
        Tong = tong;
    }

    public int getSoThuNhat() {
        return soThuNhat;
    }

    public void setSoThuNhat(int soThuNhat) {
        this.soThuNhat = soThuNhat;
    }

    public int getSoThuHai() {
        return soThuHai;
    }

    public void setSoThuHai(int soThuHai) {
        this.soThuHai = soThuHai;
    }

    public int getTong() {
        return Tong;
    }

    public void setTong(int tong) {
        Tong = tong;
    }
}
