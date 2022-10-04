package service.impl;

import model.Dreamer;
import repository.IDreamerRepository;
import repository.impl.DreamerRepositoryImpl;
import service.IDreamerService;

import java.util.List;

public class DreamerServiceImpl implements IDreamerService {
    public IDreamerRepository dreamerRepository = new DreamerRepositoryImpl();

    @Override
    public List<Dreamer> list() {
        return dreamerRepository.list();
    }

    @Override
    public void save(Dreamer dreamer) {
  dreamerRepository.save(dreamer);
    }

    @Override
    public void delete(int id) {
        dreamerRepository.delete(id);
    }

    @Override
    public Dreamer findById(int id) {
        return findById(id);
    }

    @Override
    public List<Dreamer> findByCountry(String country) {
        return dreamerRepository.findByCountry('%'+ country+'%');
    }


}
