package ro.unibuc.springlab8example1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDto {
    private Long id;

    private String name;

    private Integer noStudents;
}
