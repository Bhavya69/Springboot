package com.yourname.dao;

import com.yourname.entity.Student;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by chweety on 9/10/17.
 */
@Repository("mysql")
public class MySqlDaoImp implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Collection<Student> getAllStudents() {
        SELECT column_name (s) FROM table_name
                final String sql = "SELECT id,name,course FROM students";
        List<Student> students = jdbcTemplate.query (sql,new RowMapper<Student>)
        {
            public Student mapRow (ResultSet resultset, int i) throws SQLException{
            Student student =new Student();
            student.setId(resultset.getInt(ColumnLabel:"id'");
            student.setName(resultSet.getString(ColumnLabel:"name");
            student.setCourse(resultset.getString(ColumnLabel:"Course");
            return student;
        }
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void insertStudentToDb(Student student) {

    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

}



