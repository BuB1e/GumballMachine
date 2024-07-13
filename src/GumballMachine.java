//6510451018 Harit Sombatsiri
public class GumballMachine {
    private int gumballs;
    private boolean noQuarter;
    private boolean hasQuarter;
    private boolean outOfGumball;

    public GumballMachine(int n) {
        this.gumballs = n;
        setNoQuarter();
        this.outOfGumball = false;
        System.out.println("Inventory : " + this.gumballs + " gumballs.");
        System.out.println("Machine is waiting for quarter.");
    }

    private void setHasQuarter() {
        hasQuarter = true;
        noQuarter = false;
    }

    private void setNoQuarter() {
        hasQuarter = false;
        noQuarter = true;
    }

    public void eject() {
        if(hasQuarter) {
            setNoQuarter();
        }
    }

    public void insert() {
        if(outOfGumball) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (hasQuarter) {
            System.out.println("You can't insert another quarter");
        } else {
            System.out.println("You inserted a quarter");
            setHasQuarter();
        }
    }

    private void setOutOfGumball() {
        this.outOfGumball = true;
    }

    public void turned() {
        if(hasQuarter) {
            System.out.println("You turned...");
            System.out.println("The gumball comes rolling out the slot");
            setNoQuarter();
            if(this.gumballs > 0) {
                gumballSold();
            } else {
                setOutOfGumball();
                System.out.println("You turned, but there is no gumballs");
                eject();
            }
        }
    }

    private void gumballSold() {
        this.gumballs--;
        System.out.println("\nInventory : " + this.gumballs + " gumballs.");
    }

}
