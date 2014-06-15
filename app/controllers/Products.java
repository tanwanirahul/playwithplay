package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.ProductsService;

public class Products extends Controller {

    public static Result list() {
        return ok(Json.toJson(new ProductsService().getProducts()));
    }
 
    public static Result find(Long productId) {
        productId -= 1;
        return ok(Json.toJson(new ProductsService().prepareProduct(productId, "" + (productId + 1), (double)productId, productId)));
    }

}
