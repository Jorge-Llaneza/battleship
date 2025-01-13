package simple;

public class Game {
    private int size = 7;
    private int shipPosition;
    private boolean[] partIsHit;

    public Game() {
        int possibleShipPositions = this.size - 2;
        this.shipPosition = (int) (Math.random()*possibleShipPositions) + 1;
        }
    public void shoot(int location) {
        if (location < 1 || location > this.size) {
            System.out.println("Try hitting inside the grid next time");
            return
        }

    }
}