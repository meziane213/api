package apicloud;

import apicloud.Services.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HistoricalSalaryController {
    @Autowired
    private Facade facade;

    @GetMapping("/historical-salaries")
    public ResponseEntity<?> getHistoricalSalaries(@RequestParam String nom) {
        try {
            Map<Integer, Integer> salaries = facade.getSalaires(nom);
            return ResponseEntity.ok(salaries);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "Cette api est faite uniquement pour le cas Assa."));
        }
    }
}
