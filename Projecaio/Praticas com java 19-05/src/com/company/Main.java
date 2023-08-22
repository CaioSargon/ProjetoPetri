package com.company;

import java.util.Scanner;


class DispositivoEletronico {
    private String marca;
    private String modelo;
    private int ano;

    public DispositivoEletronico(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o tipo de dispositivo eletrônico:");
            System.out.println("1. Tablet");
            System.out.println("2. Laptop");
            System.out.println("3. Smartwatch");
            System.out.println("4. Descansar dos aparelhos.");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                Tablet tablet = criarTablet(scanner);
                interagirComTablet(tablet, scanner);
            } else if (escolha == 2) {
                Laptop laptop = criarLaptop(scanner);
                interagirComLaptop(laptop, scanner);
            } else if (escolha == 3) {
                Smartwatch smartwatch = criarSmartwatch(scanner);
                interagirComSmartwatch(smartwatch, scanner);
            } else if (escolha == 4) {
                System.out.println("Obrigado por usar os meus aparelhos.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }


    private static Tablet criarTablet(Scanner scanner) {
        System.out.println("Informe a marca do tablet:");
        String marca = scanner.next();

        System.out.println("Informe o modelo do tablet:");
        String modelo = scanner.next();

        System.out.println("Informe o ano do tablet:");
        int ano = scanner.nextInt();

        Tablet tablet = new Tablet(marca, modelo, ano);
        return tablet;
    }

    private static void interagirComTablet(Tablet tablet, Scanner scanner) {
        while (true) {
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Assistir a um vídeo");
            System.out.println("4. Colocar  no Carregador. ");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                tablet.ligar();
            } else if (escolha == 2) {
                tablet.desligar();
            } else if (escolha == 3) {
                System.out.println("Informe o nome do vídeo:");
                String video = scanner.next();
                tablet.assistirVideo(video);
            } else if (escolha == 4) {
                System.out.println("Carregando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static Laptop criarLaptop(Scanner scanner) {
        System.out.println("Informe a marca do laptop:");
        String marca = scanner.next();

        System.out.println("Informe o modelo do laptop:");
        String modelo = scanner.next();

        System.out.println("Informe o ano do laptop:");
        int ano = scanner.nextInt();

        Laptop laptop = new Laptop(marca, modelo, ano);
        return laptop;
    }

    private static void interagirComLaptop(Laptop laptop, Scanner scanner) {
        while (true) {
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Executar um programa");
            System.out.println("4. Fechar laptop");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                laptop.ligar();
            } else if (escolha == 2) {
                laptop.desligar();
            } else if (escolha == 3) {
                System.out.println("Informe o nome do programa:");
                String programa = scanner.next();
                laptop.executarPrograma(programa);
            } else if (escolha == 4) {
                System.out.println("Fechou laptop");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static Smartwatch criarSmartwatch(Scanner scanner) {
        System.out.println("Informe a marca do smartwatch:");
        String marca = scanner.next();

        System.out.println("Informe o modelo do smartwatch:");
        String modelo = scanner.next();

        System.out.println("Informe o ano do smartwatch:");
        int ano = scanner.nextInt();

        Smartwatch smartwatch = new Smartwatch(marca, modelo, ano);
        return smartwatch;
    }

    private static void interagirComSmartwatch(Smartwatch smartwatch, Scanner scanner) {
        while (true) {
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Monitorar atividade física");
            System.out.println("4. Guardar o Smartwatch");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                smartwatch.ligar();
            } else if (escolha == 2) {
                smartwatch.desligar();
            } else if (escolha == 3) {
                smartwatch.monitorarAtividade();
            } else if (escolha == 4) {
                System.out.println("Guardou Smartwatch");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
