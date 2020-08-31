package cn.ldy.view;

import cn.ldy.bean.Score;
import cn.ldy.service.Service;
import cn.ldy.service.impl.ServiceImpl;

import java.io.*;
import java.util.List;

/**
 * @author 李东盈
 */
public class SelectScore {
    private Service service = new ServiceImpl();
    public void selectScore(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.查询所有的成绩记录");
            System.out.println("2.通过成绩编号查询成绩");
            System.out.println("3.通过学生编号查询成绩");
            System.out.println("4.通过课程编号查询成绩");
            String select = null;
            try {
                select = input.readLine();
                switch (select){
                    //查询所有的成绩记录
                    case "1":
                    {
                       List<Score> lists = service.findAll();
                        for(Score list: lists) {
                            System.out.println("成绩编号\t学生姓名\t课程名称\t成绩");
                            System.out.println(list.getId()+"\t\t"+list.getStudent().getName()+"\t\t"+list.getCourse().getCname()+"\t\t"+list.getScore());
                        }

                    }
                    break;
                    //通过成绩编号查询成绩
                    case "2":
                    {
                        System.out.print("请输入成绩编号：");
                        String id = input.readLine();
                       // service.findById(Integer.parseInt(id)).forEach(System.out::println);
                        List<Score> lists = service.findById(Integer.parseInt(id));
                        for(Score list: lists) {
                            System.out.println("成绩编号\t学生姓名\t课程名称\t成绩");
                            System.out.println(list.getId()+"\t\t"+list.getStudent().getName()+"\t\t"+list.getCourse().getCname()+"\t\t"+list.getScore());
                        }
                    }
                    break;
                    //通过学生编号查询成绩
                    case "3":{
                        System.out.print("请输入学生编号：");
                        String sid = input.readLine();
                       // service.findBySid(Integer.parseInt(sid)).forEach(System.out::println);
                        List<Score> lists = service.findBySid(Integer.parseInt(sid));
                        for(Score list: lists) {
                            System.out.println("成绩编号\t学生姓名\t课程名称\t成绩");
                            System.out.println(list.getId()+"\t\t"+list.getStudent().getName()+"\t\t"+list.getCourse().getCname()+"\t\t"+list.getScore());
                        }
                    }
                    break;
                    //通过课程编号查询成绩
                    case "4":{
                        System.out.print("请输入课程编号：");
                        String cid = input.readLine();
                        //service.findByCid(Integer.parseInt(cid)).forEach(System.out::println);
                        List<Score> lists = service.findByCid(Integer.parseInt(cid));
                        for(Score list: lists) {
                            System.out.println("成绩编号\t学生姓名\t课程名称\t成绩");
                            System.out.println(list.getId()+"\t\t"+list.getStudent().getName()+"\t\t"+list.getCourse().getCname()+"\t\t"+list.getScore());
                        }
                    }
                    break;
                    default:
                        System.out.println("没有您的选项！");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            }

        }



