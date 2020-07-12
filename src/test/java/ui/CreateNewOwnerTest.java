package ui;

import PageObjects.NewOwnerPage;
import com.codeborne.selenide.Condition;
import model.Owner;
import model.OwnerData;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class CreateNewOwnerTest {

    @BeforeMethod
    public void setUp() {
        open("http://46.101.230.213:8000");
    }
    @Test
    public void createOwner() {
        $(by("class", "dropdown-toggle")).shouldBe(Condition.visible).click();
        $(by("href", "/petclinic/owners/add")).shouldBe(Condition.visible).click();
        Owner owner = OwnerData.defaultOwner();
        NewOwnerPage newOwnerPage = new NewOwnerPage();
        newOwnerPage.inputFirstName(owner.firstname);
        newOwnerPage.inputLastName(owner.lastname);
        newOwnerPage.inputAddress(owner.address);
        newOwnerPage.inputCity(owner.city);
        newOwnerPage.inputtelephone(owner.telephone);
        newOwnerPage.clickAddOwnerBtn();
        $(by("class", "ownerFullName")).shouldHave(Condition.text(owner.firstname+" "+owner.lastname));

    }
}
