package ai.groundup.anomalert.service;

import ai.groundup.anomalert.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepo extends JpaRepository<Alert, Long> {
    public List<Alert> findByMachine(String machine);

    public List<Alert> findByIsChecked(Boolean isChecked);
}
