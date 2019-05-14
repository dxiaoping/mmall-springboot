package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IProductService;
import com.mmall.vo.ProductDetailVo;
import com.mmall.vo.ProductListVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 前端产品控制
 */
@Slf4j
@Controller
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    private IProductService productService;

    //前端用户请求详情页
    @RequestMapping(value = "detail.do")
    @ResponseBody
    public ServerResponse<ProductDetailVo> detail(Integer productId) {
        return productService.getProductDetail(productId);
    }

    //前端用户搜索请求
    @RequestMapping(value = "list.do")
//    @ResponseBody
    public String list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "categoryId", required = false) Integer categoryId,
            @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(value = "orderBy", defaultValue = "") String orderBy,
            Model model){
        ServerResponse<PageInfo> pageInfo = productService.getProductByKeywordCategory(keyword,categoryId,pageNum,pageSize,orderBy);
        List<ProductListVo> productList = pageInfo.getData().getList();
        model.addAttribute("productList",productList);
        log.info("productList:{}",productList.get(0).getName());
        return "productList";
    }
}
