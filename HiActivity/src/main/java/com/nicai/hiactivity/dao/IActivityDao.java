package com.nicai.hiactivity.dao;

import com.nicai.hiactivity.entity.Activity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**.
 * 数据访问层接口
 * @author typhoon
 */
@Mapper
public interface IActivityDao {

    /**.
     * 查询所有数据
     * @return 存储所有查询到的信息
     */
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> queryAll();

    /**.
     * 根据id删除单个数据
     * @param id 需要删除的数据id
     * @return 操作影响的行数
     */
    @Delete("delete from tb_activity where id = #{id}")
    int deleteData(Integer id);

    /**.
     * 查询数据通过id
     * @param id 需要查询的数据id
     * @return 存储数据的对象
     */
    @Select("select * from tb_activity where id = #{id}")
    Activity findById(Integer id);

    /**。
     * 更新数据
     * @param activity 需要更新的数据
     * @return 操作影响的行数
     */
    @Update("UPDATE tb_activity SET title = #{title},category = #{category},startTime=#{startTime},endTime = #{endTime}," +
            "remark = #{remark},state = #{state},createdUser = #{createdUser} WHERE id = #{id}")
    int updateData(Activity activity);

    /**。
     * 更新状态
     * @param id 需要更新的数据
     * @return 操作影响的行数
     */
    @Update("UPDATE tb_activity SET state = 0 where id={id}")
    int updateState(Integer id);

    /**.
     * 插入数据
     * @param  activity 需要添加的数据
     * @return 操作影响的行数
     */
    @Insert("insert into tb_activity value(null, #{title},#{category},#{startTime},#{endTime}, #{remark},#{state},now(),#{createdUser} )")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int addData(Activity activity);

}
