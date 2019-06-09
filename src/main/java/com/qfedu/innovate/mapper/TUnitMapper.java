package com.qfedu.innovate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.innovate.entity.TUnit;
import com.qfedu.innovate.vo.VTUnit;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TUnitMapper extends BaseMapper<TUnit> {
    @Select("select uname from t_unit")
    public List<TUnit> findAll();
    @Select("select s.state,n.fname,n.fputtime,n.fcontent from t_unit u\n" +
            "inner join t_user s\n" +
            "on u.uid =s.uid\n" +
            "inner join t_information n\n" +
            "on n.uid = s.uid")
    public List<VTUnit> findUnit();

}
