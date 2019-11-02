package shawne.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import shawne.mybatis.simple.model.Country;

import java.util.List;

/**
 * @author zhanjp
 * @DATE 2019/10/28
 */
public interface CountryMapper {

    List<Country> selectAll();

    /**
     * 分页查询+注解方式
     * @param offset
     * @param max
     * @return
     */
    @Select("select * from country limit #{offset}, #{max}")
    List<Country> selectLimit(@Param("offset")Integer offset, @Param("max")Integer max);
}
