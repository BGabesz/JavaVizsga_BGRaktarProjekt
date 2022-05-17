package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Raktar implements Iterable<Elelmiszer>{
    private ArrayList<Elelmiszer> elelmiszerek;

    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmiszerek).iterator();
    }
}
