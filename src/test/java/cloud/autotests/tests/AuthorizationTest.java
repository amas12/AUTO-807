package cloud.autotests.tests;


import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AuthorizationTest extends TestBase{



    @Test
    @Description("Регистрация нового юзера")
    @DisplayName("Regression Testing")
    void registrationTest() {
        step("Open 'https://dev1.onlc.market/'", () -> {
            open("https://dev1.onlc.market/");
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Ввести email", () -> {
            $("#email").setValue("dev1@test.test");
        });
        step("Ввести пароль", () -> {
            $("#password").setValue("Aa123456");
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
        });

        step("Нажать на кнопку Создать оферту", () -> {
            $(".ant-select-selection-item").click();
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("[title='20%']").click();
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_price").setValue("99800");
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("#offerForm_okei").setValue("Действующее вещество: Миллиграмм (мг), код ОКЕИ D161");
            sleep(3000);
        });
        step("Нажать на кнопку Создать оферту", () -> {
            $("[title='Действующее вещество: Миллиграмм (мг), код ОКЕИ D161']").click();
            sleep(3000);
        });
        //step("ОКПД2", () -> {
        // $(".ant-select-selection-overflow-item").setValue("33");
        //sleep(3000);
        //});
        //step("Нажать на кнопку Создать оферту", () -> {
        //  $("[title='33  Услуги по ремонту и монтажу машин и оборудования']").click();
        //sleep(3000);
        //});
    }
}