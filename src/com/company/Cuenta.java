package com.company;

public class Cuenta {
    int id;
    String nombre;
    float balance;

    public Cuenta(int id, String nombre, float balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getCuenta(){
       return "cuenta: " + this.id + " nombre: " + this.nombre + " balance: " + this.balance;
    }

    public float addCredito(float credito){
        setBalance(this.balance + credito);
        return this.balance;
    }

    public float addDebito(float debito){
        float balance = this.balance;
        if (debito >= this.balance){
            System.out.println("Usted no posee esa cantidad de dinero");
        }
        else{
            balance = balance - debito;
        }
        setBalance(balance);
        return this.balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
