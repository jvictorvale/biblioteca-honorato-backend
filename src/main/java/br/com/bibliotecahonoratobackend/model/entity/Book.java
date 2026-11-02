package br.com.bibliotecahonoratobackend.model.entity;

import br.com.bibliotecahonoratobackend.model.enums.BookStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book extends BaseEntity<Long> {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "cover_url")
    private String coverUrl;

    @Column(name = "purchase_link")
    private String purchaseLink;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private BookStatus status;

    private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String review;

    @Column(name = "read_date")
    private LocalDate readDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "page_count")
    private Integer pageCount;

    @Column(length = 20)
    private String isbn;

    @Column(length = 150)
    private String publisher;
}
