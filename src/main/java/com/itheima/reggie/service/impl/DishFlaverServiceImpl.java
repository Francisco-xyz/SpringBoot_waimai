package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.DishFlavor;
import com.itheima.reggie.mapper.DishFlaverMapper;
import com.itheima.reggie.service.DishFlaverService;
import org.springframework.stereotype.Service;

@Service
public class DishFlaverServiceImpl extends ServiceImpl<DishFlaverMapper, DishFlavor> implements DishFlaverService {
}
