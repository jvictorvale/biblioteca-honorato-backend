package br.com.bibliotecahonoratobackend.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "gift_intentions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GiftIntention extends BaseEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(name = "friend_name", nullable = false, length = 100)
    private String friendName;

    @Column(name = "friend_note")
    private String friendNote;
}
