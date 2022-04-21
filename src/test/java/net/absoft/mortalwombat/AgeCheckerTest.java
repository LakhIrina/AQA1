package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedCanPlayGame(){
        AgeChecker ageChecker= new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19),  "User can't play game");
    }
}