package expert.wearedata.api.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(LocalDateTime.class)
public class LocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {

	@Override
	public LocalDateTime getNullableResult(ResultSet arg0, String arg1) throws SQLException {
		return null;
	}

	@Override
	public LocalDateTime getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		return null;
	}

	@Override
	public LocalDateTime getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		return null;
	}

	@Override
	public void setNonNullParameter(PreparedStatement arg0, int arg1, LocalDateTime arg2, JdbcType arg3)
			throws SQLException {
		
	}


}
