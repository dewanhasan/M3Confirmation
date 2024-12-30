package ie.atu.m3_caoconfirmation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {

    private String courseCode;
    private String courseDetails;

    private Long studentId;
}
