package org.example.client;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @Column
    private long licenseId;
    @Column(nullable = false)
    private String name;
    @Column
    private long phoneNumber;
    @Column
    private String email;
    @Column
    private int rentCount;
    @Column (nullable = false)
    private double totalPrice;
    @Column
    private double finalPrice;
    @Column
    private double discount;
    //    @Column
//    private double finalPrice;
//    @OneToMany()
////   @JoinColumn(name="client_id")
//    private List<Car> cars;
    public Client(String name, long licenseId, long phoneNumber, String email ) {
        this.name = name;
        this.licenseId = licenseId;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    public Client(){


    }
    protected Client(String name, long licenseId, long phoneNumber, String email, double discount, int rentCount, double finalPrice){
        this.name = name;
        this.licenseId = licenseId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.discount=discount;
        this.rentCount=rentCount;
        this.finalPrice=finalPrice;

    }


}
