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

public class OrganizationProfileTest extends TestBase {


    @Tag("demowebshop")
    @Test
    @Description("Если профиль организации не заполнен, открывается форма просмотра")
    @DisplayName("Regression Testing")
    void forgotPasswordForm() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Проверить кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").shouldHave(text("Забыли пароль?"));
            sleep(2000);
        });
        step("Проверить кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
            sleep(2000);
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol2-sc-aspcrp-3").shouldHave(text("Забыли пароль?"));
            sleep(2000);
        });

    }

    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты не соответствующий формату e-mail: [любой набор символов]@[любой набор символов")
    @DisplayName("Regression Testing")
    void invalidEmailForm() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue(login);
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
            sleep(2000);
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Некорректное значение e-mail"));
            sleep(2000);
        });

    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты не зарегистрированного на площадке пользователя.")
    @DisplayName("Regression Testing")
    void unregisteredEmailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("de2222eeeeeev1@test.test");
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
            sleep(2000);
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Восстановление пароля для данного e-mail невозможно"));
            sleep(2000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты зарегистрированного на площадке пользователя в статусе =! Активен")
    @DisplayName("Regression Testing")
    void blockedEmailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue("1w0zest@test.test");
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
            sleep(2000);
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".forgot-password___StyledCol4-sc-aspcrp-8").shouldHave(text("Восстановление пароля для данного e-mail невозможно"));
            sleep(2000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести в поле “E-mail“ адрес электронной почты зарегистрированного на площадке пользователя в статусе = Активен. нажать “Восстановить пароль”")
    @DisplayName("Regression Testing")
    void activeEmailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Нажать на кнопку Забыли пароль?", () -> {
            $(".sign-in___StyledButton-sc-1ofz83b-12").click();
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $("#email").setValue(login);
            sleep(2000);
        });
        step("Ввести невалидный email", () -> {
            $(byText("ВОССТАНОВИТЬ ПАРОЛЬ")).click();
            sleep(2000);
        });
        step("Получить результат:  Должна открыться форма восстановления пароля:", () -> {
            $(".ant-modal-title").shouldHave(text("Восстановление пароля"));
            sleep(2000);
        });
        step("Модальное окно закрывается.", () -> {
            $(".ant-modal-footer").click();
            sleep(2000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Проверка текста письма с ссылкой на восстановление пароля")
    @DisplayName("Regression Testing")
    void emailTest() {
        step("Open 'https://stage.onlc.market/',Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
    }

}
