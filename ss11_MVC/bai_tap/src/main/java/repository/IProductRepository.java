package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product>list();
List<Product>searchByName(String name);
    void add (Product product);
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    void delete(int id);
}
