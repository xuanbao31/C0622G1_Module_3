package repository;

import model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {


    private static Map<Integer, Product> productMap = new LinkedHashMap<>();

    static {

        Product product1 = new Product(1, "Máy Xay", "20$", "Tốt", "Vàng");
        Product product2 = new Product(2, "Giấy OCB", "5$", "Tốt", "Trắng");
        Product product3 = new Product(3, "Boong", "20$", "Tốt", "Xanh Lá");
        Product product4 = new Product(4, "Hóa Hơi", "100$", "Tốt", "Bạch Kim");
        Product product5 = new Product(5, "Blunt", "10$", "Tốt", "Nâu Đất");

        productMap.put(product1.getId(), product1);
        productMap.put(product2.getId(), product2);
        productMap.put(product3.getId(), product3);
        productMap.put(product4.getId(), product4);
        productMap.put(product5.getId(), product5);
    }

    @Override
    public List<Product> list() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> list = new ArrayList<>();
        Set<Integer> set = productMap.keySet();
        for (Integer integer : set) {
            if (productMap.get(integer).getName().contains(name)) {
                list.add(productMap.get(integer));
            }
        }
        return list;
    }

    @Override
    public void add(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void save(Product product) {
        int id = product.getId();
        if (id == 0) {
            List<Product> productList = new ArrayList<>(productMap.values());
            id = productList.get(productList.size() - 1).getId() + 1;
            product.setId(id);
            productMap.put(id, product);
        } else {
            productMap.replace(product.getId(), product);
        }
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

//    @Override
//    public void remove(int id) {
//        productMap.remove(id);
//    }
@Override
public void delete(int id) {
    productMap.remove(id);
}
}
