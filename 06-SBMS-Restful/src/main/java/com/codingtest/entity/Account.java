package com.codingtest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.codingtest.model.AuditModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "account",uniqueConstraints = {
		@UniqueConstraint(columnNames = "accountId")
})
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account extends AuditModel implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2799059766815650582L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long accountId;
	
    @Column(name = "ACC_NUMBER", unique = true, nullable = false, length = 100)
	private String accountNumber;
	
	private String accountType;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="emp_id",nullable=false)  
	private Employee employee;
	
//	@Override
//	public Object clone() {
//	    try {
//	        return (Account) super.clone();
//	    } catch (CloneNotSupportedException e) {
//	        return null;
//	    }
//	}
//	
	
	
	 public boolean equals(Object object) {
	        if (object == this)
	            return true;
	        if ((object == null) || !(object instanceof Account))
	            return false;
	 
	        final Account accnt = (Account)object;
	 
	        if (accountId != null && accnt.getAccountId() != null) {
	            return accountId.equals(accnt.getAccountId());
	        }
	        return false;
	    }
}
