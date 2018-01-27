/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author sorry
 */
public class RecordMhs {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int MhsCount;
    
    public String getName (){ //method accessor, mendapatkan nama mhs
        return name;
    }
    public void setName (String temp){ //method mutator, mengubah nama mhs
        name = temp;
    }
    public double getAverage (){ //rata-rata
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }
    public static int getMhsCount(){ //mendapatkan jumlah instace RecordMhs
        return MhsCount;
    }
}
