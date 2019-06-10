package com.qfedu.innovate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.innovate.entity.TUnit;
import com.qfedu.innovate.mapper.TUnitMapper;
import com.qfedu.innovate.service.TUnitService;
import com.qfedu.innovate.vo.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service
public class TUnitServiceImpl extends ServiceImpl<TUnitMapper, TUnit> implements TUnitService {
   @Autowired
    private TUnitMapper tUnitMapper;
    @Override
    public Bean findAll() {
        return Bean.setOK("OK",tUnitMapper.findAll());
    }

    public Bean findUnit(){
        return Bean.setOK("ok",tUnitMapper.findUnit());
    }
}
