package cloud.autotests.tests;


import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class PurchaseTest {


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
            $("#email").setValue("21qa@test.test");
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
            $(byText("Мои закупки")).click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });

        step("Нажать выбрать мои оферты", () -> {
            $(byText("Сохранить черновик")).click();
            sleep(3000);
        });
    }


}
