package cloud.autotests.tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class NewRegistration extends TestBase {

    Faker faker = new Faker(new Locale("ru"));

    String email = faker.internet().password();
    String firstName = faker.name().firstName();
    String lastname = faker.name().lastName();
    String fullName = faker.name().fullName();

    @Test
    @Description("Открытие формы входа ")
    @DisplayName("Opening a login form")
    void openingLoginForm() {
        step("Открываем любую страницу сайта.", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".ant-popover-content").shouldHave(text("Вход"));
        });
    }

    @Test
    @Description("Открытие формы регистрации по E-mail")
    @DisplayName("Opening the registration form by E-mail")
    void openingRegistration() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });

        step("В открывшемся модальном окне нажимаем на “Регистрация”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".ant-popover-inner").shouldHave(
                    (text("Регистрация")),
                    (text("E-mail")),
                    (text("Создать личный кабинет")),
                    (text("Я принимаю Правила, принимаю политику в отношении обработки персональных данных и даю согласие на получение сообщений от Магазина Малых Закупок ONLINECONTRACT\n" +
                            "Есть личный кабинет?")),
                    (text("Создать личный кабинет")));
        });
    }

    @Test
    @Description("Оставить все поля пустыми. Нажать на кнопку “Создать личный кабинет”")
    @DisplayName("Leave all fields blank")
    void leaveFieldsEmpty() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });

        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step(" Нажать на чекбокс", () -> {
            $("[type='checkbox']").click();
        });
        step(" Оставить все поля пустыми. Нажать на кнопку “Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }

    @Test
    @Description("Оставить поле “E-mail” пустым")
    @DisplayName("Leave the \"E-mail\" field empty")
    void leaveEmailFieldBlank() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
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
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Ввести e-mail пользователя, который уже зарегистрирован на площадке,")
    @DisplayName("Enter the e-mail of a user who is already registered on the site")
    void emailUserWhoRegistered() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue("dev1@test.test");
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Пользователь с таким email уже существует"));

        });
    }
    @Test
    @Description("Ввести значения в поле “E-mail” не соответствующее формату “E-mail”")
    @DisplayName("Enter values in the “E-mail” field that do not correspond to the “E-mail” format")
    void doesNotMatchEmailFormat() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue("dev1&&&&");
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Некорректное значение"));
        });
    }
    @Test
    @Description("Заполнить поле “E-mail” корректными данными Стереть данные в поле “Имя”")
    @DisplayName("Fill in the “E-mail” field with correct data. Delete the data in the “Name” field.")
    void sendEmptyDataFieldName() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test");
        });
        step("ВВести Фамилия", () -> {
            $("#nameF").setValue(firstName);
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Заполнить поле “Имя”. Стереть данные в поле “Фамилия”.")
    @DisplayName("Fill in the \"Name\" field. Delete the data in the \"Last Name\" field.")
    void deleteDataLastNameField() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test");
        });
        step("ВВести Фамилия", () -> {
            $("#nameF").setValue(firstName);
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Заполнить поле “Имя”. Стереть данные в поле “Фамилия”.")
    @DisplayName("Fill in the \"Name\" field. Save the data in the Last Name field.")
    void fillNameField() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test");
        });
        step("ВВести Фамилия", () -> {
            $("#nameI").setValue(firstName);
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Заполнить поле “Фамилия”. Нажать на “Создать личный кабинет.")
    @DisplayName("Fill in the Last Name field. Click on \"Create a personal account")
    void fillLastNameField() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
        });
        step("ВВести Фамилия", () -> {
            $("#nameI").setValue(firstName);
        });
        step("Нажать на чекбокс", () -> {
            $(".ant-checkbox-input").click();
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Заполнить все обязательные поля корректными данными.")
    @DisplayName("Fill in all required fields with correct data.")
    void fillRequiredFields() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Test
    @Description("Регистрация по E-mail")
    @DisplayName("Registration by E-mail")
    void registrationEmail() {
        step("Открываем любую страницу сайта", () -> {
            open("https://dev1.onlc.market/");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1ysp0s5-6").click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-nh5068-16").click();
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
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(3000);
        });
       step("Отобразиться модальное окно", ()-> {
           $(".ant-modal-content").shouldHave(text("Данные профиля сохранены. Для завершения регистрации необходимо подтвердить e-mail и задать пароль учетной записи. Инструкции высланы на указанный e-mail"));
       });
    }
}
