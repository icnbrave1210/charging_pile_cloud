package com.suda.platform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.suda.platform.VO.chargeStation.ChargingRecordVO;
import com.suda.platform.entity.ChargingRecord;
import com.util.pageinfoutil.PageUtil;

/**
 * <p>
 * 充电记录 服务类
 * </p>
 *
 * @author kongling
 * @since 2019-05-30
 */
public interface IChargingRecordService extends IService<ChargingRecord> {

    /**
     * 查询用户充电记录
     * @param vo
     * @param pageUtil
     * @return
     */
    PageInfo<ChargingRecordVO> selectAllChargingRecords(ChargingRecordVO vo, PageUtil pageUtil);
}