package cn.ldy.view;

import cn.ldy.bean.Score;
import cn.ldy.service.Service;
import cn.ldy.service.impl.ServiceImpl;

import java.util.Scanner;

/**
 * @author 李东盈
 */
public class DeleteScore {
    private Service service = new ServiceImpl();
    public void deleteScore(){
        Scanner input = new Scanner(System.in);
            System.out.println("1.通过成绩编号删除成绩");
            System.out.println("2.通过学生编号删除成绩");
            System.out.println("3.通过课程编号删除成绩");
            if (!input.hasNextInt()){
                System.out.println("请按正确格式输入！");
            }else {
                int select = input.nextInt();
                switch (select){
                    //通过成绩编号删除成绩
                    case 1:
                    {
                        System.out.print("请输入成绩编号：");
                        String id = input.next();
                        int num = service.deleteSorceyById(Integer.parseInt(id));
                        if (num > 0) {
                            System.out.println("删除成功！");
                        }else {
                            System.out.println("删除失败！");
                        }

                    }
                    break;
                    //通过学生编号删除成绩
                    case 2:{
                        System.out.print("请输入学生编号：");
                        String sid = input.next();
                        int num = service.deleteSorceBySid(Integer.parseInt(sid));
                        if (num > 0) {
                            System.out.println("删除成功！");
                        }else {
                            System.out.println("删除失败！");
                        }
                    }
                    break;
                    //通过课程编号删除成绩
                    case 3:{
                        System.out.println("请输入课程编号：");
                        String cid = input.next();
                        int num = service.deleteSorceByCid(Integer.parseInt(cid));
                        if (num > 0) {
                            System.out.println("删除成功！");
                        }else {
                            System.out.println("删除失败！");
                        }
                    }
                    break;

                    default:
                        System.out.println("没有您的选项！");
                        break;
                }
            }

        }
    }
