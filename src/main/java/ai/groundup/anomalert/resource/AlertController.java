package ai.groundup.anomalert.resource;

import ai.groundup.anomalert.model.Alert;
import ai.groundup.anomalert.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alert-api")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @GetMapping
    public ResponseEntity<List<Alert>> allAlert() {
        try {
            List<Alert> alerts = alertService.allAlert();
            return new ResponseEntity<>(alerts, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/by-machine/{machine}")
    public ResponseEntity<List<Alert>> alertByMachine(@PathVariable String machine) {
        try {
            String encoded = URLEncoder.encode(machine, StandardCharsets.UTF_8);
            encoded = encoded.replace("+", " ");
            List<Alert> alerts = alertService.alertByMachine(encoded);
            return new ResponseEntity<>(alerts, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alert> alertById(@PathVariable Long id) {
        try {
            Optional<Alert> alert = alertService.alertById(id);
            return new ResponseEntity<>(alert.get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
