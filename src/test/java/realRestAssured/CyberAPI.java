package realRestAssured;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CyberAPI {

    @Test
    public void getTeachersTest() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        // Challenge: read 4 attributes from the response and for each and every object
        // JsonPath: writing the syntax of the path to preferred attribute in the
        // response. This design is not preferred. Because it will be hardcoded and
        // dependent from the object structure.
        // We are going to use POJO model.
        // POJO approach is most fit for API automation.
        // IDEA: converting the JSON response into Basic Java object and have an
        // access to its' fields/attributes/properties.
        // We also use Jackson library to map from json to object or object to json.

        ObjectMapper mapper = new ObjectMapper();
        GeneralResponse gr = mapper.readValue(response.asString(), GeneralResponse.class);
        System.out.println(gr.getTeachers().size());

        for(GeneralTeacher teacher: gr.getTeachers()){
            System.out.println(teacher.getFirstName()+"\n");
            Assert.assertTrue(teacher.getFirstName() != null);
            Assert.assertTrue(teacher.getLastName() != null);
            Assert.assertTrue(teacher.getEmailAddress() != null);
            Assert.assertTrue(teacher.getSubject() != null);
        }
    }

   

}
