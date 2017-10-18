package com.asiainfo.core.mapper;

import com.asiainfo.core.model.OrMerchant;

public interface OrMerchantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrMerchant record);

    int insertSelective(OrMerchant record);

    OrMerchant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrMerchant record);

    int updateByPrimaryKey(OrMerchant record);
}