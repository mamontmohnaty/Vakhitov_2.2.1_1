package hiber.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   @OneToOne
   @JoinColumn(name = "car_series")
   @Cascade(org.hibernate.annotations.CascadeType.ALL)

   @Getter
   @Setter
   private Car car;

   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }
}

//   public User(String firstName, String lastName, String email) {
//      this.firstName = firstName;
//      this.lastName = lastName;
//      this.email = email;
//   }
