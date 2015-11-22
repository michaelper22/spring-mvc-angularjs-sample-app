package calories.tracker.app.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pay Period JPA entity
 */
@Entity
@Table(name = "period")
public class Period extends AbstractEntity {
    @ManyToOne
    private User user;
    
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Temporal(TemporalType.DATE)
    private Date endDate;
    
    private int totalHours;

    public Period(){
	
    }
    
    public Period(User user, Date startDate, Date endDate, int totalHours) {
	this.user = user;
	this.startDate = startDate;
	this.endDate = endDate;
	this.totalHours = totalHours;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Date getStartDate() {
	return startDate;
    }

    public void setStartDate(Date startDate) {
	this.startDate = startDate;
    }

    public Date getEndDate() {
	return endDate;
    }

    public void setEndDate(Date endDate) {
	this.endDate = endDate;
    }

    public int getTotalHours() {
	return totalHours;
    }

    public void setTotalHours(int totalHours) {
	this.totalHours = totalHours;
    }
    
    
}
