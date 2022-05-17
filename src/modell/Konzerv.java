package modell;

import java.io.File;

public class Konzerv extends Elelmiszer{
    private String leiras;
    private File recept;

    public Konzerv(String nev, String gyarto) {
        super(nev, gyarto);
    }
    public void receptMutat(){
        if (recept.exists()){
            System.out.println("Exists");
        }else{
            
            System.out.println("Does not Exists");
        }
            
    }
}
