package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {

    //1. Tests packagenin altina bir class oluşturalim
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
    //3. dummy.txt dosyasını indirelim
    //4. dosyanın başarıyla indirilip indirilmediğini test edelim


    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement dummylinki=driver.findElement(By.xpath("//a[text()='dummy.txt']"));
        dummylinki.click();
        Thread.sleep(5000);
        String farklikisim=System.getProperty("user.home");
        String ortakKisim="\\Downloads\\dummy.txt";
        String aranandosyayolu=farklikisim+ortakKisim;

        Assert.assertTrue(Files.exists(Paths.get(aranandosyayolu)));
    }
}
