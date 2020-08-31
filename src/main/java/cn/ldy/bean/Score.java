package cn.ldy.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j;

/**
 * @author 李东盈
 */
@Log4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Score {

    private Integer id;
    private Integer sid;
    private Integer cid;
    private Double score;
    private Student student;
    private Course course;

}
