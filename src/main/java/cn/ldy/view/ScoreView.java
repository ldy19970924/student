package cn.ldy.view;

import cn.ldy.bean.Score;
import cn.ldy.service.Service;
import cn.ldy.service.impl.ServiceImpl;

import java.io.*;

/**
 * @author 李东盈
 */
public class ScoreView {
      private Service service = new ServiceImpl();
      private Score score = new Score();
      public void scoreTest(){
            //Scanner input = new Scanner(System.in);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                  System.out.println("---欢迎进入学生成绩管理系统---");
                  System.out.println("-----请选择您要进行的操作-----");
                  System.out.println("1.添加成绩2.修改成绩3.查询成绩4.删除成绩");
                  String select = null;
                  try {
                        select = input.readLine();
                        switch (select){
                              //1.添加成绩
                              case "1":
                              {     System.out.print("请输入学生编号：");
                                    String sid =input.readLine();
                                    System.out.print("请输入课程编号：");
                                    String cid = input.readLine();
                                    System.out.print("请输入学生成绩：");
                                    String sco = input.readLine();
                                    score.setSid(Integer.valueOf(sid));
                                    score.setCid(Integer.valueOf(cid));
                                    score.setScore(Double.valueOf(sco));
                                    int num = service.insertSorce(score);
                                    if (num > 0) {
                                          System.out.println("添加成功！");
                                    }else {
                                          System.out.println("添加失败！");
                                    }
                              }
                              break;
                              //2.修改成绩
                              case "2":
                              {
                                    System.out.print("请输入成绩编号：");
                                    String id = input.readLine();
                                    System.out.print("请输入成绩：");
                                    String sco = input.readLine();
                                    int num = service.update(Integer.parseInt(id),Double.valueOf(sco));
                                    if (num > 0) {
                                          System.out.println("修改成功！");
                                    }else {
                                          System.out.println("修改失败！");
                                    }
                              }
                              break;
                              //3.查询成绩
                              case "3":
                                    SelectScore find = new SelectScore();
                                    find.selectScore();
                                    break;
                              //4.删除成绩
                              case "4":
                                    DeleteScore delete = new DeleteScore();
                                    delete.deleteScore();
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

      }

