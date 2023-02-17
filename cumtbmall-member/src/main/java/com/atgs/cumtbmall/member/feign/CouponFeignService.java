package com.atgs.cumtbmall.member.feign;

import com.atgs.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//表示这个接口是一个远程客户端
@FeignClient("cumtbmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
