package com.example.tp1.model;

public class Profil {
    private String origine;
    private String distination;
    private String response;
    public Profil(String origine, String distination)
    {
        this.origine = origine;
        this.distination = distination;
    }
    public String getResponse()
    {      if (this.origine.equals("sfax")&&this.origine.equals("sousse"))
                    {response = "10 dt";}
            if (this.origine.equals("sousse")&&this.origine.equals("sfax"))
            {response = "10 dt";}
            if (this.origine.equals("sfax")&&this.origine.equals("tunis"))
            {response = "10 dt";}
            if (this.origine.equals("tunis")&&this.origine.equals("sfax"))
                if (this.origine.equals("sousse")&&this.origine.equals("tunis"))
                {response = "10 dt";}
        if (this.origine.equals("tunis")&&this.origine.equals("sousse"))
            {response = "10 dt";}
        return response;
    }

}
