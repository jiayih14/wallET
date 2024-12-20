package JH.wall_e_t.controller;


import JH.wall_e_t.dto.ExpenseDTO;
import JH.wall_e_t.entity.Expense;
import JH.wall_e_t.services.expense.ExpenseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
@RequiredArgsConstructor
@CrossOrigin("*")

public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<?> postExpense(@RequestBody ExpenseDTO dto){
        Expense createdExpense = expenseService.postExpense(dto);

        if(createdExpense != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);

        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpense());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getExpenseById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(expenseService.getExpenseById(id));
        }
        catch(EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateExpense(@PathVariable Long id, @RequestBody ExpenseDTO dto){
        try{
            return ResponseEntity.ok(expenseService.updateExpense(id, dto));
        }
        catch(EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went Wrong");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExpense(@PathVariable Long id){
        try{
            expenseService.deleteExpense(id);
            return ResponseEntity.ok(null);
        }
        catch(EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went Wrong");
        }
    }

}
