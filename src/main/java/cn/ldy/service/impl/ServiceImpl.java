package cn.ldy.service.impl;

import cn.ldy.bean.Score;
import cn.ldy.mapper.ScoreDao;
import cn.ldy.common.Mapper;
import cn.ldy.service.Service;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @author 李东盈
 */
public class ServiceImpl implements Service{
    private Mapper map = new Mapper();
    private Score score = new Score();

    @Override
    public List<Score> findAll() {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            List<Score> list = mapper.find(null);
            //关流
            map.closeSession(session);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Score> findById(Integer id) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            List<Score> list = mapper.find(score.setId(id));
            //关流
            map.closeSession(session);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Score> findBySid(Integer sid) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            List<Score> list = mapper.find(score.setSid(sid));
            //关流
            map.closeSession(session);
            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Score> findByCid(Integer cid) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            List<Score> list = mapper.find(score.setCid(cid));
            //关流
            map.closeSession(session);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insertSorce(Score score) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
           int num =  mapper.insert(score);
           //关流
           map.closeSession(session);
           return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteSorceyById(Integer id) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            int num =  mapper.delete(score.setId(id));
            //关流
            map.closeSession(session);
            return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteSorceBySid(Integer sid) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);
            int num = mapper.delete(score.setSid(sid));
            //关流
            map.closeSession(session);
            return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteSorceByCid(Integer cid) {
        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);

            int num =  mapper.delete(score.setCid(cid));
            //关流
            map.closeSession(session);
            return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Integer id,Double sco) {

        try {
            SqlSession session = map.getSession();
            //获取类的对象
            ScoreDao mapper = session.getMapper(ScoreDao.class);

            int num = mapper.update(id,score.setScore(sco));
            //关流
            map.closeSession(session);
            return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
