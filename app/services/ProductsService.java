package services;

import java.util.ArrayList;
import java.util.List;

import models.Product;

public class ProductsService implements IProductsService {

    @Override
    public List<Product> getProducts() {
        // Returns the list of couple of projects.
        List<Product> products = new ArrayList<Product>();
        for(int i=0;i<10; ++i)
            products.add(prepareProduct((long) i, ""+(i+1), (double) i, (long) i));
        return products;
    }
    
    public Product prepareProduct(Long id, String name, Double price, Long quantity)
    {
        long baseId = 1;
        String productPrefix = "product:";
        double basePrice = 100;
        long baseQuantity = 10;
        
        Product product = new Product();
        product.setId(baseId + id);
        product.setName(productPrefix + name);
        product.setPrice(basePrice + price);
        product.setQuantity(baseQuantity + quantity);
        return product;
       
    }

}
