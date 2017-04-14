package com.didispace.web;

import java.util.Date;

public class Score {
	private static final long serialVersionUID = 8127035730921338189L;

    private int id;

    
    private int stuId;

    
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Score [id=" + id + ", stuId=" + stuId + ", subjectName=" + subjectName + ", score=" + score
				+ ", examTime=" + examTime + "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the stuId
	 */
	public int getStuId() {
		return stuId;
	}


	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}


	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	/**
	 * @return the score
	 */
	public float getScore() {
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(float score) {
		this.score = score;
	}


	/**
	 * @return the examTime
	 */
	public Date getExamTime() {
		return examTime;
	}


	/**
	 * @param examTime the examTime to set
	 */
	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private String subjectName;

    
    private float score;

    
    private Date examTime; 
}
