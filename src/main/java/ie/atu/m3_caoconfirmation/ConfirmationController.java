package ie.atu.m3_caoconfirmation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfirmationController {

    @PostMapping("/confirm")
    public Map<String, String> confirmStudent(@RequestBody StudentCourseRequest studentCourseRequest) {
        System.out.println("Confirmed Student Details with selected courses: " + studentCourseRequest.getStudentDetails() + " || "
                + studentCourseRequest.getCourseList());
        Map<String, String> response = new HashMap<>();
        response.put("status", "CAO application confirmed");
        response.put("message", "Student: " + studentCourseRequest.getStudentDetails().getFirstname() + " " +
                studentCourseRequest.getStudentDetails().getLastname() + " || Courses: " +
                studentCourseRequest.getCourseList() + " has been Registered (Micro3)");
        return response;
    }
}
