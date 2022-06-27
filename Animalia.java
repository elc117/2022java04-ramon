//Pode criar novos reinos
class Animalia{
    private String reino;
    
    public Animalia() {
        reino = "animalia";
    }
    public String getReino(){
        return reino;
    }
}
//Pode criar novas subclasses
class Mamifero extends Animalia{
    private int especies = 5000;
    
    public int quantidade_especies(){
        return especies;
    }
}
//Pode criar algum outro animal 
class Golfinho extends Mamifero {
    private boolean terrestre;
    private boolean aquatico;

    public Golfinho(){
        this.terrestre = false;
        this.aquatico = true;
    }
    public boolean sabe_nadar(){
        return aquatico;
    }
    public boolean sabe_andar(){
        return terrestre;
    }
}

class Carnivoro extends Animalia{
    protected int n_dentes;
    protected float tamanho_dente;
    protected String carne_favorita;
    protected int idade;
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public Carnivoro(){

    }
    public void setCarne_favorita(String carne_favorita){
        this.carne_favorita = carne_favorita;
    }
    public String getCarne_favorita(){
        return carne_favorita;
    }
    public void setN_dentes(int n_dentes){
        this.n_dentes = n_dentes;
    }
    public int getN_dentes(){
        return n_dentes;
    }
}

class TRex extends Carnivoro{
    Bool vivo;
    public void setVivo(Bool vivo) {
        this.vivo = vivo;
    }
    public Bool getVivo() {
        return vivo;
    }
    public Trex(){
        this.n_dentes = 60;
        this.tamanho_dente = 0.20;
    }
}
