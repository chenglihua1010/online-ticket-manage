package com.ticketManage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ticketManage.api.vo.ManageInforVo;
import com.ticketManage.entity.ManageInfor;
import com.ticketManage.mapper.ManageInforMapper;
import com.ticketManage.api.service.ManagerInforInterface;
import com.ticketManage.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class MangerInforImpl  extends BaseService implements ManagerInforInterface{

        @Autowired
         ManageInforMapper manageInforMapper;

        @Override
        public List<ManageInforVo> findAllManage() {
                List<ManageInfor> manageInforList=manageInforMapper.findAllManage();
                List<ManageInforVo> manageInforVoList=transferObjectIgnoreCaseList(manageInforList,ManageInforVo.class);
                return manageInforVoList;
        }
}