package com.qfedu.innovate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.innovate.entity.TUnit;
import com.qfedu.innovate.vo.Bean;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TUnitService extends IService<TUnit> {
    Bean findAll();

    Bean findUnit();

}
