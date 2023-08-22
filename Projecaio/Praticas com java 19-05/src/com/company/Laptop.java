package com.company;

public class Laptop extends DispositivoEletronico {
    private boolean ligado;

    public Laptop(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        System.out.println("Laptop ligado.");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Laptop desligado.");
        ligado = false;
    }

    public void executarPrograma(String programa) {
        if (ligado) {
            System.out.println("Executando o programa: " + programa);
        } else {
            System.out.println("Ligue o laptop antes de executar um programa!");
        }
    }
}

