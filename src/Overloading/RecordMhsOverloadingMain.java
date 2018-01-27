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
public class RecordMhsOverloadingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RecordMhsOverloading x = new RecordMhsOverloading();
        x.setName("Faizah");
        x.setAddress("Jati Sari");
        x.setAge(23);
        x.setMathGrade(89.8);
        x.setEnglishGrade(99.8);
        x.setAlgoGrade(65.7);
        x.print(x.getMathGrade(), x.getEnglishGrade(),x.getAlgoGrade());
    }
    
}
