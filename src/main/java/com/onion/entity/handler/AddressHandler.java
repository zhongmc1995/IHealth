package com.onion.entity.handler;

import com.onion.entity.Address;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lhd on 2017/5/5.
 */
public class AddressHandler implements TypeHandler<Address>{

    public void setParameter(PreparedStatement preparedStatement, int i, Address address, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,address.getStringAsPhone());
    }

    public Address getResult(ResultSet resultSet, String s) throws SQLException {
        return new Address(resultSet.getString(s));
    }

    public Address getResult(ResultSet resultSet, int i) throws SQLException {
        return new Address(resultSet.getString(i));
    }

    public Address getResult(CallableStatement callableStatement, int i) throws SQLException {
        return new Address(callableStatement.getString(i));
    }
}
