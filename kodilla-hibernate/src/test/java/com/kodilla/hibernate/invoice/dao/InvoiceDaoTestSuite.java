package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Umbrella");
        Product product2 = new Product("Shoes");
        Item item1 = new Item(product1, new BigDecimal(12), 20, new BigDecimal(220));
        Item item2 = new Item(product1, new BigDecimal(25), 1, new BigDecimal(12));
        Item item3 = new Item(product2, new BigDecimal(2), 100, new BigDecimal(300));
        Item item4 = new Item(product2, new BigDecimal(10), 1000, new BigDecimal(200));
        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        invoiceDao.save(invoice);
        int size = invoice.getItems().size();
        int id = invoice.getId();
        String result1 = invoice.getItems().get(0).getProduct().getName();
        String result2 = invoice.getItems().get(1).getProduct().getName();
        String result3 = invoice.getItems().get(2).getProduct().getName();
        String result4 = invoice.getItems().get(3).getProduct().getName();


        //Then
        Assert.assertEquals(4, size);
        Assert.assertEquals(result1, "Umbrella");
        Assert.assertEquals(result2, "Umbrella");
        Assert.assertEquals(result3, "Shoes");
        Assert.assertEquals(result4, "Shoes");

        //CleanUp
        invoiceDao.deleteById(id);
    }

}
