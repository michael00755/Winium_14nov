import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CalcTest {

    @Test
    void testOne() throws Exception {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9515"),options);
        Thread.sleep(5000);
        driver.findElement(By.id("num8Button")).click();

    }
}
