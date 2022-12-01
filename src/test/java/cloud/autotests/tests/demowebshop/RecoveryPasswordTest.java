package cloud.autotests.tests.demowebshop;

import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class RecoveryPasswordTest extends TestBase {


    @Tag("demowebshop")
    @Test
    @Description("Открытие формы авторизации по E-mail ")
    @DisplayName("Regression Testing")
    void forgotPasswordForm() {
        step("Open 'https://stage.onlcmarket.ru/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlcmarket.ru/");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Проверить кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").shouldHave(text("Забыли пароль?"));
        });
        step("Проверить кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol2-sc-aspcrp-3").shouldHave(text("Забыли пароль?"));
        });
    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты не соответствующий формату e-mail: [любой набор символов]@[любой набор символов")
    @DisplayName("Regression Testing")
    void invalidEmailForm() {
        step("Open 'https://stage.onlcmarket.ru',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlcmarket.ru");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("dev1test.test");
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Некорректное значение e-mail"));
        });

    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты не зарегистрированного на площадке пользователя.")
    @DisplayName("Regression Testing")
    void unregisteredEmailTest() {
        step("Open 'https://stage.onlcmarket.ru',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlcmarket.ru");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("de2222eeeeeev1@test.test");
            sleep(4000);
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Восстановление пароля для данного e-mail невозможно"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты зарегистрированного на площадке пользователя в статусе =! Активен")
    @DisplayName("Regression Testing")
    void blockedEmailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlc.market/");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("1w0zest@test.test");
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Восстановление пароля для данного e-mail невозможно"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты зарегистрированного на площадке пользователя в статусе = Активен. нажать “Восстановить пароль”")
    @DisplayName("Regression Testing")
    void activeEmailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlc.market/");
            clearBrowserCookies();
            refresh();
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("dev1@test.test");
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".ant-modal-header").shouldHave(text("Восстановление пароля"));
        });
        step("Модальное окно закрывается.", () -> {
            $(".ant-modal-footer").click();
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Проверка текста письма с ссылкой на восстановление пароля")
    @DisplayName("Regression Testing")
    void emailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open("https://stage.onlc.market/");
            clearBrowserCookies();
            refresh();
        });
    }

}
