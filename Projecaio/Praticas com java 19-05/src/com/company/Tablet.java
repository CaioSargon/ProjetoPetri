package com.company;

public class Tablet extends DispositivoEletronico {
    private boolean ligado;

    public Tablet(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        System.out.println("Tablet ligado.");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Tablet desligado.");
        ligado = false;
    }

    public void assistirVideo(String video) {
        if (ligado) {
            System.out.println("Assistindo ao vídeo: " + video);
        } else {
            System.out.println("Ligue o tablet antes de assistir a um vídeo!");
        }
    }
}