package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;


class KeszitoComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getGyarto(), o2.getNev());
    }
}

public class Elelmiszer {
    private LocalDate letrehozas;
    private String nev, gyarto;
    public Elelmiszer( String nev, String gyarto) {
        this.letrehozas = LocalDate.now().plusYears(1);
        this.nev = nev;
        this.gyarto = gyarto;
    }
    public Elelmiszer(LocalDate letrehozas, String nev, String gyarto) throws HibasDatumException {
        if(letrehozas.isAfter(LocalDate.now())){
         throw new HibasDatumException("lejárt élelmiszer");
        }
        this.letrehozas = letrehozas;
        this.nev = nev;
        this.gyarto = gyarto;
        
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }
    
    
    
    
    
}
