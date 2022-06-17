package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Deneme01 extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//span[@class='KPnG0']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karakas.necati@gmail.com");
        Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("14051992dn");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@value='1']")).click();
        driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']")).click();
        driver.findElement(By.xpath("//input[@class='XTCLo  d_djL  DljaH ']")).sendKeys("tarkan");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//div[@class='_7UhW9   xLCgt      MMzan    _0PwGv              fDxYl     '])[1]")).click();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();




        /*WebElement aramakutusu=driver.findElement(By.xpath("//input[@aria-label='Arama Girdisi']"));
        aramakutusu.sendKeys("tarkan");
        */

        Thread.sleep(10000);
    }
}
