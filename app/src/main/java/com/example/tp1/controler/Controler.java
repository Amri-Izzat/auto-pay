package com.example.tp1.controler;

import com.example.tp1.model.Profil;
public final class Controler {
    private static Controler instance = null;
    private static Profil profil;
    private Controler(){
        super();
    }
    public static final Controler getInstance()
    {
        if(Controler.instance == null)
            Controler.instance = new Controler();
        return Controler.instance;
    }
    public void createProfil (String origine, String distination)
    {
        profil = new Profil(origine,distination);
    }
    public String getResponse(){
        return profil.getResponse();
    }
}
