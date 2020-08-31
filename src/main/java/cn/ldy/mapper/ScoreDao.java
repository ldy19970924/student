package cn.ldy.mapper;

import cn.ldy.bean.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author 李东盈
 */
public interface ScoreDao {
    //查询所有成绩
    List<Score> find(Score score);
    //通过id修改成绩
    int update(@Param("id") Integer id,@Param("score") Score score);
    //添加成绩
    int insert(Score score);
    //删除成绩
    int delete(Score score);


}
