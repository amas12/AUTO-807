package cloud.autotests.tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {
    Faker faker = new Faker(new Locale("ru"));

    String email =  faker.internet().password();
    String firstName =faker.name().firstName();
    String lastname = faker.name().lastName();
    String fullName = faker.name().fullName();

    @Test
    @Description("Регистрация нового юзера")
    @DisplayName("Regression Testing")
    void registrationTest() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/");
            sleep(4000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
            sleep(2000);
        });
        step("Нажать на кнопку Регистрация", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
            sleep(2000);
        });
        step("ВВести email", () -> {
            $("#email").setValue(email+"@test.test");
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".ant-modal-content .button___StyledAntButton-sc-d38qus-1").click();

        });
    }
}
