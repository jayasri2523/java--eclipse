package ai.jobiak.collections;

import java.util.Objects;

public class Course1 implements Comparable { 
	
	private String courseId;
	private String title;
	private int durationhours;
	private double fees;
	public Course1() {
		
	}
	public Course1(String courseId, String title, int durationhours, double fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.durationhours = durationhours;
		this.fees = fees;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDurationhours() {
		return durationhours;
	}
	public void setDurationhours(int durationhours) {
		this.durationhours = durationhours;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", durationhours=" + durationhours + ", fees="
				+ fees + "]";
	}
	@Override
	public int compareTo(Object o) {
		Course1 ref=(Course1) o;
		if (this.courseId.compareTo(ref.getCourseId())<0) {
			return -1;
		}
		else if (this.courseId.compareTo(ref.getCourseId())==0) {
			return 0;
		}
			else if (this.courseId.compareTo(ref.getCourseId())>0) {
			return 1;
			}
			return 0;
	
	}

	
	

	
	
	

		
	}

