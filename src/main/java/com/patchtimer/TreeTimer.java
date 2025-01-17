package com.patchtimer;

import lombok.Getter;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;

public class TreeTimer{
    @Getter
    private final WorldPoint location;
    @Getter
    private String ticksLeftDisplay;
    @Getter
    private int ticksLeft;
    @Getter
    private GameObject object;

    TreeTimer(WorldPoint location, int respawnTime) {
        this.ticksLeft = respawnTime;
        //this.ticksLeft = TEAK_DURATION;
        this.ticksLeftDisplay = "" + this.ticksLeft;
        this.location = location;
    }

    public void decrement() {
        this.ticksLeftDisplay = "" + --this.ticksLeft;
    }
    public void increment() {
        this.ticksLeftDisplay = "" + ++this.ticksLeft;
    }
}
