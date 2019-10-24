package singleton.one.kodillasingleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SettingsFileEngineTest {

    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }


    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }


    @Test
    public void testLoadSettings() {

        //given

        //when

        boolean b = SettingsFileEngine.getInstance().loadSettings();
        //then

        Assert.assertEquals(true, b);
    }

    @Test
    public void testSaveSettings() {
        //given

        //when

        boolean result = SettingsFileEngine.getInstance().saveSettings();

        //then
        Assert.assertTrue(result);
    }
}