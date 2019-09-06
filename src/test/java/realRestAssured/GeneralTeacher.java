package realRestAssured;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralTeacher {

    String firstName;
    String lastName;
    String subject;
    String emailAddress;

}
