package cloud.autotests.tests.demowebshop;


import cloud.autotests.tests.TestBase;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class PurchaseTest extends TestBase {


    Faker faker = new Faker(new Locale("ru"));

    String title = faker.phoneNumber().phoneNumber();
    String info = faker.address().secondaryAddress();
    String lastname = faker.name().lastName();
    String fullName = faker.name().fullName();
    String compositions = faker.number().digits(3);
    String composition = faker.number().digits(2);
    @Tag("demowebshop")
    @Test
    @Description("Регистрация нового юзера")
    @DisplayName("")
    void registrationTest() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/");
            sleep(3000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести email", () -> {
            $("#email").setValue("dev1@test.test");
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue("Aa123456");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Нажать на меню", () -> {
            $(".UserHeaderButton___StyledParagraph-sc-6zbpjc-0").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Мои закупки")).click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#title").setValue("ММЗ" + title + "артикул");
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#info").setValue(info);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".forward___StyledButton-sc-1093ize-0").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".forward___StyledButton-sc-1v7b2gm-0").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#compositions_0_title").setValue(title);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#compositions_0_qty").setValue(compositions);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#compositions_0_okei").setValue("шт");
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("[title='Штука (ШТ), код ОКЕИ 796']").click();
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_priceStart").setValue(composition);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_0_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_0_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_1_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_1_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_2_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_2_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_3_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_3_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_4_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_4_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_5_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_5_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_6_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_6_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_7_key").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_characteristicValue_7_value").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_deliveryTerms").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_stockTerms").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_paymentTerms").setValue(title);
            sleep(3000);
        });
        step("Наименование списка оферт,test2", () -> {
            $("#compositions_0_info").setValue(title);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Опубликовать закупку")).click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Опубликовать")).click();
            sleep(3000);
        });

    }
}
