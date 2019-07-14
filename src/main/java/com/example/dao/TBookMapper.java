package com.example.dao;

import com.example.bean.TBook;
import com.example.bean.TBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBookMapper {
    long countByExample(TBookExample example);

    int deleteByExample(TBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBook record);

    int insertSelective(TBook record);

    List<TBook> selectByExampleWithBLOBs(TBookExample example);

    List<TBook> selectByExample(TBookExample example);

    TBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByExampleWithBLOBs(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKeyWithBLOBs(TBook record);

    int updateByPrimaryKey(TBook record);
}