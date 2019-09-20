package boxes;

import java.util.Collection;

public abstract class Box {

    public abstract void add(Thing thing);

    public void add(Collection<Thing> things) {
        for (Thing thing : things) {
            add(thing);
        }
    }

    // METHOD. Check if thing is in the box
    public abstract boolean isInTheBox(Thing thing);
}
