import junit.framework.Assert;
import org.junit.Test;
import task7.Operation;


public class Twest {
    @Test
    public void Mytestplus () {
    Operation calcul = new Operation();
        Assert.assertEquals(4.000, calcul.setResult(2,2,'+'));
    }

    @Test
    public void MytestMinus () {
        Operation calcul = new Operation();
        Assert.assertEquals(3.000, calcul.setResult(5,2,'-'));
    }


    @Test
    public void MytestUmnozit () {
        Operation calcul = new Operation();
        Assert.assertEquals(4.000, calcul.setResult(2,2,'*'));
    }


    @Test
    public void MytestRazdelit () {
        Operation calcul = new Operation();
        Assert.assertEquals(5.000, calcul.setResult(10,2,'/'));
    }



}
