package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class Delete {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints(){
        return url + "post/1";
    }
    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }
}
