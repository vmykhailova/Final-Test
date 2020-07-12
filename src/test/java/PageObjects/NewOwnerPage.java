package PageObjects;

import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewOwnerPage {
    private By firstName1 = By.id("firstName");
    private By lastName1 = By.id("lastName");
    private By address1 = By.id("address");
    private By city1 = By.id("city");
    private By telephone1 = By.id("telephone");
    private By addOwnerBtn = By.cssSelector("button[type='submit']");

    public void inputFirstName(String firstName) {
    $(firstName1).setValue(firstName);
    };
    public void inputLastName(String lastName) {
        $(lastName1).setValue(lastName);
    };
    public void inputAddress(String address) {
        $(address1).setValue(address);
    };
    public void inputCity(String city) {
        $(city1).setValue(city);
    };
    public void inputtelephone(String telephone) {
        $(telephone1).setValue(telephone);
    };
    public void clickAddOwnerBtn() {
        $(addOwnerBtn).click();
    };
}
