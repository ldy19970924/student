package cn.ldy.service;

import cn.ldy.bean.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author 李东盈
 */
public interface Service {
    //查询所有成绩
    List<Score> findAll();

    //通过成绩编号id查询成绩
    List<Score> findById(Integer id);

    //通过学生编号sid查询成绩
    List<Score> findBySid(Integer sid);

    //通过课程编号cid查询成绩
    List<Score>  findByCid(Integer cid);

    //添加成绩
    int insertSorce(Score score);

    //通过成绩id删除成绩
    int deleteSorceyById(Integer id);

    //通过学号s_id删除成绩
    int deleteSorceBySid(Integer sid);

    //通过课程编号c_id删除成绩
    int deleteSorceByCid(Integer cid);

    //通过id修改成绩
    int update(Integer id,Double sco);
}
