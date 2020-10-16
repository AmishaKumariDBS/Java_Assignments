package com.training.org;

import javax.management.relation.Role;
import java.util.List;

public class User {

        private String email;
        private String phone;
        private String password;
        private Address address;
        private boolean ver;
        private List<Role> role;
        private boolean enable;


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
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public boolean isVer(){return ver;}
        public void setVer(boolean ver){this.ver = ver;}
        public Address getAddress() {
        return address;
         }
         public void setAddress(Address address) {
        this.address = address;
    }
    public List<Role> getRole(){
            return role;

        }
    public void setRole(List<Role> role){this.role = role;}
        @Override
        public String toString() {
            return "User's [email=" + email + ", phone number=" + phone + ", password=" + password + "Address"+ address + "]";
        }

}
