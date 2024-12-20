package JH.wall_e_t.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDTO {

    private Long id;

    private String title;

    private String description;

    private String category;

    private LocalDate date;

    private int amount;
}
