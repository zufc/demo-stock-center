package com.zfc.study.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfc.study.stock.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> queryList();

    int insertList(@Param("list") List<User> list);

}
