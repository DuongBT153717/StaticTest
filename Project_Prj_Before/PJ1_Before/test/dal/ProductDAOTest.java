/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.List;
import model.Product;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Admin
 */
public class ProductDAOTest {

    ProductDAO pdao;

    public ProductDAOTest() {
        pdao = new ProductDAO();       
    }

    @Test
    public void testGetAll() {

    }

    @Test
    public void testGetListProByCat() {

    }

    @Test
    public void testGetTop3ListProByCat() {
    }

    @Test
    public void testGetLast() {
    }

    @Test
    public void testGetLast3Product() {
    }

    @Test
    public void testGetProductById() {
        assertEquals(1003, pdao.getProductById(1003).getId_pro());
        assertNull(pdao.getProductById(1));      
    }

    @Test
    public void testSearchByName() {
        List<Product> search = pdao.searchByName("b");
        int expected = 6;
        assertEquals(expected, search.size());
    }

    @Test
    public void testSearchByPrice() {
        
    }

    @Test
    public void testGetListProBySellID() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testExistedPro() {
    }

    @Test
    public void testPagingProduct() {
    }

    @Test
    public void testPagingProductByName() {
    }

    @Test
    public void testCount() {
    }

    @Test
    public void testCountByCid() {
    }

    @Test
    public void testCountProductBySeller() {
    }

    @Test
    public void testPagingManagerProduct() {
    }

    @Test
    public void testCountBySearchName() {
    }

    @Test
    public void testCountByPrice() {
    }

    @Test
    public void testPagingProductByPrice() {
    }

    @Test
    public void testPagingProductBySortLow() {
    }

    @Test
    public void testPagingProductBySortHigh() {
    }

    @Test
    public void testPagingProductByCat() {
    }

    @Test
    public void testCountProductLow() {
    }

    @Test
    public void testAddPro() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testGetAllProductBySortLow() {
    }

    @Test
    public void testGetAllProductBySortHigh() {
    }

}
