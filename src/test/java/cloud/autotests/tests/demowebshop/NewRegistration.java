package cloud.autotests.tests.demowebshop;

import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class NewRegistration extends TestBase {


    @Tag("demowebshop")
    @Test
    @Description("Открытие формы входа ")
    @DisplayName("Opening a login form")

    void openingLoginForm() {
        step("Открываем любую страницу сайта.", () -> {
            open(url);
            clearBrowserCookies();
            refresh();

        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".ant-popover-content").shouldHave(text("Вход"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Открытие формы регистрации по E-mail")
    @DisplayName("Opening the registration form by E-mail")
    void openingRegistration() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
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
    @Tag("demowebshop")
    @Test
    @Description("Оставить все поля пустыми. Нажать на кнопку “Создать личный кабинет”")
    @DisplayName("Leave all fields blank")
    void leaveFieldsEmpty() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });

        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
        });
        step(" Нажать на чекбокс", () -> {
            $("[type='checkbox']").click();
        });
        step(" Оставить все поля пустыми. Нажать на кнопку “Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-xixosh-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Оставить поле “E-mail” пустым")
    @DisplayName("Leave the \"E-mail\" field empty")
    void leaveEmailFieldBlank() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
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
            sleep(3000);
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести e-mail пользователя, который уже зарегистрирован на площадке,")
    @DisplayName("Enter the e-mail of a user who is already registered on the site")
    void emailUserWhoRegistered() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
            sleep(3000);
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
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
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Пользователь с таким email уже существует"));

        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести значения в поле “E-mail” не соответствующее формату “E-mail”")
    @DisplayName("Enter values in the “E-mail” field that do not correspond to the “E-mail” format")
    void doesNotMatchEmailFormat() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
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
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(3000);
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Некорректное значение"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнить поле “E-mail” корректными данными Стереть данные в поле “Имя”")
    @DisplayName("Fill in the “E-mail” field with correct data. Delete the data in the “Name” field.")
    void sendEmptyDataFieldName() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test").clear();
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
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнить поле “Имя”. Стереть данные в поле “Фамилия”.")
    @DisplayName("Fill in the \"Name\" field. Delete the data in the \"Last Name\" field.")
    void deleteDataLastNameField() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
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
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнить поле “Имя”. Стереть данные в поле “Фамилия”.")
    @DisplayName("Fill in the \"Name\" field. Save the data in the Last Name field.")
    void fillNameField() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
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
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(3000);
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнить поле “Фамилия”. Нажать на “Создать личный кабинет.")
    @DisplayName("Fill in the Last Name field. Click on \"Create a personal account")
    void fillLastNameField() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
        });
        step("ВВести Фамилия", () -> {
            $("#nameI").setValue(firstName);
        });
        step("Нажать на чекбокс", () -> {
            $(".ant-checkbox-input").click();
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(3000);
        });
        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнить все обязательные поля корректными данными.")
    @DisplayName("Fill in all required fields with correct data.")
    void fillRequiredFields() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
            sleep(3000);
        });
        step("Открыть модальное окно регистрации”", () -> {
            $(".sign-in___StyledButton2-sc-1ofz83b-16").click();
        });
        step("ВВести email", () -> {
            $("#email").setValue(email + "@test.test");
        });
        step("ВВести Фамилия", () -> {
            $("#nameF").setValue(firstName);
        });
        step("Нажать на чекбокс", () -> {
            $(".ant-checkbox-input").click();
        });
        step("Нажать на кнопку Создать личный кабинет", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(3000);
        });

        step("Должна отобразиться форма входа следующего вида", () -> {
            $(".sign-up___StyledCol3-sc-1n48p61-7").shouldHave(text("Заполните обязательные поля"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Регистрация по E-mail")
    @DisplayName("Registration by E-mail")
    void registrationEmail() {
        step("Открываем любую страницу сайта", () -> {
            open(url);
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("В правом углу шапки сайта кликаем ссылку «Личный кабинет»", () -> {
            $(openPersonal).click();
        });
        step("Открыть модальное окно регистрации”", () -> {
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
            sleep(3000);
        });
        step("Отобразиться модальное окно", () -> {
            $(".ant-modal-content").shouldHave(text("Данные профиля сохранены. Для завершения регистрации необходимо подтвердить e-mail и задать пароль учетной записи." +
                    " Инструкции высланы на указанный e-mail"));
        });
        step("Нажать на кнопку ок ", () -> {
            $(".ant-modal-footer").click();
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Проверка письма, которое ушло оператору")
    @DisplayName("Checking that the letters went to the operator")
    void checkingLetterOperator() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open(url);
            sleep(6000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(openPersonal).click();
            sleep(2000);
        });
        step("Ввести email", () -> {
            $("#email").setValue(loginAdmin);
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue(passwordAdmin);
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1 ").click();
            sleep(10000);
        });
        step("Нажать на меню", () -> {
            $(".HeaderBottomServiceButton___StyledBadge-sc-1gvkxmg-3 ").click();
            sleep(10000);
        });
        step("Нажать на кнопку Все Уведомления", () -> {
            $(".content___StyledButton-sc-2reeec-2").click();
            sleep(9000);
        });
        step("ажать на смс", () -> {
            $(".list___StyledItem-sc-bjo96j-0").click();
            sleep(6000);
        });
        step("ажать на смс", () -> {
            $(".ant-modal-title").shouldHave(text("Регистрация пользователя в Магазине Малых Закупок ONLINECONTRACT"));
            sleep(3000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Пройти по ссылке с истекшим сроком действия (24 ч)")
    @DisplayName("expired 24")
    void expired() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/c4pYFMEb5-Q8LcpIssycvkxgfHcyR1VsTnz8rKvKXM8");
        });
        step("Проверить текст", () -> {
            $(".auth___StyledCol-sc-19px8wx-0").shouldHave(text("Время действия ссылки истекло. " +
                    "Для активации профиля необходимо обратиться к администратору организации в " +
                    "Системе для повторной отправки ссылки для подтверждения"));
            sleep(2000);
        });
        step("Нажать на кнопку ок", () -> {
            $(".modal___StyledButton-sc-bb3r8r-0").click();
            sleep(2000);
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Открытие формы ввода пароля")
    @DisplayName("Opening the password entry form")
    void passwordForm() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/SNvda93M3jW74F2u7i8ANom4pQpFooMdmqEl50PaGho");
            sleep(3000);
        });
        step("Нажать на смс", () -> {
            $("#password").setValue("Aa123456");
        });
        step("Нажать на смс", () -> {
            $("#password2").setValue("Aa123456");
        });
        step("Нажать на смс", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Дважды пройти по ссылке ")
    @DisplayName("Follow the link twice")
    void followLink() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/uwuqkJvhhaAnR6ViuKdAZah1v-rvA8-v17zk1Tq2q5c");
            sleep(3000);
        });
        step("Нажать на смс", () -> {
            $(".ant-modal-content").shouldHave(text("Ссылка не действительна"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Заполнение полей модального окна “Создание пароля”")
    @DisplayName("Create a password")
    void leaveFieldsBlank() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/n3RAeReBYGmcUxqT1huzeCWGwbww-Ypls2uH-tT1p9Y");
            sleep(3000);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на смс", () -> {
            $(".create-password___StyledCol3-sc-19d2vt8-6").shouldHave(text("Пароль должен содержать от 8 до 32 символов: латинские" +
                    " буквы (заглавные (A-Z) и строчные (a-z)) и цифры (0-9)"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Ввести 7 любых символов в поле ввода “Пароль*” пароля. Нажать “Сохранить пароль” ")
    @DisplayName("password check")
    void passwordCheck() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/n3RAeReBYGmcUxqT1huzeCWGwbww-Ypls2uH-tT1p9Y");
            sleep(3000);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password").setValue("1234567");
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на смс", () -> {
            $(".create-password___StyledCol3-sc-19d2vt8-6").shouldHave(text("Пароль должен содержать от 8 до 32 символов: латинские" +
                    " буквы (заглавные (A-Z) и строчные (a-z)) и цифры (0-9)"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description(" Ввести 33 любых символа в поле ввода “Пароль*”. Нажать “Сохранить пароль” ")
    @DisplayName("Enter 33 any characters")
    void checkingCharacters() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/n3RAeReBYGmcUxqT1huzeCWGwbww-Ypls2uH-tT1p9Y");
            sleep(3000);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password").setValue(password);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на смс", () -> {
            $(".create-password___StyledCol3-sc-19d2vt8-6").shouldHave(text("Пароль должен содержать от 8 до 32 символов: латинские" +
                    " буквы (заглавные (A-Z) и строчные (a-z)) и цифры (0-9)"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description(" Ввести в поля ввода разные пароли.  Нажать “Сохранить пароль” ")
    @DisplayName("input fields different passwords")
    void inputDifferentPasswords() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/n3RAeReBYGmcUxqT1huzeCWGwbww-Ypls2uH-tT1p9Y");
            sleep(3000);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password").setValue(password + number);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password2").setValue(password);
        });

        step("Нажать на кнопку Сохранить пароль", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на смс", () -> {
            $(".create-password___StyledCol3-sc-19d2vt8-6").shouldHave(text("Пароли должны совпадать"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Сохранение пароля в модальном окне “Создание пароля”")
    @DisplayName("Creating a password”")
    void creatingPassword() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/confirmation-email/Rm9IdkmQtl66yokMxSwkJkws5pmCLkBEgG2I_7fCTUk");
            sleep(3000);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password").setValue(password + number);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $("#password2").setValue(password + number);
        });
        step("Нажать на кнопку Сохранить пароль", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
        });
        step("Нажать на смс", () -> {
            $(".create-password___StyledCol-sc-19d2vt8-0").shouldHave(text("Пароль успешно изменен"));
            sleep(2000);
        });
        step("Нажать на ok", () -> {
            $(".ant-modal-footer").shouldHave(text("ОК"));
        });
    }
    @Tag("demowebshop")
    @Test
    @Description("Проверка письма, которое ушло оператору")
    @DisplayName("Checking that the letters went to the operator")
    void checkin0gLetterOperator() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/");
            sleep(6000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledBadge-sc-1gvkxmg-3").click();
            sleep(7000);
        });

    }

}

