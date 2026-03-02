package org.example;

public abstract class MedicalStaff extends Character{
    private String role;

    public MedicalStaff(String name, String surname, String role) {
        super(name, surname);
        this.role = role;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
