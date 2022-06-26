/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Lehait
 */
public class User {
    private int iduser;
    private String username;
    private String password;
    private String dob;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String role;
    private String block;
    private String code;
    public User() {
    }

    public User(int iduser, String username, String password, String dob, String gender, String email, String phone, String address, String role, String block) {
        this.iduser = iduser;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.block = block;
    }

    

    public User(int iduser, String username, String phone, String address) {
        this.iduser = iduser;
        this.username = username;
        this.phone = phone;
        this.address = address;
    }

    public User(String username, String email, String code) {
        this.username = username;
        this.email = email;
        this.code = code;
    }
    
    
    
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

   
    @Override
    public String toString() {
        return "User{" + "iduser=" + iduser + ", username=" + username + ", password=" + password + ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address + ", role=" + role + ", block=" + block + '}';
    }

   
  
}
