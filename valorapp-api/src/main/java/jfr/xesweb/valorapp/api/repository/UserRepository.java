package jfr.xesweb.valorapp.api.repository;

import jfr.xesweb.valorapp.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {}
