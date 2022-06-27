package com.qiaoqiao.service;

import com.qiaoqiao.pojo.Stu;

public interface StuService {

    Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

    public void saveParent();

    public void saveChildren();
}
