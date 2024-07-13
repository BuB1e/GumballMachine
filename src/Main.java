//6510451018 Harit Sombatsiri
public class Main {
    public static void main(String[] args) {
        int n = 10;
        GumballMachine gm = new GumballMachine(n);
        for(int i = 0; i < n+1; i++) {
            gm.insert();
            gm.turned();
        }
    }
}