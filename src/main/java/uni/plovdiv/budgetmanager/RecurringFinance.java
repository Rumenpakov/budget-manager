package uni.plovdiv.budgetmanager;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RecurringFinance {

    private String dateOfOccurrence;
    private FinanceType financeType;
    private double amount;

    public RecurringFinance(String dateOfOccurrence, FinanceType financeType, double amount) {
        this.dateOfOccurrence = dateOfOccurrence;
        this.financeType = financeType;
        this.amount = amount;
    }
}
