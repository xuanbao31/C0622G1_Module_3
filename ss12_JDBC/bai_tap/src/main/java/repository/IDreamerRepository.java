package repository;

import model.Dreamer;

import java.util.List;

public interface IDreamerRepository {
    List<Dreamer> list();
void  save(int id);
void  delete(int id);
Dreamer findById(int id);
List<Dreamer> findByCountry(String country);
}
