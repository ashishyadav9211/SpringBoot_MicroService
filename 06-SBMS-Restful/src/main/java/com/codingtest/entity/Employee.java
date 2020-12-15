package com.codingtest.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.codingtest.model.AuditModel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "emp_tbl", uniqueConstraints = { @UniqueConstraint(columnNames = "empId"),
		@UniqueConstraint(columnNames = "email") })
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee extends AuditModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7563120409673682040L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;

	@Column(name = "name", length = 100, nullable = false)
	private String name;
	private String designation;

	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;

	private double salary;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
	private List<Account> account=new ArrayList<>();;
	
	
	 public void addB(Account accnt) {
	        getAccount().add(accnt);
	        accnt.setEmployee(this);
	    }
	 
	    public void removeAccount(Account accnt) {
	        getAccount().remove(accnt);
	        accnt.setEmployee(null);
	    }  

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
//	@Override
//	public Object clone() {
//	    Employee user = null;
//	    try {
//	        user = (Employee) super.clone();
//	    } catch (CloneNotSupportedException e) {
//	        user = null;
//	    }
//	    user.account = (List<Account>) this.account.get(0).clone();
//	    return user;
//	}

	 public boolean equals(Object object) {
	        if (object == this)
	            return true;
	        if ((object == null) || !(object instanceof Employee))
	            return false;
	 
	        final Employee a = (Employee)object;
	 
	        if (empId != null && a.getEmpId() != null) {
	            return empId.equals(a.getEmpId());
	        }
			return false;
	        }
	       
}