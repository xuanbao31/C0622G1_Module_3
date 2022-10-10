package repository;

import model.Passport;

import java.util.List;

public interface IPassportRepository {
    List<Passport>findByAll();
}
