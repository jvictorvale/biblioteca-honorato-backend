package br.com.bibliotecahonoratobackend.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "best_of_the_year")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BestOfTheYear extends BaseEntity<Long>{

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false, unique = true)
    private Book book;

    @Column(nullable = false, unique = true)
    private Integer year;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String justification;
}
