package com.example.entities.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Enty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
            private Long id;
            private String name;





}
