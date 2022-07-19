package cloud.autotests.tests.demowebshop;


import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Story("Login tests")
public class MyOffersTest extends TestBase {
    @Tag("demowebshop")
    @Test
    @Description("Просмотр списка оферт текущей организации.")
    @DisplayName("list of offers of the current organization.")
    void listOffersOrganizationTest() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open(url);
            sleep(3000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(2000);
        });
        step("Ввести email", () -> {
            $("#email").setValue(login);
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue(password);
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Нажать на меню", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Мои оферты")).click();
        });

        step("Фильтр. Наименование списка оферт", () -> {
            $(".ant-form-item-control-input").click();
            sleep(9000);
        });
       /* step("Наименование списка оферт,test2", () -> {
            $("[title='test2']").click();
            sleep(3000);
        });
        step("Проверка найденных", () -> {
            $(".top___StyledCol3-sc-w9diny-4").shouldHave(text("Найдено: 5"));
            sleep(2000);
        });
        step("Проверка в карточке оферты", () -> {
            $(".card___StyledSpan8-sc-1ka6810-18").shouldHave(text("test2"));
            sleep(2000);
        });*/
    }

    @Tag("demowebshop")
    @Test
    @Description("Создать оферту")
    @DisplayName("Create an offer")
    void createOfferTest() {

        step("Open 'https://stage.onlc.market/'", () -> {
            open(url);
            sleep(3000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(byText("Личный кабинет")).click();
            sleep(2000);
        });
        step("Ввести email", () -> {
            $("#email").setValue(login);
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue(password);
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(byText("ВОЙТИ")).click();
            sleep(2000);
        });
        step("Нажать на меню", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Мои оферты")).click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".top___StyledButton-sc-nyevam-7").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_title").setValue(title);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_vendorCode").setValue(vendorCode);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_price").setValue(number + 22);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-select-selection-item").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='0%']").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[aria-activedescendant='offerForm_okei_list_0']").click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='Пачка (ПАЧ), код ОКЕИ 728']").click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_priceComment").setValue(comment);
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_text").setValue(comment);
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-select-selection-overflow").hover().click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_okpd").setValue("33");
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $$(".ant-checkbox").first().click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".form___StyledDiv18-sc-4jjgyv-32").click();
            sleep(4000);
        });

        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_dateValid").click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='2022-08-07']").click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_info").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_0_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_0_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_1_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_1_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_2_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_2_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_3_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_3_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_4_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_4_value").setValue(comment);
            sleep(2000);
        });

        step("Нажать выбрать мои оферты", () -> {
            $(".button___StyledAntButton-sc-1vj16k3-1 ").click();
            sleep(2000);
        });

    }
    @Tag("demowebshop")
    @Test
    @Description("Создать оферту")
    @DisplayName("Create an offer")
    void createAnotherOfferTest() {

        step("Open 'https://stage.onlc.market/'", () -> {
            open(url);
            sleep(3000);
        });
        step("Нажать на кнопку Личный кабинет ", () -> {
            $(byText("Личный кабинет")).click();
            sleep(2000);
        });
        step("Ввести email", () -> {
            $("#email").setValue(login);
            sleep(2000);
        });
        step("Ввести пароль", () -> {
            $("#password").setValue(password);
            sleep(2000);
        });
        step("Нажать на Войти", () -> {
            $(byText("ВОЙТИ")).click();
            sleep(2000);
        });
        step("Нажать на меню", () -> {
            $(".HeaderBottomServiceButton___StyledSpan3-sc-1gvkxmg-6").click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(byText("Мои оферты")).click();
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".top___StyledButton-sc-nyevam-7").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_title").setValue(title);
            sleep(3000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_vendorCode").setValue(vendorCode);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_price").setValue(number + 22);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-select-selection-item").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='0%']").click();
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[aria-activedescendant='offerForm_okei_list_0']").click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='Пачка (ПАЧ), код ОКЕИ 728']").click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_priceComment").setValue(comment);
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_text").setValue(comment);
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-select-selection-overflow").hover().click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_okpd").setValue("33");
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $$(".ant-checkbox").first().click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".form___StyledDiv18-sc-4jjgyv-32").click();
            sleep(4000);
        });

        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_dateValid").click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("[title='2022-08-07']").click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_info").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_0_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_0_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_1_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_1_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_2_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_2_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_3_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_3_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_4_key").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $("#offerForm_characteristicValue_4_value").setValue(comment);
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".form___StyledDiv19-sc-4jjgyv-33 .ant-checkbox").click();
            sleep(4000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-modal-footer .button___StyledAntButton-sc-1vj16k3-1").click();
            sleep(2000);
        });
        step("Нажать выбрать мои оферты", () -> {
            $(".ant-modal-footer").click();
            sleep(2000);
        });


    }

}
