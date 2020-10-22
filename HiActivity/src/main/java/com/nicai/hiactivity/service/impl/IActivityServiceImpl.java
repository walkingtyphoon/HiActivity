package com.nicai.hiactivity.service.impl;

import com.nicai.hiactivity.dao.IActivityDao;
import com.nicai.hiactivity.entity.Activity;
import com.nicai.hiactivity.service.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**.
 * 活动业务层实现类
 * @author typhoon
 */
@Service
public class IActivityServiceImpl implements IActivityService {

    /**.
     * 自动装配数据访问层接口
     */
    @Autowired
    private IActivityDao iActivityDao;

    /**
     * .
     * 查询所有活动信息
     *
     * @return 存储所有活动信息的实体类集合
     */
    @Override
    public List<Activity> queryAllActivity() {
        return iActivityDao.queryAll();
    }

    /**
     * .
     * 根据id删除单个数据
     *
     * @param id 需要删除的数据id
     * @return 操作影响的行数
     */
    @Override
    public int deleteActivity(Integer id) {
        return iActivityDao.deleteData(id);
    }

    /**
     * .
     * 查询数据通过id
     *
     * @param id 需要查询的数据id
     * @return 存储数据的对象
     */
    @Override
    public Activity findById(Integer id) {
        return iActivityDao.findById(id);
    }

    /**
     * 。
     * 更新数据
     *
     * @param activity 需要更新的数据
     * @return 操作影响的行数
     */
    @Override
    public int updateActivity(Activity activity) {
        return iActivityDao.updateData(activity);
    }

    /**
     * 。
     * 添加数据
     *
     * @param activity 需要添加的数据
     * @return 操作影响的行数
     */
    @Override
    public int addActivity(Activity activity) {
        return iActivityDao.addData(activity);
    }
}
