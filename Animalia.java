//Pode criar novos reinos
class Animalia {
    private String reino;

    public Animalia() {
        reino = "animalia";
    }

    public String getReino() {
        return reino;
    }
}

// Pode criar novas subclasses
class Mamifero extends Animalia {
    private int especies = 5000;

    public int quantidade_especies() {
        return especies;
    }
}

// Pode criar algum outro animal
class Golfinho extends Mamifero {
    private boolean terrestre;
    private boolean aquatico;

    public Golfinho() {
        this.terrestre = false;
        this.aquatico = true;
    }

    public boolean sabe_nadar() {
        return aquatico;
    }

    public boolean sabe_andar() {
        return terrestre;
    }
}

class Ave extends Animalia {
    private int especies = 10000;
    private int quant_pernas = 2;
    protected boolean sabe_voar;
    protected int altura_de_voo;

    public boolean isSabe_voar() {
        return sabe_voar;
    }

    public void setSabe_voar(boolean sabe_voar) {
        this.sabe_voar = sabe_voar;
    }

    public int getAltura_de_voo() {
        return altura_de_voo;
    }

    public void setAltura_de_voo(int altura_de_voo) {
        this.altura_de_voo = altura_de_voo;
    }

    public Ave(boolean sabe_voar, int altura_de_voo) {
        this.sabe_voar = sabe_voar;
        this.altura_de_voo = altura_de_voo;
    }

    public int getEspecies() {
        return especies;
    }
}

class Pinguim extends Ave {
    public Pinguim() {
        super(true, 0);
    }
}

class Carnivoro extends Animalia {
    protected int n_dentes;
    protected float tamanho_dente;
    protected String carne_favorita;
    protected int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public Carnivoro() {

    }

    public void setCarne_favorita(String carne_favorita) {
        this.carne_favorita = carne_favorita;
    }

    public String getCarne_favorita() {
        return carne_favorita;
    }

    public void setN_dentes(int n_dentes) {
        this.n_dentes = n_dentes;
    }

    public int getN_dentes() {
        return n_dentes;
    }
}

class TRex extends Carnivoro {
    boolean vivo;

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getVivo() {
        return vivo;
    }

    public Trex(){
        this.n_dentes = 60;
        this.tamanho_dente = 0.2f;
    }
}
