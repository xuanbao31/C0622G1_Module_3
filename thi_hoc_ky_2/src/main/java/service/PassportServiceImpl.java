package service;

import model.Passport;
import repository.IPassportRepository;
import repository.PassportRepositoryImpl;

import java.util.List;

public class PassportServiceImpl implements IPassportService {
    private IPassportRepository passportRepository = new PassportRepositoryImpl();

    @Override
    public List<Passport> findByAll() {
        return passportRepository.findByAll();
    }
}
