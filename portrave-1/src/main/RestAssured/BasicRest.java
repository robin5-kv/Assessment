package RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
public class BasicRest
{
    public static void  getStudents(){
       // String id= "1";
       Response res = given()
               .contentType(ContentType.JSON)
              // .pathParam("id",719)
                .get("https://dummy.restapiexample.com/api/v1/employees")
                .then()
               .log().all().extract().response().thenReturn();
     // String Response= res.prettyPrint();
        JSONObject ob  = new JSONObject(res.toString());
       int a= ob.getJSONArray("data").length();
       for(int i =0;i<=a; i++)
       {
          String name= ob.getJSONArray("data").getJSONObject(i).getString("employee_name");
           System.out.println(name);


       }
     // int a = res.jsonPath().getList("data").size();

        System.out.println(a);
    }
    public static void main(String[] args) {
        BasicRest.getStudents();
    }
}

