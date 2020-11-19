package in.clearclass.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.clearclass.entity.Message;

@Repository
public class MessageDAOImpl implements MessageDAO {
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public void save(Message msg) {
		String table = msg.getAction().name().toLowerCase();
		String sql = "INSERT INTO " + table + " (id, msisdn, timestamp) VALUES (?, ?, ?)";
		jdbc.update(sql, msg.getId(), msg.getMsisdn(), msg.getTimestamp());
	}
}