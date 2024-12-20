package JH.wall_e_t.dto;

import JH.wall_e_t.entity.Expense;
import JH.wall_e_t.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;
}
