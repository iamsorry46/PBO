/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUasSpk;

/**
 *
 * @author sorry
 */
public class service extends customer{
    private String email;
    public service(){
        
    }
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public service(String id, String name, String noPhone, String address, String email) {
        super(id, name, noPhone, address);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String temp) {
        this.email = temp;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Email : " + getEmail());
    }
    
}
