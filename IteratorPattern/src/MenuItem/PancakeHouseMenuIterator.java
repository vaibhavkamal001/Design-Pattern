package MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.items = menuItems;
    }
    @Override
    public boolean hasNext() {
        return position<items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
