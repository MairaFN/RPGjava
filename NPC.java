package RPGp2;

public abstract class NPC{
    String nome;
    int hp;

    public NPC(String nome, int hp) {
        super();
        this.nome = nome;
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void imprimirPersonagem();
}
