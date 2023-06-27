package org.fasttrackit.tema7;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;


    public Bottle(int totalCapacity, int availableLiquid, boolean isOpen) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.isOpen = isOpen;
    }
}
