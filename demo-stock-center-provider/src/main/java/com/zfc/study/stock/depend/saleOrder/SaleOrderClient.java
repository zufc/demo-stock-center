package com.zfc.study.stock.depend.saleOrder;

import com.zfc.study.order.domain.vo.SaleOrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("demo-order-center")
@RequestMapping("/demo-order-center/api/v1")
public interface SaleOrderClient {

    @GetMapping("/saleOrder/queryList")
    public List<SaleOrderVo> queryList();

}
