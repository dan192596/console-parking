package com.console.parking.data.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "message", schema = "core", catalog = "core")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "message")
    private String message;

    @NotNull
    @Column(name = "sent_datetime")
    private Date sentDatetime;

    @NotNull
    @Column(name = "user_message")
    private Boolean userMessage;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;
}
