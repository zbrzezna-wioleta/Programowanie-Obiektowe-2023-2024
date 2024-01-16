package algorithm;

public class DuplicateFinder {
    public <T> boolean findDuplicates(T[] tab){
        if(tab.length < 2){
            return false;
        } else {
            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab.length; j++){
                    if(i!=j){
                        if(tab[i] == tab[j]){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
