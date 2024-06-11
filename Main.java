package RPGp2;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] escolha = new char[6];
        Historia historia = new Historia();

        historia.logo();
        historia.pausa();

        Personagem jogador = historia.criar();
        jogador.imprimirPersonagem();

        historia.texto1(jogador);
        escolha[0] = historia.Ler();

        historia.texto2(jogador);
        Inventario(jogador);

        jogador.batalha();
        jogador.iventario[1] = "dente de basilisco";

        historia.texto3(jogador);
        char op;
        System.out.println("""
            Rudolff - Uhuhu! Vamos lá, meu caro. A Primeira charada é bem difícil de resolver, para atravessar a ponte,
            é preciso saber: o que é, o que é? Não tem pé, roda, asa, ventre ou nadadeira, mas mesmo sem ser carregada
            pode dar ao mundo uma volta inteira.

                a- Uma notícia.
                b- O vento.
                c- A água.
            """);
        op = historia.Ler();
        while(op != 'a'){
            System.out.println("""
            Rudolff - Ora, parceiro, você precisa melhorar! Suas habilidades estão deixando a desejar. Lhe
            pergunto outra vez, e agora me responda sem timidez. o que é, o que é? Não tem pé, roda, asa,
            ventre ou nadadeira, mas mesmo sem ser carregada pode dar ao mundo uma volta inteira.

                a- Uma notícia.
                b- O vento.
                c- A água.
            """);
            op = historia.Ler();
        }
        historia.pausa();
        do {
            System.out.println("""
                Rudolff - Oh, que maravilha! Pelo visto você não é mesmo uma ervilha. Agora preciso dizer outra
                charada, para que você, meu camarada, possa continuar sua jornada: eu posso guardar tudo dentro
                de mim. Tudo o que você pode imaginar: o vento, as florestas, o mundo, o universo e até mesmo Deus.
                Tudo o que vier à sua cabeça você pode encontrar dentro de mim. Quem sou eu?

                a- Caixa de pandora.
                b- A própria mente.
                c- O alfabeto.
            """);
            op = historia.Ler();
        } while(op != 'c');

        historia.texto4(jogador);
        escolha[1] = historia.Ler();

        historia.texto5(jogador);
        escolha[2] = historia.Ler();
        if(escolha[2] == 'a'){
            System.out.println("Tarik - Sabia que não podia confiar em você de toda forma.");
        } else if(escolha[2] == 'b'){
            System.out.println("Tarik - Mesmo que tenha sido para se defender, você não tinha o direito.");
        }

        historia.texto6(jogador);
        escolha[3] = historia.Ler();

        conclusao(escolha[3], jogador);

        System.out.println("""
            |--------------------|
            |                    |
            | Você chegou ao fim |
            |                    |
            |--------------------|
                \\   ^__^
                 \\  (oo)\\_______
                    (__)\\       )\\/\\
                        ||----w |
                        ||     ||
            """);

        historia.escolha(escolha);
        historia.pausa();

        historia.referencias();
        sc.close();
    }

    private static void Inventario(Personagem jogador) {
        switch (jogador.getClasse()) {
            case "guerreiro" -> jogador.iventario[0] = "espada";
            case "feiticeiro" -> jogador.iventario[0] = "cajado";
            case "assassino" -> jogador.iventario[0] = "katana";
        }
    }


    private static void conclusao(char escolha, Personagem jogador) {
        System.out.println("Você consegue alcançar o dente do basilisco, desamarra as cordas que o prendem e rapidamente \ncorre em direção a Tarik.");
        jogador.iventario[1] = null;

        if(escolha == 'a'){
            System.out.println("""
            Você enfia o dente no coração de Tarik, ele parece surpreso, não estava esperando que isso acontecesse,
            mas ele não parece assustado, com medo. Muito pelo contrário, ele está com um belo sorriso no rosto.
            Você está confuso, está sem seu(a)""" + jogador.iventario[0] + """
            então não tem muito o que fazer, mas antes que possa pensar em dar um soco na cara de Tarik, ele te apunhala
            com uma adaga.

            Tarik - Tirei minha pequena amostra de veneno do basilisco antes de te deixar sozinho com ele. E você deveria
            saber que precisa do basilisco em si para conseguir seu veneno, só seu dente não faz nada. Nem perfura minha
            pele o suficiente.

            Você já não sente mais seus músculos, suas pernas estão completamente paralisadas, você sente seu rosto formigar,
            suas mãos tremem tanto que você não consegue mais segurar o dente entre os dedos. Sua visão começa a ficar turva,
            tudo está ficando preto outra vez.

            Mas dessa vez você não saberá o que aconteceu de fato quando acordar.

            Você não vai se levantar novamente.

            Nunca mais.
            """);
        } else if(escolha == 'b'){
            System.out.println("""
            Você pega a cadeira e joga na direção de Tarik com toda sua força, mas a velocidade não foi o suficiente,
            um guarda reage e se joga na frente da cadeira, deixando Tarik intacto. Com isso, você apenas pensa em correr
            para pegar seu(a)""" + jogador.iventario[0] + """
            , apenas consegue pensar em tentar soltar o rei. Corre o mais rápido que pode,
            mas antes que consiga atravessar a porta, um dos guardas o atinge com seu escudo. Você cai tonteando.

            Tarik vem até você, os guardas o erguem, você já não tem mais forças para se soltar.

            Tarik - Vejo que não aprendeu sua lição, sabe,""" + jogador.getNome() + """
            , mesmo que você fosse o""" + jogador.getClasse() + """
            mais forte do reino, que nem a este reino você pertence, você não aprende o que é mais importante. Sempre estar
            um passo a frente de seu oponente.

            Tarik então saca a espada de sua bainha presa a cintura, ele a admira por alguns segundos antes de a erguer.
            Você não sabe o que esperar dele, ele tanto pode enfiar a espada em seu coração como pode apenas a entregar
            e te oferecer um cargo.

            Mas nada disso acontece. E você não tem certeza do que realmente aconteceu.

            Sua última visão é Tarik vindo com a espada na sua direção.

            Seu pescoço sendo perfurado pela lâmina extremamente afiada.

            Sua cabeça rola no chão.

            Mas você não chega a ver isso acontecendo.

            Você já não vê mais nada.
            """);
        }
    }
}
