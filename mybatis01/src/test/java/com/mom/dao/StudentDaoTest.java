package com.mom.dao;

import com.mom.pojo.Student;
import com.mom.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentDaoTest {

    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.getStudentList();

        for(Student s:studentList){
            System.out.println(s);
        }

        //关闭sqlSession
        sqlSession.close();
    }
}
