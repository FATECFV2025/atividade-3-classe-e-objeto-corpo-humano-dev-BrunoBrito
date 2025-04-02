package main.java;

public class CorpoHumano {
    private float massa;
    private float densidade;
    private float volume;
    private float altura;

    public CorpoHumano (float massa, float altura)
    {
        this.massa = massa;
        this.altura = altura;
    }

    public float getMassa()
    {
        return massa;
    }
    public float getAltura()
    {
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setMassa(float massa){
        this.massa = massa;
    }
    public double calcularImc()
    {
      return massa / (altura*altura);
    }

    
    
}   
