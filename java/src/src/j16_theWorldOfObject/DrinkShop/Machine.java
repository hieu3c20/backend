package j16_theWorldOfObject.DrinkShop;

public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            return true;
        }
        return false;
    }

    public String toString() {
        String temp = "";
        temp += "\nOur stock\n";
        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\n";
        }
        return temp;
    }
}
