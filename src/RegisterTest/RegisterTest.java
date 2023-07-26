package RegisterTest;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.lidl.com/register");

        WebElement cross = driver.findElement(By.cssSelector("button[type='button'][data-test='pleaseSignInPopupCloseButton']"));
        cross.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[id='input0']"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input[id='input1']"));
        lastNameInput.sendKeys("Smith");

        WebElement eMailInput = driver.findElement(By.cssSelector("input[id='input2']"));
        eMailInput.sendKeys("johnsmth2@hotmail.com");

        WebElement eMailConfirmInput = driver.findElement(By.cssSelector("input[id='input3']"));
        eMailConfirmInput.sendKeys("johnsmth2@hotmail.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[id='input4']"));
        passwordInput.sendKeys("123456Ahmet.");

        WebElement phoneInput = driver.findElement(By.cssSelector("input[id='input5']"));
        phoneInput.sendKeys("2885551124");

        WebElement zipCodeInput = driver.findElement(By.cssSelector("input[id='input6']"));
        zipCodeInput.sendKeys("10011");

        WebElement birthDayInput = driver.findElement(By.cssSelector("input[id='date-picker-dialog']"));
        birthDayInput.sendKeys("05051995");

        WebElement addressLineInput = driver.findElement(By.cssSelector("input[id='input7']"));
        addressLineInput.sendKeys("254 John Street");

        WebElement addressCityInput = driver.findElement(By.cssSelector("input[id='input8']"));
        addressCityInput.sendKeys("Eau Claire");

        WebElement addressStateInput = driver.findElement(By.cssSelector("select[id='select0']"));
        addressStateInput.click();
        WebElement addressState2Input = driver.findElement(By.cssSelector("select[id='select0'] option[value='NY']"));
        addressState2Input.click();

        WebElement joinButton = driver.findElement(By.cssSelector("div[class='spinnie-container']"));
        joinButton.click();

        waitAndQuit();
    }
}

