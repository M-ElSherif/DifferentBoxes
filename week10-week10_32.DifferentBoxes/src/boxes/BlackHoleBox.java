package boxes;

/**
 *
 * @author thesh
 */

import java.util.*;

public class BlackHoleBox extends Box {
    
    private List<Thing> box;
    
    public BlackHoleBox() {
        this.box = new ArrayList<Thing>();
    }

    public void add(Thing thing) {
        this.box.add(thing);
    }
    
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
