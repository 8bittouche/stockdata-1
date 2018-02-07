package expert.wearedata.api.dao;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import expert.wearedata.api.model.StockData;

@Repository
public class StockDataDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	private String mapperPrefix = "";
	
	public List<StockData> selectList(String itemName,
			LocalDate dateFrom,
			LocalDate dateTo) throws Exception {
		
		List<StockData> result = sqlSession.selectList(mapperPrefix + ".selectList");
		return result;
	}

}
