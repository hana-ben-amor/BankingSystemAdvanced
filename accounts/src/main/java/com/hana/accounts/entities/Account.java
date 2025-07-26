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
}
