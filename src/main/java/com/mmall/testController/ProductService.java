package com.mmall.testController;

import com.mmall.dao.ProductMapper;
import com.mmall.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> selectList(){
        return productMapper.selectList();
    }

}
