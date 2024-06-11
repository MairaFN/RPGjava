package RPGp2;
import java.util.Scanner;

public class Historia implements Menu{

    @Override
    public void logo() {
        System.out.println("\u001B[31m");
        System.out.println("""
                 __      .              .     .__              __. .
                /  ` _  _|* _  _ __    _| _   [__) _ *._  _   (__ *| _ ._  _.* _ __ _
                \\__.(_)(_]|(_](_)_)   (_](_)  |  \\(/,|[ )(_)  .__)||(/,[ )(_.|(_)_)(_)
                           ._|
                                                                    ¡parte final!
                           """);
        System.out.println("\u001B[0m");
    }

    @Override
    public Personagem criar() {
        Scanner sc = new Scanner(System.in);
        mostrarAtributos();
        int esc = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine().toUpperCase();
        int hp = 0, especial = 0;
        String classe = "";
        if(esc == 1){
            hp = 150;
            especial = 10;
            classe = "guerreiro";
        }else if(esc == 2){
            hp = 100;
            especial = 12;
            classe = "feiticeiro";
        }else if(esc == 3){
            hp = 200;
            especial = 8;
            classe = "assassino";
        }
        return new Personagem(nome, hp, especial, classe);
    }

    @Override
    public void referencias() {
        System.out.println("""
                        --- CRIAÇÃO ---
                - Agnes Ludmila Araújo
                - Cibele Diniz
                - Maira Fernandes Nunes
                - Maria Tereza Medeiros

                        --- ARTE ---
                - Boteco ASCII Art

                        --- PARTICIPAÇÃO ESPECIAL ---
                - Andre Vinicius
                - Wellington
                """);
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("""
        
        Escolha seu  personagem:
        1 - Guerreiro
        HP: 150
        Especial: 10
        Ataques: Soco -7, Espada -20.
                         
        2 - Feiticeiro
        HP: 100
        Especial: 12
        Ataques: Cajado -5, Bola de Fogo -25.

        3 - Assassino
        HP: 200
        Especial: 8
        Ataques: Voadora -10, Katana -20
        """);
    }

    @Override
    public void escolha() {

    }


    public void escolha(char[] escolha) {
        int contadorA = 0;
        int contadorB = 0;

            for (char escolhas : escolha)
            {
                if (escolhas == 'a') {contadorA++;}

                else if (escolhas == 'b') {contadorB++;}
            }

            if (contadorA > contadorB) {
                System.out.println("Você foi mais astuto nesse jogo. Total de escolhas astutas: " + contadorA);}

            else if (contadorB > contadorA){
                System.out.println("Você foi mais paciente nesse jogo. Total de escolhas pacientes: " + contadorB);}

            else {
                System.out.println("Você soube balancear suas escolhas. \nTotal de escolhas astutas: " + contadorA + "\nTotal de escolhas pacientes: " + contadorB);}
    }


    //TEXTOS HISTORIA

    public void texto1(Personagem jogador){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            Você acorda acorrentado em uma cela escura e fria, o vento fazendo barulho lá fora como se estivesse
            conversando com você. Sua cabeça gira sem parar, você mal conseguindo ficar em pé, a grade fria da janela e
            da porta lhe encaram, o que te faz parecer um completo estranho, até porque você é um.

            Passos ecoam no fim do corredor, ficando cada vez mais perto. Só então que você percebe o som de uma goteira
            caindo no fundo da sala, os ventos ainda falando lá fora, querendo dizer algo que você não consegue entender,
            tudo parecer dez vezes mais dramático. O som dos passos fica cada vez mais pertos e mais fortes, para onde
            correr se não há como? Uma sombra vai surgindo no corredor a sua frente a mesma altura que os passos chegam
            mais perto.

            Voz não identificada - Já estava mesmo na hora de acordar, dormira muito.

            """ + jogador.getNome() + " - Me solte! Me solte agora! O que você vai fazer comigo?");

        sc.nextLine();
        System.out.println("""
            Você está ofegante.

            Voz não identificada - Ora, nada do que você já não tenha conhecimento.

            Você tenta se levantar, mas sua cabeça ainda pesa muito. Deve tê-la batido em algum lugar.

            Voz não identificada - Você acha mesmo que pode chegar no meu castelo, derrotar o meu dragão, querer roubar
            a minha criança, me bater e sair impune de tudo isso? Quem você acha que é para fazer tal coisa?

            "Espera. Roubar sua criança? Eu vim aqui para pegar o filho do rei de volta."

            """ + jogador.getNome() + " - Eu não sei do que você está falando.");

        sc.nextLine();
        System.out.println("""

            Voz não identificada - É claro que não. Você vai se fazer de desmemoriado."""
            + jogador.getNome() + " - Eu realmente não sei quem é você. Será que dá para me soltar?" + """

            Voz não identificada - Não. Você vai ficar aí. Partiremos pela manhã, em direção ao Reino de Valyrian.

            Tarik. Tudo vem claro a sua mente. Você estava ali para salvar o filho do rei, Owen, que Tarik havia sequestrado
            anos atrás como uma vingança idiota e infantil, porque ele não soubera perder e muito menos ganhar.
            Quando chegara ali, tinha lutado com aquele imundo, mas seus ataques não foram os suficientes, já estava
            cansado da batalha anterior com o dragão, e não sabia onde a criança estava.

            """ + jogador.getNome() + " - Eu não deixarei com que saia impune, Tarik.");

        sc.nextLine();
        System.out.println("""
            
            Tarik - Bom saber que você se lembra,""" + jogador.getNome() + "." + """
            Ele sai, sua sombra o acompanhando logo atrás no balançar das luzes das velas. E agora você precisa pensar
            rápido em como vai sair dali, mas sem conseguir enxergar nada e sem nenhuma ferramenta a sua disposição parecia
            impossível sair dali.

            Você olha em volta e se arrasta até a goteira que tem ali no canto e tenta colocar a corrente debaixo dela
            para tentar se soltar. Ou suas mãos sairão escorregando ou a corrente irá ficar enferrujada rapidamente
            (ainda mais num dia tão frio como aquele) que quebrará a qualquer momento.
            
            Você iria sair dali por bem ou por mal.

                a- Forçar a mão a sair.
                b- Esperar a corrente enferrujar.
            """);
    }

    public void texto2(Personagem jogador){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("""
            NO DIA SEGUINTE.

            A noite fria havia passado e um dia ainda frio havia nascido. No fim das contas, você conseguira sair.
            Mas e para sair da cela? Essa parte não havia passado pela sua cabeça. E pelo visto nem pela cabeça de Tarik.

            Já que você até então estava acorrentado, ele não precisaria se preocupar em fechar a porta da cela. Tolo insolente.

            Você então sai rapidamente da cela, procurando loucamente por seu(a)""" + jogador.iventario[0] + """
            , achando seu precioso item jogado em uma outra cela qualquer. Sobe as escadas na mesma esperança de encontrar
            Tarik em algum momento distraído indo te buscar e matá-lo assim que o avistar. Mas ele não está em lugar nenhum.
            Tarik já havia dado partida em direção ao reino antes que você se quer
            pudesse se soltar.
            Há um bilhete pendurado na porta de entrada.
            """);

        sc.nextLine();
        System.out.println("Ora," + jogador.getNome() + """
            , você realmente achou que eu iria deixar você vir comigo? Para que você pudesse me matar a qualquer momento,
            para que pudesse resgatar a criança e levá-la em segurança para seu papai, para que todos vissem o monstro
            terrível que eu sou? Sinto muito, mas eu não deixaria isso acontecer. E cuidado por onde anda,"""
            + jogador.getNome() + """
            . Este castelo é cheio de armadilhas."

            Ao terminar de ler o bilhete, você fica imediatamente alerta. Armadilhas?

            """ + jogador.getNome() + " - AAAAAAAAAHHHHH!!!");

        sc.nextLine();
        System.out.println("""
            "Quem é o tolo insolente agora?" Pensa Tarik de longe.

            Você cai em uma das armadilhas, que aparentemente te manda de volta ao calabouço. Mas dessa vez ainda mais
            escuro e frio, como se fosse impossível antes.

            Sssss.

            "O que foi isso?" Você ouve um barulho vindo de longe.

            Uma cobra gigante surge das sombras, com grandes dentes afiados e uma cauda enorme capaz de derrubar todo
            aquele castelo. Um basilisco.
            """);
    }

    public void texto3(Personagem jogador){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("""

            No seu último ataque, precisa sair correndo, pois o castelo que já estava em ruinas agora está realmente se
            desmoronando. Você tinha razão, a cauda do basilisco era tão grande e de uma força tão extrema que realmente
            poderia levar aquele castelo as ruinas. E agora precisa continuar seu caminho de volta ao reino.

            Mas antes, você pega um dente da cobra gigante que havia caído durante a luta, se não for útil em algum momento,
            ao menos de recordação você poderia guardar, afinal, acabara de derrotar um basilisco.

            Passando por todos os lugares que havia passado anteriormente, você encontra a fonte da ninfa, que já não é
            mais tão bela quanto antes. Agora há muita neblina ali, a água já não é mais cristalina, a fada também não
            está mais presente, e certamente o velho mendigo também não iria aparecer do nada.

            Dessa vez você não iria perder tempo, já que não precisaria passar por nenhum dos obstáculosque havia passado
            antes.
            Ao menos era o que você pensava. Agora tinha uma ponte no mesmo lugar que tinham pedras difíceis de atravessar.

            E um duende.

            "Esses carinhas não só deixam você passar se adivinhar uma charada?"

            Duende - Olá! A quem devo a honra de receber essa magnifica visita?!
            """);

        sc.nextLine();
        System.out.println(jogador.getNome() + " - Olá, duende, meu nome é " + jogador.getNome() + """
            . Apenas preciso atravessar sua ponte para chegar ao meu destino.

            Duende - Oh, meu caro, me chame de Rudolff. E é claro que eu deixo você passar!

            """ + jogador.getNome() + """
            - Muito obrigado, Rudolff, realmente preciso continuar meu caminho, o rei e o príncipe estão em peri...

            Rudolff - Mas eu não disse minhas condições.

            """ + jogador.getNome() + " - É claro.");

        sc.nextLine();
        System.out.println("""
            Rudolff - Eu te darei duas charadas. Para atravessar minha ponte, é preciso advinha-las.
            Acha que é capaz de tal,""" + jogador.getNome()+ "?" + """
      
            """
            + jogador.getNome() + " - Ok, e quais seriam as charadas?" + """
            Rudolff - Uhuhu! Vamos lá, meu caro. A Primeira charada é bem difícil de resolver, para atravessar a ponte,
            é preciso saber: o que é, o que é? Não tem pé, roda, asa, ventre ou nadadeira, mas mesmo sem ser carregada
            pode dar ao mundo uma volta inteira.

                a- Uma notícia.
                b- O vento.
                c- A água.
            """);
    }

    public void texto4(Personagem jogador){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("""
            Rudolff -""" + jogador.getNome() + """
            , você é mesmo um herói! Me diverti muito jogando com você, agora continue seu caminho, para que possa chegar
            em casa limpinho! Boa sorte na sua trilha, espero que não precise arranjar nenhuma intriga!

            """ + jogador.getNome() + """
            - Obrigado, Rudolff, foi muito bom jogar com você, espero realmente que eu não precise lutar de novo com nenhum
            monstro iminente.

            Rudolff - Vejo que pegou meu jeito de rimar! Vá,""" + jogador.getClasse() + ", no seu caminhar!" +
            """
                a- Até nunca mais, Rudolff, você é muito gentil, mas ainda tomou o meu tempo. Perdão se for uma ofensa.
                b- Adeus, meu amigo Rudolff, você é muito bom, eu passaria horas conversando com você, mas espero nunca
                mais precisar te encontrar.
            """);
    }

    public void texto5(Personagem jogador){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("""
            Rudolff - Adeus!

            Voltando a programação original, você continua cavalgando com o velho animal por aí, indo em direção ao reino,
            espera que essa brincadeira não tenha tomado muito do seu tempo e que ainda há como salvar a todos.

            Como antes, alguns dias se passaram até que você conseguisse chegar ao reino, e antes mesmo de entrar pelos
            portões, já dava para perceber que tudo havia sido destruído. Tarik certamente achara outro dragão ou algo
            que também cuspisse fogo igual e queimara todas as casas, lojas, restaurantes, barracas e tudo o mais. Por
            mais que nem tudo estivesse totalmente em cinzas, ele tinha conseguido o que queria.

            Você entra no castelo depois de dar uma olhada nos arredores e encontra Tarik sentado no lugar do rei.""");

        sc.nextLine();
        System.out.println("""
            Tarik - Oh,""" + jogador.getNome() + """
            , demorou para chegar. Na verdade, achei que não viesse. Sabe, aquele duende poderia ter te comido vivo se
            quisesse.

            """ + jogador.getNome() + " - É claro que foi você. De novo." +
            """
            Tarik - Sim, e espero que meu basilisco ainda esteja vivo, pois foi muito difícil encontrar um daquele nos
            dias de hoje, você deve saber como é.

                a- Sinto em lhe decepcionar, mas tive que matá-lo. Seu castelo também está em ruinas, se quiser saber.
                b- Bom, quanto a isso, ele me atacou primeiro.
            """);
    }

    public void texto6(Personagem jogador){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("""
            Por três segundos você fica com medo de que ele venha te atacar, mas o medo passa quando ele não faz nada e
            apenas grita para que alguém ao longe pare de chamar por ajuda.

            E então, você percebe que o rei, a rainha e o príncipe não estão ali.

            """ + jogador.getNome() + " - O que você fez com eles?");

        sc.nextLine();
        System.out.println( """
            Tarik - Ora, a pergunta demorou para vir. Eu os prendi no calabouço. Assim como fiz com você antes, acho que
            se lembra.

            """ + jogador.getNome() + " - É, eu me lembro." +
            """
            
            Tarik - Pois bem, amanhã é o aniversario de Owen, e como presente de seus 15 anos, irei dar a cabeça de seu
            pai decapitada. Ou quem ele pensa ser seu pai.

            """ + jogador.getNome() + " - Como assim quem ele pensa ser seu pai? O que você quer dizer com isso?");

        sc.nextLine();
        System.out.println("""
            Uma porta se abre ao longe, e de lá, você avista a rainha. "Ela não estava no calabouço? O que ela está
            fazendo solta? E por que está aqui e não tentando salvar seu marido e filho?"

            Rainha - Tarik? Onde está Owen, preciso vê-lo.

            Tarik - Minha querida, ele está em uma das celas junto de Augustus. Volte a se deitar na cama, você está pálida.

            Rainha - Não antes de falar com meu filho, preciso falar com ele.

            Tarik - Irei mandar que os guardas o levem até seu quarto.

            Rainha - Não, pode deixar que eu mesma vou, estou me sentindo muito melhor desde que você chegou com ele.

            Tarik - Guardas! Levem ela para ver a criança.

            Rainha - Obrigada, querido.

            """ + jogador.getNome() + " - O que é que está acontecendo aqui?");

        sc.nextLine();
        System.out.println("""
            Tarik - Oh, você não sabe de nem metade da história. Sente-se um pouco, pois tenho muita coisa para te atualizar.
             """);
        sc.nextLine();
        System.out.println("""
            Um dos guardas empurra uma cadeira atrás de você, o obrigando a sentar, mas antes que você possa reagir eles
            prendem suas mãos com uma corda, o deixando completamente imóvel e amarrado a cadeira.

            Tarik - Há muito tempo atrás, quando o rei Augustus me mandou para derrotar um dragão que ameaçava derrubar
            o castelo, eu não consegui matar a pobre criatura, ele só estava com medo, então o deixei em um castelo que
            estava quase em ruinas abandonado para que ele pudesse ficar seguro, o pobre dragão que você matara. Como não
            tive coragem de fazer mal a uma criatura inocente e não podia mentir para o meu rei, eu disse a verdade, que
            não havia conseguido matar o dragão. Mas disse que ele havia ido embora.
            """);
        sc.nextLine();
        System.out.println("""
            Bom, o rei não achou o suficiente, queria a cabeça daquela pobre alma para si, para guardar, para contemplar
            o 'monstro' como ele mesmo dissera. Insatisfeito, ele me exilou de seu reino. A parte da ameaça era verdade,
            afinal, eu tinha comprido o objetivo de manter o reino a salvo, e ele nem queria me dar os créditos por isso,
            eu queria enfim ser promovido a guarda real, eu era apenas um cavaleiro até então, que recebia ordens diretas
            do rei, pois ele não tinha ninguém em quem confiar. Mas ele foi imaturo, fora criança de mais, não queria
            aceitar que não poderia ter a cabeça do dragão como troféu para si, mesmo que quem tivesse o matado não fosse ele.
            """);
        sc.nextLine();
        System.out.println("""
            Então, com muita raiva, dor, tristeza e fúria, eu tive que ir embora, ainda tinha o amor a minha vida apesar
            de tudo. Mesmo tendo o ameaçado, eu não iria fazer nada, afinal, eu não era esse tipo de gente. Mas a raiva
            havia me consumido. Acho que o pior de tudo isso, era não poder criar o meu filho. Não poder chamá-lo de 'filho',
            não poder estar ao seu lado em todas as suas novas conquistas. Caso não esteja entendendo,""" + jogador.getNome() + """
            , eu e a rainha tínhamos um caso, todos os dias, depois das 10, eu a encontrava no labirinto. Quase sempre
            fazíamos amor, era maravilhoso, era divino. Ela engravidou de mim. Mas não podia contar a Augustus que o bebê
            era meu, então por esse motivo, ela mentira para ele, mentiu a data que engravidara, mentiu sobre o filho ser
            dele, mentiu sobre o amar.
            """);
        sc.nextLine();
        System.out.println("""
            Não havia nada que eu pudesse fazer. Eu apenas aceitei, pelo menos ainda podia encontrar com minha amada todos
            os dias. Mas a alegria não durou muito tempo. Ela adoeceu. A gravidez apenas trouxe tristeza para nossa relação,
            nunca havíamos discutido uma vez se quer, e depois daquilo, sempre havia alguma coisa para que um de nós ficasse
            com raiva do outro, mesmo que no final sempre nos resolvêssemos. Nada era o suficiente ainda, eu queria criar a
            criança com ela, como meu filho. Mesmo depois do nascimento de Owen, ela continuou doente, com melhoras aqui e
            pioras ali. Quando decidi 'sequestrar' meu filho, ela ficou ainda pior, eu havia deixado um recado para ela,
            não dizendo aonde eu iria, mas que se ela quisesse, podia fugir comigo, podia vir me encontrar na floresta no
            amanhecer, poderíamos finalmente ser felizes juntos e ter a vida que sempre sonhamos. Mas ela preferia o poder.
            Desde então, nunca mais nos falamos. De vez em quando trocávamos cartas, mas não era mais a mesma coisa.
            E desde então, passei a criar Owen como me filho, como sempre deveria ter sido.""");
        sc.nextLine();
        System.out.println(jogador.getNome() + """
            - Mas eu não entendo, por que você fez tudo isso? Por que sequestrar a criança? Por que não simplesmente jogar
            tudo na cara do rei?

            Tarik - Como disse antes, eu ainda tinha amor a minha vida. E eu queria ser o pai do meu filho.

            Você simplesmente não consegue entender a complexidade de tudo aquilo. Mas precisa fazer algo a respeito, mesmo
            que Tarik seja o pai do príncipe, rei Augustus não merece morrer. E então, se lembra do dente de cobra, ele
            estava guardado em sua camisa, poderia tentar pegar discretamente e cortar as cordas, e ainda atacar Tarik
            com o veneno.

                a- Se soltar e matar Tarik de imediato com o veneno.
                b- Se soltar e nocautear Tarik para salvar os outros.
            """);
    }
}
