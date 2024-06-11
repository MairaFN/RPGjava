package RPGp2;

public class Vilao extends NPC{
    String especie;

    public Vilao(String nome, int hp, String especie) {
        super(nome, hp);
        this.especie = especie;
    }


    public void imprimirPersonagem(){
        String vermelho = "\u001B[31m", verde = "\u001B[32m";
        System.out.println(verde);
        System.out.println("               uJ$$$$$$¹,J c3$$h.                  .,J+.");
        System.out.println("            ,J$$$$$$$*z$F,J$$??$$h- =c3$$C$$$E-.zJ*J?? $$ccc,.");
        System.out.println("          .r$$$$$$$$$$$$$$$$$F *?$$$hJ$$$$$¹zJ$$$P* ,$z$$P$$F$hu");
        System.out.println("         J$h?$$$$$$$$$$$$$$$$$$$."+ vermelho +"()"+ verde +"``$$$$$$$$$$$**"+ vermelho +"()"+ verde +",J$x$$c3$$L$$N");
        System.out.println("       .P$$$$F***   ¹ `*??$$$h?$$$ucd$$$$$$$$$hcr$P*J?$$P**??$Lc$F");
        System.out.println("        J$JF                `?$C`?$$$$$$*$*$$$$$$P*,JP*       `$$$F");
        System.out.println("       ?$F                   `?h..`*?$$$$$$$F* .,zP           $$$$");
        System.out.println("       cc         u  ..        `$$P   `****  J$$*   -c    *   $$$F");
        System.out.println("       ?F       ,$ z$$$,ccu.,.  `?$h        ,J$¹.    $    .  ,$$F");
        System.out.println("       ;h       ????$$$$$$$$$$$u   `;d*  ,$* `*           JP*");
        System.out.println("       `?      c3$hcr. `***????$$r   `;d*  ,$* `*           JP*");
        System.out.println("        $r      $$$$$$$$$$hccccc   ,P*,, ,P* J$$$       .P*");
        System.out.println("         ?      *******???*      ,p*   ***  J$$P*     E¹");
        System.out.println("          `c     hcc,,.      -==*F          *      uF");
        System.out.println("           `=    `?$$$$-c3$$h    j¹      .,J$$$  .¹*");
        System.out.println("             `\\.    **?h.`$$$C  *     z$$$P*   $$*");
        System.out.println("                *  .   .`******     ,cL..,,,cc,h");
        System.out.println("                  `*$h,`$$$$$F ?$C `$$$$$$$$**c3$");
        System.out.println("                     *?hu`*?$$F $$h. `???*  .. ?");
        System.out.println("                        *?hu cccccccccd$$$$$$$$");
        System.out.println("                           *?h.*$$$$$$$$$$????*");
        System.out.println("                             `?hu` zccccccd$$$$$$u");
        System.out.println("                                `*h,*?$$$$$$$$$??**");
        System.out.println("                                   `?h.¹ .;ccccd$$$$$c");
        System.out.println("                                      *$h.*$$$$$$$$$$$$c");
        System.out.println("                                        *$h.?$$$??????**");
        System.out.println("                      .,zcccccccccccu.   `?$u ,cc$$$$$$$$$c");
        System.out.println("        ,cc$$$P*,cd$$$$$$$$$$$$P****.zc$$$,?$h $$$$$$$$$$$$.");
        System.out.println("    ,J$$$$P*,cd$$$$$$$$??**.,ccd$$$$$$$$$$$ $$h`******.,,,,");
        System.out.println("h      ;J$$$P*,c$$$$$$?**,ccc$$$$$$$$$$$$$$$$$$$ $$$ $$$$$$$$$$$$");
        System.out.println("`$    x$$?*,d$$$$?*,cd$$$$$$$$$$$$$$$$$P*. .  .`;$$¹,$$$$$$$$$$$F;,");
        System.out.println("?h.__,zc$$??*,cd$$$$$$$$$$$$$$$$$P* zcc3$$¹$F¹,J$$F,cccccccccccc J$$$u");
        System.out.println("¹******,zc$$$$$$$$$$$$$$$$$P**,;J$r** *,uccd$$$F J$$$$$$$$$$P J$$$$$h");
        System.out.println(" `$$$$$$$$$$$$$$$$$??*,zc $$F .uJ$$$$$$$$$P¹..***********,$$$$$$$$");
        System.out.println("   *?$$$$$$$??***,cr$$??**¹c$$$$$$$$$$$$P* c3$$$$$$$$$$*,J$$$$$$$P*");
        System.out.println("           `*`?? ??*      `*?$$$$$$$$$*,ccc,.```*???*.,c,**?CLzE");
        System.out.println("                               *??**¹ J$$$$$$$$$$*  ?????????*");
        System.out.println("\u001B[0m");
    }
}
