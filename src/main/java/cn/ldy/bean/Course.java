package cn.ldy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j;

@Log4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Course {
    private Integer id;
    private String cname;
}
