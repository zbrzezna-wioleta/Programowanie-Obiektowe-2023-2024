package org.aquatica.species;

public record Fish(String species, int finCount, boolean canLiveInFreshWater) {
    public Fish(){
        this("karp", 5, true);
    }
}
