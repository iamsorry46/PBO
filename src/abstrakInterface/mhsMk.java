/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrakInterface;

/**
 *
 * @author sorry
 */
public abstract class mhsMk implements mhsIdentitas, mhsNilai {
    private String nim, nama, jurusan, semester, data, nilai;
    private float tugas, kuis, uts, uas, total;
    
    public mhsMk (String nim, String nama, String jurusan, String semester, String data, String nilai, float tugas, float kuis, float uts, float uas, float toal){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        this.total = (tugas*(float)0.15)+(kuis*(float)0.15)+(uts*(float)0.3)+(uas*(float)0.4);
    
        if (total >= 90) {
            this.nilai = "A";
        }else if (total >= 70 && total < 90) {
            this.nilai = "B";
        }else if (total >= 60 && total < 70){
            this.nilai = "C";
        }else if (total >= 50 && total < 60){
            this.nilai = "D";
        }else {
            this.nilai = "E";
        }
        this.data = "Nim : "+nim+"\nNama : "+nama+"\nJurusan : "+jurusan+"\nSemester : "+semester+"\nTotal Nilai : "+total;  
    }
    public String biodata(){
        return data;
    }
    public float total(){
        return total;
    }
    public String nilai(){
        return nilai;
    }
}
