package simple;

public class Game {
    private int shipSize = 3;
    private int size = 7;
    private int shipPosition;
    private boolean[] partIsHit = new boolean[this.shipSize];

    public Game() {
        int possibleShipPositions = this.size - 2;
        this.shipPosition = (int) (Math.random()*possibleShipPositions) + 1;
        }
    public void shoot(int location) {
        if (location < 1 || location > this.size) {
            System.out.println("Try hitting inside the grid next time");
            return;
        }
        if (location >= shipPosition && location <= shipPosition + shipSize) {
            int hitIndex = location - shipPosition;
            if (this.partIsHit[hitIndex] == false) {
                System.out.println("Its-a-hit!!");
                this.partIsHit[hitIndex] = true;
            } 
            else {
                System.out.println("You can't kill the same bird twice");
            }
        }
        else {
            System.out.println("Miss!!");
        }
    }
}