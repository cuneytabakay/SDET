package Gun10;

import Utils.BaseStaticDriver;

import java.time.Duration;

public class _01_WaitsGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        //Duration dr=Duration.ofSeconds(30);
        //driver.manage().timeouts().pageLoadTimeout(dr);



        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.cssSelector("[onlick='timed"))

                BekleKapat();


    }
}
