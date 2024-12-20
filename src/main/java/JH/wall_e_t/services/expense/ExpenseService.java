package JH.wall_e_t.services.expense;

import JH.wall_e_t.dto.ExpenseDTO;
import JH.wall_e_t.entity.Expense;
import JH.wall_e_t.repository.ExpenseRepository;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);
    List<Expense> getAllExpense();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpense(Long id);
}
