package com.juechuang.dao;

import com.juechuang.emity.Detail;

import java.util.List;

public interface detaildao {
     List<Detail> findById(Integer orderId);
}
