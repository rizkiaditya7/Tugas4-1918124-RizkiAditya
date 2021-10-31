package com.example.praktikum_tugas4;

public class tni {
        private String nama,lahir,pangkat;
        private int foto;
        public tni(int foto,String nama, String lahir, String pangkat) {
            this.foto = foto;
            this.nama = nama;
            this.lahir = lahir;
            this.pangkat = pangkat;
        }
        public int getFoto(){
            return foto;
        }
        public String getNama () {
            return nama;
        }
        public String getLahir() {
            return lahir;
        }
        public String getPangkat() {
            return pangkat;
        }
    }
