package com.zfc.study.stock.controller;

import com.zfc.study.order.domain.vo.SaleOrderVo;
import com.zfc.study.stock.depend.saleOrder.SaleOrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zufeichao
 * @ProjectName demoStockCenter
 * @Description TODO
 * @Date 2019-06-27 10:34
 **/
@RestController
@RequestMapping("/api/v1/saleOrder")
public class SaleOrderController {

    @Autowired
    private SaleOrderClient saleOrderClient;


    @GetMapping("/queryList")
    public List<SaleOrderVo> questList(){
        return  saleOrderClient.queryList();
    }
}
