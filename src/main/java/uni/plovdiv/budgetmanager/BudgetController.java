package uni.plovdiv.budgetmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/budget")
public class BudgetController {

    @Autowired
    private BudgetManager budgetManager;

    @GetMapping
    public String getBudget() {
        return budgetManager.getBudget() + "";
    }
}
