package com.dio;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanqueCombustivel;

    Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanqueCombustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanqueCombustivel * valorCombustivel;
    }
}
