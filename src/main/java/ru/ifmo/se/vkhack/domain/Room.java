package ru.ifmo.se.vkhack.domain;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @Column(name = "id_room")
    private Long idRoom;

    @ManyToOne
    @JoinColumn(name = "id_body")
    private Body body;

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Long getIdRoom() {

        return idRoom;
    }

    public Body getBody() {
        return body;
    }
}
