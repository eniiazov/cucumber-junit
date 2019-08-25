package helper;


import models.RequestBody;

import java.util.Map;

public class HelperMethods {

    public static RequestBody convertMapToObject(Map<String, String> map){

        RequestBody requestBody = new RequestBody();

        requestBody.setFirstName(map.get("firstName"));
        requestBody.setLastName(map.get("lastName"));
        requestBody.setBirthDate(map.get("birthDate"));
        requestBody.setDepartment(map.get("department"));
        requestBody.setEmailAddress(map.get("emailAddress"));
        requestBody.setGender(map.get("gender"));
        requestBody.setJoinDate(map.get("joinDate"));
        requestBody.setPassword(map.get("password"));
        requestBody.setPhone(map.get("phone"));
        requestBody.setPremanentAddress(map.get("permenantAdd"));
        requestBody.setSection(map.get("section"));
        requestBody.setSubject(map.get("subject"));
        requestBody.setBatch(Integer.valueOf(map.get("batch")));
        requestBody.setSalary(Integer.valueOf(map.get("salary")));

        return requestBody;
    }

}
