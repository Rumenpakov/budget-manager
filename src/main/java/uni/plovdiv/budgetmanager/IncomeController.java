package uni.plovdiv.budgetmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/budget/income")
public class IncomeController {

    @Autowired
    private BudgetManager budgetManager;

    @GetMapping()
    public String createIncome(@RequestParam(name = "value") double value, @RequestParam(name = "date") String date, @RequestParam(name = "isRecurring") boolean isRecurring) {
        if (!isRecurring) {
            budgetManager.addIncome(value);
        } else {
            RecurringFinance recurringIncome = new RecurringFinance(date, FinanceType.INCOME, value);
            budgetManager.addRecurringIncome(recurringIncome);
        }
        return "Success";
    }



//https://www.budget.com/income?value=100&date=12.12.2020&type=income
}
