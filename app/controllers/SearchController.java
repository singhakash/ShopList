package controllers;

import models.Product;
import models.Shop;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;

import viewmodels.SearchResult;


import java.util.List;
import play.mvc.Result;





/**
 * Created with IntelliJ IDEA.
 * User: Akash Singh
 * Date: 11/7/13
 * Time: 1:37 AM
 * To change this template use File | Settings | File Templates.
 */

public class SearchController extends Controller {

    public static Result search() {
        DynamicForm requestData = Form.form().bindFromRequest();
        String criteria = "product";
        //String criteria = requestData.get("criteria");

        String keyword = requestData.get("keyword");

        SearchResult result = new SearchResult();
        result.criteria = criteria;
        result.keyword = keyword;

        if (criteria == "shop") {
            List<Shop> shops = Shop.findByShopName(keyword);
            result.shops.addAll(shops);
        }
        else
        result.shops.addAll(Product.findByShopName(keyword));


        return ok(views.html.search.results.render(result));
    }


}
