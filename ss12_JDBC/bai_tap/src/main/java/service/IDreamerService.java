package service;

import model.Dreamer;

import java.util.List;

public interface IDreamerService {
    List<Dreamer> list();
    void  save(int id);
    void  delete(int id);
    Dreamer findById(int id);
    List<Dreamer> findByCountry(String country);
}
