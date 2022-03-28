package cloud.autotests.tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AuthorizationTest extends TestBase{
    Faker faker = new Faker(new Locale("ru"));

    String offerForm_title =  faker.business().creditCardExpiry();
    String offerForm_vendorCode =faker.name().nameWithMiddle();
    //tring offerForm_price = faker.number().randomNumber();
    String offerForm_priceComment = faker.cat().breed();
    String offerForm_text = faker.book().title();
    String offerForm_info = faker.address().cityName();



    @Test
    @Description("Регистрация нового юзера")
    @DisplayName("Regression Testing")
    void registrationTest() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/");
            sleep(3000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(2000);
        });
        step("Нажать на меню", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-menu-item-only-child").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $(".top___StyledButton-sc-w9diny-7").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_title").setValue(offerForm_title);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_vendorCode").setValue(offerForm_vendorCode);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $(".ant-select-selection-item").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("[title='20%']").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_price").setValue("99800");
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_okei").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("[title='Действующее вещество: Миллиграмм (мг), код ОКЕИ D161']").click();
            sleep(3000);
        });
        /*step("ОКПД2", () -> {
            $(".ant-select-selection-overflow").screenshot();
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("[aria-activedescendant='offerForm_okpd_list_2']").click();
            sleep(3000);
        });*/
        step("календарь", () -> {
            $("#offerForm_dateValid").click();
            sleep(3000);
        });
        step("выбрать дату 2022-03-29", () -> {
            $("[title='2022-03-29']").click();
            sleep(3000);
        });
        step("выбрать дату 2022-03-29", () -> {
            $("#offerForm_characteristicValue_0_key").setValue(offerForm_title);
            sleep(3000);
        });
        step("выбрать дату 2022-03-29", () -> {
            $("#offerForm_characteristicValue_0_value").setValue(offerForm_title);
            sleep(3000);
        });
        step("выбрать дату 2022-03-29", () -> {
            $("#offerForm_characteristicValue_0_value").setValue(offerForm_title);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_priceComment").setValue(offerForm_priceComment);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_text").setValue(offerForm_text);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_info").setValue(offerForm_info);
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });

    }
}