package org.cbtf.f2f.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by lbrockman on 3/25/17.
 */
@Entity
public class AlertsUpdate implements Serializable {

    @Id
    @GeneratedValue
    private Integer alertID;

    private String message;

    private Long dateTime;

    public AlertsUpdate() {
        this.message = "A generic constructor was called";
    }

    public AlertsUpdate(String message, Long dateTime) {
        this.message = message;
        this.dateTime = dateTime;
    }

    public AlertsUpdate(String message) {
        this.message = message;
        this.dateTime = null;
    }

    public Integer getAlertID() {
        return alertID;
    }

    public void setAlertID(Integer alertID) {
        this.alertID = alertID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }
}
