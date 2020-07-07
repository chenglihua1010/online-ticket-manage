package com.ticketManage.api.service;

import com.ticketManage.api.vo.ManageInforVo;

import java.util.List;

public interface ManagerInforInterface {
         List<ManageInforVo> findAllManage();
}