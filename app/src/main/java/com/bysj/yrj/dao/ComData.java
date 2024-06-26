package com.bysj.yrj.dao;

import com.bysj.yrj.bean.TeacherInfo;
import com.bysj.yrj.bean.TeacherScore;
import com.bysj.yrj.bean.UserInfo;

/**
 * 存储 程序 运行需要的暂时保存的 数据
 *
 */
public class ComData {
   public static UserInfo utem=null;//登陆成功的用户信息
   static public TeacherInfo item=null;//存储在教师信息维护中 点击列表 显示的信息
   static public TeacherScore stem=null;//存储在教师信息维护中 点击列表 显示的信息
}
