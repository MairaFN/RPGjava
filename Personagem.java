package RPGp2;

import java.util.Scanner;

public class Personagem extends NPC {
    int especial;
    String classe;
    String[] iventario = new String[2];

    public Personagem(String nome, int hp, int especial, String classe) {
        super(nome, hp);
        this.especial = especial;
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public void imprimirPersonagem() {
        System.out.println("Nome do Personagem: " + nome);
        switch (classe) {
            case "guerreiro" -> System.out.println("""    
                    (o.o) |
                    / | \\_+
                     / \\""");
            case "feiticeiro" -> System.out.println("""    
                         *.º
                    (o.o)/
                    / |
                     / \\""");
            case "assassino" -> System.out.println("""
                                (ò-ó)
                                / | \\+--
                                 / \\
                    """);
        }
    }

    public void imprimeHP(Vilao vilao) {
        System.out.println("========================");
        System.out.println("-" + classe + "  HP:" + hp);
        System.out.println("* Especial  " + especial);

        System.out.println("""
                ========================
                -BASILISCO  HP:""" + vilao.getHp());
    }

    public int ataquePersonagem() {
        Scanner sc = new Scanner(System.in);

        switch (classe) {
            case "guerreiro" -> System.out.println("""
                    Escolha seu ataque:
                    1 - Soco
                    2 - Espada (-1 especial)""");
            case "feiticeiro" -> System.out.println("""
                    Escolha seu ataque:
                    1 - Cajado
                    2 - Bola de fogo (-1 especial)""");
            case "assassino" -> System.out.println("""
                    Escolha seu ataque:
                    1 - Voadora
                    2 - Katana (-1 especial)""");
        }

        int escolha;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                sc.next(); // descarta a entrada inválida
            }
            escolha = sc.nextInt();
            if (escolha == 1 || (escolha == 2 && especial > 0)) {
                break;
            } else if (escolha == 2) {
                System.out.println("Ataques especiais esgotados! Escolha um ataque normal.");
            } else {
                System.out.println("Opção inválida! Escolha 1 ou 2.");
            }
        }

        return escolha;
    }

    public void batalha() {
        int escAtaque;
        Vilao basilisco = new Vilao("basilisco", 270, "basilisco");

        basilisco.imprimirPersonagem();

        while (hp > 0 && basilisco.getHp() > 0) {
            imprimeHP(basilisco);

            escAtaque = ataquePersonagem();

            switch (escAtaque) {
                case 1 -> {
                    switch (classe) {
                        case "guerreiro" -> {
                            System.out.println("O guerreiro ataca com seus punhos! \n -7");
                            basilisco.setHp(basilisco.getHp() - 7);
                        }
                        case "feiticeiro" -> {
                            System.out.println("O feiticeiro ataca com seu cajado! \n -5");
                            basilisco.setHp(basilisco.getHp() - 5);
                        }
                        case "assassino" -> {
                            System.out.println("O assassino ataca dando uma voadora! \n -10");
                            basilisco.setHp(basilisco.getHp() - 10);
                        }
                    }
                }
                case 2 -> {
                    if (especial > 0) {
                        switch (classe) {
                            case "guerreiro" -> {
                                System.out.println("O guerreiro ataca com a Espada! \n -20");
                                basilisco.setHp(basilisco.getHp() - 20);
                                especial--;
                            }
                            case "feiticeiro" -> {
                                System.out.println("O feiticeiro lança uma bola de fogo! \n -25");
                                basilisco.setHp(basilisco.getHp() - 25);
                                especial--;
                            }
                            case "assassino" -> {
                                System.out.println("O assassino ataca com sua Katana! \n -20");
                                basilisco.setHp(basilisco.getHp() - 20);
                                especial--;
                            }
                        }
                    }
                }
            }

            if (basilisco.getHp() > 0) {
                System.out.println("O BASILISCO ataca!");
                if (escAtaque == 1) {
                    System.out.println("O BASILISCO ataca com uma asa! \n -5");
                    hp -= 5;
                } else if (escAtaque == 2) {
                    System.out.println("O BASILISCO ataca com fogo! \n -10");
                    hp -= 10;
                }
            } else {
                System.out.println("O basilisco foi derrotado!");
                System.out.println(" ");
            }
        }

        if (hp <= 0) {
            System.out.println("Você foi derrotado pelo basilisco!");
        }
    }
}
