package com.pedroeuropeu.websocket.user;

import com.pedroeuropeu.websocket.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
