package ch.zhaw.iwi.devops.gameoflife;

import org.junit.Assert;
import org.junit.Test;

public class GameofLifeTest {
    
    @Test
    public void gameoflife1() {

        GameofLife gameoflife =  new GameofLife();
        Assert.assertEquals(false, gameoflife.step(true,1));

    }
    @Test
    public void gameoflife2() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(false, gameoflife.step(true,0));

    }
    @Test
    public void gameoflife3() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(true, gameoflife.step(true,2));

    }
    @Test
    public void gameoflife4() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(true, gameoflife.step(true,3));

    }
    @Test
    public void gameoflife5() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(false, gameoflife.step(true,4));

    }
    @Test
    public void gameoflife6() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(false, gameoflife.step(true,20));

    }
    @Test
    public void gameoflife7() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(true, gameoflife.step(false,3));

    }
    @Test
    public void gameoflife8() {

        GameofLife gameoflife = new GameofLife();
        Assert.assertEquals(false, gameoflife.step(false,2));

    }
    

}