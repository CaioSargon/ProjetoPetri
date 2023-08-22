package com.company;

public
class Smartwatch extends DispositivoEletronico {
    private boolean ligado;

    public Smartwatch(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        System.out.println("Smartwatch ligado.");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Smartwatch desligado.");
        ligado = false;
    }

    public void monitorarAtividade() {
        if (ligado) {
            System.out.println("Monitorando atividade física.");
        } else {
            System.out.println("Ligue o smartwatch para monitorar a atividade!");
        }
    }
}
