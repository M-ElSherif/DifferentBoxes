package boxes;

/**
 *
 * @author thesh
 */

import java.util.*;

public class OneThingBox extends Box {
   
    private List<Thing> box;
    
    public OneThingBox() {
        this.box = new ArrayList<Thing>();
    }
    
    // ABSTRACT METHOD. Adds thing to box only if box is empty
    public void add (Thing thing) {
        if ( this.box.isEmpty() ) {
            this.box.add(thing);
        }
    }
    
    // ABSTRACT METHOD. Returns true 
    public boolean isInTheBox(Thing thing) {
        for ( Thing item : this.box ) {
            if ( item.equals(thing) ) {
                return true;
            }
        }
        return false;
    }
}
