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
public class customer {
    private String id;
    private String name;
    private String noPhone;
    private String address;
    
    public customer (){
        
    }
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public customer(String id, String name, String noPhone, String address) {
        this.id = id;
        this.name = name;
        this.noPhone = noPhone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String temp) {
        this.id = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String temp) {
        this.name = temp;
    }

    public String getNoPhone() {
        return noPhone;
    }

    public void setNoPhone(String temp) {
        this.noPhone = temp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String temp) {
        this.address = temp;
    }   
    
    public void info(){
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Handphone Number : " + getNoPhone());
        System.out.println("Address : " + getNoPhone());
    }
}
