
package calories.tracker.app.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entry JPA entity
 */
public class Entry {
    @ManyToOne
    private User user;
    
    /*
    -- Date
-- StartTime
-- BreakStartTime
-- BreakEndTime
-- EndTime
-- ExtraHours
-- Description
    */
    
    private Date date;
    
    private Time startTime;
    private Time breakStartTime;
    private Time BreakEndTime;
    private Time endTime;
    private float extraHours;
    private String notes;
    
    public Entry(){
	
    }

    public Entry(User user, Date date, Time startTime, Time breakStartTime, Time BreakEndTime, Time endTime, float extraHours, String notes) {
	this.user = user;
	this.date = date;
	this.startTime = startTime;
	this.breakStartTime = breakStartTime;
	this.BreakEndTime = BreakEndTime;
	this.endTime = endTime;
	this.extraHours = extraHours;
	this.notes = notes;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Time getStartTime() {
	return startTime;
    }

    public void setStartTime(Time startTime) {
	this.startTime = startTime;
    }

    public Time getBreakStartTime() {
	return breakStartTime;
    }

    public void setBreakStartTime(Time breakStartTime) {
	this.breakStartTime = breakStartTime;
    }

    public Time getBreakEndTime() {
	return BreakEndTime;
    }

    public void setBreakEndTime(Time BreakEndTime) {
	this.BreakEndTime = BreakEndTime;
    }

    public Time getEndTime() {
	return endTime;
    }

    public void setEndTime(Time endTime) {
	this.endTime = endTime;
    }

    public float getExtraHours() {
	return extraHours;
    }

    public void setExtraHours(float extraHours) {
	this.extraHours = extraHours;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }
}
