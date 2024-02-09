import org.junit.Assert;
import org.junit.Test;

import static com.smu.mscda.Main.GenerateCapital;
import static com.smu.mscda.Main.GenerateMD5;

public class CaptializeAndGenerateMD5HexTest {
    private String INPUT = "papa";
    @Test
    public void GenerateCapitalTest(){
        Assert.assertEquals("Papa", GenerateCapital(INPUT));

    }
    @Test
    public void GenerateMD5Test(){
        Assert.assertEquals("0ac6cd34e2fac333bf0ee3cd06bdcf96",GenerateMD5(INPUT));
    }
}
