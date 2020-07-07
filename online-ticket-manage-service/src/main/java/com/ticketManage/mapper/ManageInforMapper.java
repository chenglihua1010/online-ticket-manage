package com.ticketManage.mapper;

import com.ticketManage.entity.ManageInfor;
import com.ticketManage.utils.MyMapper;

import java.util.List;

public interface ManageInforMapper extends MyMapper<ManageInfor> {
        public List<ManageInfor> findAllBusDrug();
}