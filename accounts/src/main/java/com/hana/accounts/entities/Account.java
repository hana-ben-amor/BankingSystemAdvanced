package com.hana.accounts.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity {
   @Column(name = "customer_id")
    private Long customerId;
    @Id
    @Column(name = "account_number")
    /*We will generate account number manually in the logic of the application*/
    private Long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;

 public Long getCustomerId() {
  return customerId;
 }

 public void setCustomerId(Long customerId) {
  this.customerId = customerId;
 }

 public Long getAccountNumber() {
  return accountNumber;
 }

 public void setAccountNumber(Long accountNumber) {
  this.accountNumber = accountNumber;
 }

 public String getAccountType() {
  return accountType;
 }

 public void setAccountType(String accountType) {
  this.accountType = accountType;
 }

 public String getBranchAddress() {
  return branchAddress;
 }

 public void setBranchAddress(String branchAddress) {
  this.branchAddress = branchAddress;
 }
}
