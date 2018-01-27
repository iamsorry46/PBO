/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author sorry
 */
public class RecordMhsOverloading {
  private String name;
  private String address;
  private int age;
  private double mathGrade;
  private double englishGrade;
  private double algoGrade;
  
  public void print (String temp){
      System.out.println("Name : " + name);
      System.out.println("Address : " + address);
      System.out.println("Age : " + age);
  }
  public void print (double mGrade, double eGrade, double aGrade){
      System.out.println("Name : " + name);
      System.out.println("Nilai Matematika : " + mGrade);
      System.out.println("Nilai bInggirs : " + eGrade);
      System.out.println("Nilai Algo : " + aGrade); 
  }
  public void print (){
      
  }
  
  //method accessor, mendapatkan nama mhs
  public String getName(){
      return name;
  }
  public double getMathGrade (){
      return mathGrade;
  }
  public double getEnglishGrade (){
      return englishGrade;
  }
  public double getAlgoGrade (){
      return algoGrade;
  }
  //method mutator, mengubah nama mhs
  public void setName (String temp){
      name = temp;
  }
  public void setAddress (String temp){
      address = temp;
  }
  public void setAge (int temp){
      age = temp;
  }
  public void setMathGrade (double temp){
      mathGrade = temp;
  }
  public void setEnglishGrade (double temp){
      englishGrade = temp;
  }
  public void setAlgoGrade (double temp){
      algoGrade = temp;
  }
}
