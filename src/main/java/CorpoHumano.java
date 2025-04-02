package main.java;

public class CorpoHumano {
    private float massa;
    private float densidade;
    private float volume;
    private float altura;

    public CorpoHumano (float massa, float volume)
    {
        this.massa = massa;
        this.volume = volume;
        this.densidade = (float) massa / volume;
        this.altura = altura;
    }
    public float getMassa()
    {
        return massa;
    }
    public float getVolume()
    {
        return volume;
    }
    public float getDensidade()
        {return densidade;}

    public float getAltura()
        {return altura;}
    
    public void setMassa(float massa){
        this.massa = massa;
        densidade = massa / volume;
    }
    public void setVolume(float volume){
        this.volume = volume;
        densidade = massa / volume;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setDensidade(float densidade){
        this.densidade = densidade;
        massa = densidade * volume;
    }
    
    
}   
