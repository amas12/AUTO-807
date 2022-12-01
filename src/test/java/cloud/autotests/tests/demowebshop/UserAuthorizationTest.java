package cloud.autotests.tests.demowebshop;

import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class UserAuthorizationTest extends TestBase {


    @Tag("demowebshop")
    @Test
    @Description("Открытие формы авторизации по E-mail ")
    @DisplayName("Regression Testing")
    void openingLoginForm() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке. Поле пароля оставить пустым. Нажать “Войти“.")
    @DisplayName("Regression Testing")
    void defunctEmailTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке", () -> {
            $("#email").setValue("dev3!233x1@test.test");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Получить результат", () -> {
            $(".sign-in___StyledCol-sc-1ofz83b-5").shouldHave(text("Неверный логин или пароль"));
            sleep(2000);
        });
    }

    @Tag("demowebshop")
    @Test
    @Description(" Стереть данные в поле “E-mail”, ввести любой набор символов в поле “Пароль”. Нажать “Войти” .")
    @DisplayName("Regression Testing")
    void deleteEmailTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
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
        step("Получить результат", () -> {
            $(".sign-in___StyledCol-sc-1ofz83b-5").shouldHave(text("Неверный логин или пароль"));
            sleep(2000);
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ почтовый адрес, не соответствующий формату email: [любой набор символов]@[ любой набор символов]. Нажать “Войти“.")
    @DisplayName("Regression Testing")
    void invalidEmailTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке", () -> {
            $("#email").setValue("dev3!233x1test.test");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Получить результат", () -> {
            $(".sign-in___StyledCol-sc-1ofz83b-5").shouldHave(text("Неверный логин или пароль"));
            sleep(2000);
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ почтовый адрес пользователя, статус которого =! Активен. Нажать “Войти“.")
    @DisplayName("Regression Testing")
    void statusInactiveTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке", () -> {
            $("#email").setValue("test92@test.ru");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Получить результат", () -> {
            $(".sign-in___StyledCol-sc-1ofz83b-5").shouldHave(text("Неверный логин или пароль"));
            sleep(2000);
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ почтовый адрес пользователя, зарегистрированного на площадке, статус которого = Активен. Ввести в поле “Пароль” неверный пароль для данного пользователя.")
    @DisplayName("Regression Testing")
    void incorrectPasswordTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке", () -> {
            $("#email").setValue("dev1@test.test");
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue("Aa1223456");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Получить результат", () -> {
            $(".sign-in___StyledCol-sc-1ofz83b-5").shouldHave(text("Неверный логин или пароль"));
            sleep(2000);
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("статус которого = Активен. Ввести в поле “Пароль” верный пароль")
    @DisplayName("Regression Testing")
    void validDataTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести в поле “E-mail“ почтовый адрес пользователя, который не зарегистрирован на площадке", () -> {
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
        step("Получить результат", () -> {
            $(".UserHeaderButton___StyledParagraph-sc-6zbpjc-0").shouldHave(text("Маркус Валентинович Гурбууу"));
            sleep(2000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("статус которого = Активен. Ввести в поле “Пароль” верный пароль")
    @DisplayName("Regression Testing")
    void hideShowPasswordTest() {
        step("Open 'https://stage.onlc.market/", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue("Aa123456");
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".ant-input-suffix").click();
            sleep(2000);
        });
    }

}
