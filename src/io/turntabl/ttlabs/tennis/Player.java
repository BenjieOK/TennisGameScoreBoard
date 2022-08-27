
package io.turntabl.ttlabs.tennis;

public class Player {
    private final String name;
    private int point;
    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
