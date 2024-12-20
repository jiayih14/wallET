package JH.wall_e_t.services.Income;

import JH.wall_e_t.dto.IncomeDTO;
import JH.wall_e_t.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);
    List<IncomeDTO> getAllIncomes();

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeId(Long id);

    void deleteIncome(Long id);
}
