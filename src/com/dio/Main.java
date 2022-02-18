package com.dio;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Corsa");
        carro1.setCapacidadeTanqueCombustivel(35);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanqueCombustivel());
        System.out.println(carro1.totalValorTanque(5.3));

        Carro carro2 = new Carro("Cinza", "Celta", 37);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanqueCombustivel());
        System.out.println(carro2.totalValorTanque(5.34));

    }


}
