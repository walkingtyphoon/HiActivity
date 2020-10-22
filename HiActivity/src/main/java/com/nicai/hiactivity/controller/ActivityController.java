package com.nicai.hiactivity.controller;


import com.nicai.hiactivity.entity.Activity;
import com.nicai.hiactivity.service.IActivityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * .
 * 配置业务控制器
 *
 * @author typhoon
 */
@Controller
@RequestMapping("/activity/")
public class ActivityController {

  /**
   * .
   * 自动装配服务层对象
   */
  @Autowired
  private IActivityService iActivityService;

  /**
   * .
   * 跳转展示视图
   */
  @RequestMapping("queryUI")
  public String doActivityUi() {
    return "show";
  }


  /**
   * .
   * 查询所有数据
   *
   * @return 前往输出页面
   */
  @RequestMapping("queryAll")
  @ResponseBody
  public List<Activity> queryAllActivity() {
    // 查询数据
    return iActivityService.queryAllActivity();
  }


  /**
   * .
   * 根据id删除信息
   *
   * @param id 需要删除的id
   * @return 删除后跳转到展示页面
   */
  @RequestMapping("deleteById")
  public String deleteActivityById(Integer id) {
    // 根据id执行删除
    int i = iActivityService.deleteActivity(id);
    // 根据信息跳转操作
    return i > 0 ? "redirect:/activity/queryUI" : "error";
  }

  /**
   * .
   * 根据id查询信息
   *
   * @param id 需要删除的id
   * @return 删除后跳转到展示页面
   */
  @RequestMapping("findById")
  @ResponseBody
  public Activity findActivityById(Integer id) {
    // 根据id执行删除
    return iActivityService.findById(id);
  }


  /**
   * .
   * 根据id查询信息
   *
   * @param activity 需要更新的数据
   * @return 删除后跳转到展示页面
   */
  @RequestMapping("update")
  @ResponseBody
  public String updateActivity(Activity activity) {
    // 根据id执行删除
    int i = iActivityService.updateActivity(activity);
    // 根据信息跳转操作
    return "update ok";
  }

  @RequestMapping("doSave")
  @ResponseBody
  public String doSaveObject(Activity activity) {
    iActivityService.addActivity(activity);
    return "save ok";
  }
}
