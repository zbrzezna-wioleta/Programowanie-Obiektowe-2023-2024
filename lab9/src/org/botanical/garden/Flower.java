package org.botanical.garden;

public record Flower(String species,String petalColor,boolean isPerennial) {
    public Flower{
        if(species==null){
            species="Unknown";
        }
        if(petalColor==null){
            petalColor="Unknown";
        }
    }
}
