package com.netcracker.unc.model.impl;

import com.netcracker.unc.model.Location;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Shark extends Fish {

    @XmlElement
    private int hungerTime;
    private int lifeTime;

    public Shark() {

    }

    public Shark(Fish fish, int hungerTime) {
        super(fish.getLocation(), fish.getLifetime(), fish.getProgenyPeriod(), fish.getSearchRadius());
        this.hungerTime = hungerTime;
    }


    public Shark(Location location, int lifetime, int progenyPeriod, int searchRadius, int hungerTime) {
        super(location, lifetime, progenyPeriod, searchRadius);
        this.hungerTime = hungerTime;
    }

    @Override
    public void action() {

    }

    @Override
    public void move() {

    }

    @Override
    public void searchTarget() {

    }

    public void eat() {

    }

    public int getHungerTime() {
        return hungerTime;
    }

    public void setHungerTime(int hungerTime) {
        this.hungerTime = hungerTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.hungerTime;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Shark other = (Shark) obj;

        if (this.hungerTime != other.hungerTime) {
            return false;
        }
        return true;
    }

    public void setLifeTime(Integer lifeTime) {
        this.lifeTime = lifeTime;
    }
}
