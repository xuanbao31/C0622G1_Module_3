package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> list() {
        return iProductRepository.list();
    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductRepository.searchByName(name);
    }


    @Override
    public void add(Product product) {
        iProductRepository.add(product);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }
}
