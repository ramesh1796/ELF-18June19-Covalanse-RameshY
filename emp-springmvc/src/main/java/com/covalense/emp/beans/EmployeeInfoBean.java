package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable {

@LazyCollection(LazyCollectionOption.FALSE)	
@OneToOne(cascade = CascadeType.ALL, mappedBy ="infoBean")	
private EmployeeOtherInfoBean employeeOtherInfoBean;

@LazyCollection(LazyCollectionOption.FALSE)	
@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
private List<EmployeeAddressInfoBean> addressInfoBeans;

@LazyCollection(LazyCollectionOption.FALSE)	
@OneToMany(cascade = CascadeType.ALL, mappedBy = "experienceInfoPKBean.infoBean")
private List<EmployeeExperienceInfoBean> experienceInfoBeans;

@LazyCollection(LazyCollectionOption.FALSE)	
@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.infoBean")
private List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans;

@LazyCollection(LazyCollectionOption.FALSE)	
@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
private List<TrainingInfoBean> trainingInfoBeans;

 @Id
 @Column(name="id")
 private int id;
 @Column(name="name")
 private String name;
 @Column(name="age")
 private int age;
 @Column(name="gender")
 private String gender;
 @Column(name="salary")
 private double salary;
 @Column(name="phone")
 private  long phone;
// @DateTimeFormat(pattern = "yyyy-MM-dd")
// @Temporal(TemporalType.DATE)
 @Column(name="joining_date")
 private  Date joiningDate;
 @Column(name="account_no")
 private long accountNumber;
 @Column(name="email")
 private String email;
 @Column(name="designation")
 private String designation;
// @DateTimeFormat(pattern = "yyyy-MM-dd")
// @Temporal(TemporalType.DATE)
 @Column(name="dob")
 private Date dob;
 
 @ManyToOne(cascade = CascadeType.ALL )
 @JoinColumn(name="department_id",referencedColumnName = "dept_id")
 private DepartmentInfoBean departmentInfoBean;
 
 @ManyToOne
 @JoinColumn(name="manager_id", referencedColumnName = "id")
 private EmployeeInfoBean managerId;
 @Column(name="password")
 private String password;
  
}
