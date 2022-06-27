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