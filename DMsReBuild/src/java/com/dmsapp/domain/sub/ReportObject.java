/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmsapp.domain.sub;

/**
 *
 * @author Sudarsan
 */
public class ReportObject implements java.io.Serializable{

    private String studentId;
    private String studentName;
    private String internalOne;
    private String internalTwo;
    private String attendance;
    private String numberOfWorkingDays;
    private String numberOfPresentedDays;
    private String assignment;
    private Integer totalMarks;
    private String grandTotal;
    private String year;
    private String branch;
    private String semister;
    private String paper;
    private String paperCode;

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getInternalOne() {
        return internalOne;
    }

    public void setInternalOne(String internalOne) {
        this.internalOne = internalOne;
    }

    public String getInternalTwo() {
        return internalTwo;
    }

    public void setInternalTwo(String internalTwo) {
        this.internalTwo = internalTwo;
    }

    public String getNumberOfPresentedDays() {
        return numberOfPresentedDays;
    }

    public void setNumberOfPresentedDays(String numberOfPresentedDays) {
        this.numberOfPresentedDays = numberOfPresentedDays;
    }

    public String getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(String numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode;
    }

    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append(super.toString());
        toStringBuilder.append("\n");
        toStringBuilder.append("\nstudentId: ");
        toStringBuilder.append(studentId);
        toStringBuilder.append("\nstudentName: ");
        toStringBuilder.append(studentName);
        toStringBuilder.append("\ninternalOne: ");
        toStringBuilder.append(internalOne);
        toStringBuilder.append("\ninternalTwo: ");
        toStringBuilder.append(internalTwo);
        toStringBuilder.append("\nattendance: ");
        toStringBuilder.append(attendance);
        toStringBuilder.append("\nnumberOfWorkingDays: ");
        toStringBuilder.append(numberOfWorkingDays);
        toStringBuilder.append("\nnumberOfPresentedDays: ");
        toStringBuilder.append(numberOfPresentedDays);
        toStringBuilder.append("\nassignment: ");
        toStringBuilder.append(assignment);
        toStringBuilder.append("\ntotalMarks: ");
        toStringBuilder.append(totalMarks);
        toStringBuilder.append("\ngrandTotal: ");
        toStringBuilder.append(grandTotal);
        toStringBuilder.append("\nyear: ");
        toStringBuilder.append(year);
        toStringBuilder.append("\nbranch: ");
        toStringBuilder.append(branch);
        toStringBuilder.append("\nsemister: ");
        toStringBuilder.append(semister);
        toStringBuilder.append("\npaper: ");
        toStringBuilder.append(paper);
        toStringBuilder.append("\npaperCode: ");
        toStringBuilder.append(paperCode);
        return toStringBuilder.toString();
    }

   
    
    
}
