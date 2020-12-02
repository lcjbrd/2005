package com.fh.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.user.entity.TSysUser;
import com.fh.user.service.impl.TSysUserServiceImpl;
import com.fh.utils.CommonsReturn;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(tags="TSysUserController",description = "用户信息管理")
public class TSysUserController {
      @Autowired
      private TSysUserServiceImpl sysUserService;
     @GetMapping
     @ApiOperation("查询用户全部信息")
     public CommonsReturn queryUserList(Page<TSysUser> page){
         sysUserService.page(page);
          return CommonsReturn.success(page);
     }

     @GetMapping("/{name}")
     @ApiOperation("根据用户名进行模糊查询")
     public CommonsReturn queryUserList(@ApiParam(value = "用户性",required = true,type = "String") @PathVariable("name") String name){
         List<TSysUser> userList= sysUserService.list(new QueryWrapper<TSysUser>().like("realName",name));
          return CommonsReturn.success(userList);
     }
     @PostMapping
     @ApiOperation("用户新增")
     public CommonsReturn addUser(TSysUser user){
         return CommonsReturn.success(sysUserService.save(user));
     }
     @PutMapping
     @ApiOperation("用户修改")
     public CommonsReturn updateUser(TSysUser user){
         return CommonsReturn.success(sysUserService.updateById(user));
     }

     @DeleteMapping
     @ApiOperation("用户删除")
     public CommonsReturn deleteUser(TSysUser user){
         return CommonsReturn.success(sysUserService.removeById(user.getId()));
     }
     @GetMapping("batshUserByIds")
     @ApiOperation("用户批量删除")
     public CommonsReturn batshUserByIds(@RequestParam("ids") List<Integer> ids){
         return CommonsReturn.success(sysUserService.removeByIds(ids));
     }

}
