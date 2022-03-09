package uni.plovdiv.budgetmanager;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class BudgetManager {

    private List<Double> incomes = new ArrayList<>();
    private List<Double> expenditures = new ArrayList<>();

    private List<RecurringFinance> recurringIncomes = new ArrayList<>();
    private List<RecurringFinance> recurringExpenditures = new ArrayList<>();

    public void addIncome(double income) {
        this.incomes.add(income);
    }

    public void addRecurringIncome(RecurringFinance recurringFinance) {
        recurringIncomes.add(recurringFinance);
    }

    public Double getBudget() {
        double budget = 0;
        for (double income : incomes) {
            budget += income;
        }

        for (double expenditure : expenditures) {
            budget -= expenditure;
        }

        return budget;
    }
}
