package com.spring.carwash.dao;

import com.spring.carwash.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional(rollbackFor = Exception.class)
public class CarWasherRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Car> getCars() {
        return jdbcTemplate.query("select * from car where id=1", (rs, rowNum) -> {
            Car c = new Car();

            c.setId(rs.getInt(1));
            c.setColor((rs.getString(1)));
            c.setModel((rs.getString(2)));
            c.setYear((rs.getInt(3)));
            return c;
        });
    }
}
