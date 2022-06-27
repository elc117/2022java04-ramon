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