package ch.zhaw.iwi.devops.gameoflife;

public class GameofLife {

    public boolean step(boolean currentstate, int nneighbors) {
        if (currentstate == true && nneighbors < 2) {
            return false;
        } else if (currentstate == true && 
                    (nneighbors == 2 || nneighbors == 3)) {
            return true;
        } else if (currentstate == true && nneighbors  > 3) {
            return false;
        } else if (currentstate == false && nneighbors == 3){
           return true;
        }
        
        return currentstate;
    }

}
