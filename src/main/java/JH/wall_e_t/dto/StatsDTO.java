package JH.wall_e_t.dto;

import JH.wall_e_t.entity.Expense;
import JH.wall_e_t.entity.Income;
import lombok.Data;

@Data
public class StatsDTO {

    private Double income;

    private Double expense;

    private Income latestIncome;

    private Expense latestExpense;

    private Double balance;

    private Double minIncome;

    private Double maxIncome;

    private Double minExpense;

    private Double maxExpense;



}
