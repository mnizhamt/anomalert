package ai.groundup.anomalert.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Alert {
    @Id
    @SequenceGenerator(name="alert_idalert_seq",
            sequenceName="alert_idalert_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="alert_idalert_seq")
    @Column(name = "idalert", updatable=false)
    private Long id;

    private LocalDateTime alertDate;

    private String machine;

    private String anomaly;

    private Long sensor;

    private String soundClip;

    private Boolean isChecked = false;

    public Alert() {}

    public Alert(LocalDateTime alertDate, String machine, String anomaly, Long sensor, String soundClip) {
        this.alertDate = alertDate;
        this.machine = machine;
        this.anomaly = anomaly;
        this.sensor = sensor;
        this.soundClip = soundClip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(LocalDateTime alertDate) {
        this.alertDate = alertDate;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getAnomaly() {
        return anomaly;
    }

    public void setAnomaly(String anomaly) {
        this.anomaly = anomaly;
    }

    public Long getSensor() {
        return sensor;
    }

    public void setSensor(Long sensor) {
        this.sensor = sensor;
    }

    public String getSoundClip() {
        return soundClip;
    }

    public void setSoundClip(String soundClip) {
        this.soundClip = soundClip;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }
}
