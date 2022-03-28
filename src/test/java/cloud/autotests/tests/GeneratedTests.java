package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Открытая часть оферт, не авторизованый юзер")
    @DisplayName("Regression Testing")
    void generatedTest() {
        step("Open 'https://stage.onlc.market/'", () -> {
            open("https://stage.onlc.market/");
        });
        step("Поиск по наименованию оферты", () -> {
            $("#HomeOffersForm_query").setValue("Клавиатура DX1").pressEnter().clear();
            sleep(5000);
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldHave(Condition.text("Найдено: 1"));

        });
        step("Нажать на кнопку крестик", () -> {
            $(".anticon-close-circle").click();
            sleep(8000);
            //$("title___StyledCol-sc-sv1nh9-1").shouldHave(Condition.text("Оферты: 632342"));
        });
        step("Цена за единицу от", () -> {
            $("#HomeOffersForm_priceFrom").setValue("222");
            sleep(2000);
        });
        step("Цена за единицу до", () -> {
            $("#HomeOffersForm_priceTo").setValue("222").pressEnter();
            sleep(4000);
        });
        step("Цена за единицу до", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(4000);
        });
        step("Поставщик, наименование", () -> {
            $("#HomeOffersForm_providerQuery").setValue("Мир Хобби").pressEnter();
            sleep(9000);
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldHave(Condition.text("Найдено: 51020"));
        });
        step("Нажать на кнопку крестик", () -> {
            $(".providerQuery___StyledFormItem-sc-ogeujy-0 .ant-input-suffix").click();
            sleep(6000);
        });
        step("Поставщик, наименование", () -> {
            $("#HomeOffersForm_providerQuery").setValue("1649069856").pressEnter();
            sleep(4000);
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldHave(Condition.text("Найдено: 376465"));
        });
        step("Нажать на кнопку крестик", () -> {
            $(".providerQuery___StyledFormItem-sc-ogeujy-0 .ant-input-suffix").click();
            sleep(6000);
        });
        step("Open 'https://stage.onlc.market/'", () -> {
            $(".ant-select").click();
            sleep(3000);
        });
        step("Нажать на первый чекбос'", () -> {
            $(".ant-checkbox").click();
            sleep(3000);
        });
        step("Нажать на первый чекбос'", () -> {
            $("#HomeOffersForm_regions").setValue("02");
            sleep(3000);
        });
        step("Нажать на первый чекбос'", () -> {
            $(".ant-checkbox").click();
            sleep(3000);
        });
        step("Поиск оферты", () -> {
            $("#HomeOffersForm_query").setValue("Брелок металл \"Жираф\" серебро 5х2 см").pressEnter();
            sleep(4000);
        });
        step("Нажать на наименование", () -> {
            $(".card___StyledParagraph-sc-1ka6810-0").click();
            sleep(4000);
        });
        step("Нажать на наименование", () -> {
            $(".button___StyledAntButton-sc-d38qus-1").click();
            sleep(4000);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://stage.onlc.market/'", () ->
                open("https://stage.onlc.market/"));

        step("Page title should have text 'Магазин Малых Закупок'", () -> {
            String expectedTitle = "Магазин Малых Закупок";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://stage.onlc.market/'", () ->
                open("https://stage.onlc.market/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}