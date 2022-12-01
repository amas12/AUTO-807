package cloud.autotests.tests.demowebshop;

import cloud.autotests.tests.TestBase;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {

    Faker faker = new Faker(new Locale("ru"));

    String email = faker.internet().password();
    String firstName = faker.name().firstName();
    String lastname = faker.name().lastName();
    String fullName = faker.name().fullName();

    @Tag("demowebshop")
    @Test
    @Description("Открытие формы входа")
    @DisplayName("Regression Testing")
    void openingLoginForm() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlc.market/");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Регистрация нового юзера")
    @DisplayName("Regression Testing")
    void registrationSTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать на кнопку Регистрация", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test");
        });
        step("ВВести Фамилия", () -> {
            $("#nameF").setValue(firstName);
        });
        step("ВВести Имя", () -> {
            $("#nameI").setValue(lastname);
        });
        step("ВВести Отчество", () -> {
            $("#nameO").setValue(fullName);
        });
        step("Нажать на чекбокс", () -> {
            $(".ant-checkbox-input").click();
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".ant-modal-content .button___StyledAntButton-sc-1vj16k3-1").click();
        });
    }
}
