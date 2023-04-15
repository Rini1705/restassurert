package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set Get api Endpoints")
    public String setApiEndpoint() {
        return url + "post/1";
    }
    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {

        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I receive valid data for detail user")
//    public void validateDataDetailUser() {
//        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));
//        restAssuredThat(response -> response.body("'data'.'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
//    }
}
