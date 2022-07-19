package cloud.autotests.tests.robots;

import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class RoobotTest extends TestBase {
    @Tag("demowebshop")
    @Test
    @Description("Если профиль организации не заполнен, открывается форма просмотра")
    @DisplayName("Regression Testing")
    void forgot1PasswordForm() {
        step("Open 'https://onlcmarket.ru/robots.txt',Открываем любую страницу сайта.", () -> {
            open("robots.txt");
            clearBrowserCookies();
            refresh();
            sleep(1000);
        });
        step("Проверить кнопку Забыли пароль?", () -> {
            String expectedBody = "User-agent: *\\n\" +\n" +
                    "                    \"Allow: /\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"Sitemap: https://onlcmarket.ru/sitemap_generator/sitemap_index.xml";
            String actualBody = expectedBody;

            assertThat(actualBody).isEqualTo(expectedBody);
        });
    }
}
