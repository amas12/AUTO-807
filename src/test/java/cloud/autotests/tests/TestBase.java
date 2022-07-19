package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.config.demowebshop.App;
import cloud.autotests.helpers.AllureAttachments;
import cloud.autotests.helpers.DriverSettings;
import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Locale;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }
    public static String login;
    protected static String password;
    protected static String url;
    protected  static String urlPurchase;
    protected static String loginAdmin;
    protected static String passwordAdmin;
    protected  static String openPersonal;

    @BeforeAll
    static void configureBaseUrl() {
        RestAssured.baseURI = App.config.apiUrl();
        Configuration.baseUrl = App.config.webUrl();

        login = App.config.userLogin();
        password = App.config.userPassword();
        url= App.config.webUrl();
        urlPurchase = App.config.openUrlPurchase();
        passwordAdmin = App.config.userPasswordAdmin();
        loginAdmin = App.config.userloginAdmin();
        openPersonal = App.config.openPersonalArea();
    }
    Faker faker = new Faker(new Locale("ru"));

    protected String title = faker.internet().password();

    protected String firstName = faker.name().firstName();
    protected String lastname = faker.name().lastName();
    protected String fullName = faker.name().fullName();
    protected String number = faker.number().digits(2);
    protected String vendorCode = faker.address().zipCode();
    protected String comment = faker.backToTheFuture().quote();

    protected String email = faker.internet().password();



    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }
}
