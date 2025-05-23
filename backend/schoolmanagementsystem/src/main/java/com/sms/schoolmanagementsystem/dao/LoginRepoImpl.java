package com.sms.schoolmanagementsystem.dao;
import com.sms.schoolmanagementsystemsystem.util.Utility;

@Repository
public class LoginRepoImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int loginQuery() throws SQLException, EmptyDataException{
        int count=jdbcTemplate.queryForList(util.Utility,);
        return count;
    }

}
