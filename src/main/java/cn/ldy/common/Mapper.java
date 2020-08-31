package cn.ldy.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
/**
 * @author 李东盈
 */
public class Mapper {

    //获取session方法
    public SqlSession getSession() throws IOException {
         //获取会话工厂构造器
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //指定配置文件
         SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //构造会话工厂
        SqlSessionFactory sqlsessionFactory = builder.build(is);
        //开启链接会话
        SqlSession session = sqlsessionFactory.openSession();

        return session;
    }
    //关闭session方法
    public void closeSession(SqlSession session){
        session.commit();
        session.close();
    }
}
