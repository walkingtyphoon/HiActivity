package com.nicai.hiactivity.service;



import com.nicai.hiactivity.entity.Activity;

import java.util.List;

/**.
 * 活动业务层接口
 * @author typhoon
 */
public interface IActivityService {

    /**.
     * 查询所有活动信息
     * @return 存储所有活动信息的实体类集合
     */
    List<Activity> queryAllActivity();


    /**.
     * 根据id删除单个数据
     * @param id 需要删除的数据id
     * @return 操作影响的行数
     */
    int deleteActivity(Integer id);

    /**.
     * 查询数据通过id
     * @param id 需要查询的数据id
     * @return 存储数据的对象
     */
    Activity findById(Integer id);

    /**。
     * 更新数据
     * @param activity 需要更新的数据
     * @return 操作影响的行数
     */
    int updateActivity(Activity activity);



    /**。
     * 添加数据
     * @param activity 需要添加的数据
     * @return 操作影响的行数
     */
    int addActivity(Activity activity);



}
