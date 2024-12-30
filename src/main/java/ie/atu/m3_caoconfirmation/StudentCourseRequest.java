package ie.atu.m3_caoconfirmation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentCourseRequest {
    private StudentDetails studentDetails;
    private List<Course> courseList;
}