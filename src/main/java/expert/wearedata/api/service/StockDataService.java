package expert.wearedata.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import expert.wearedata.api.dao.StockDataDao;
import expert.wearedata.api.model.StockData;
import expert.wearedata.api.model.StockItem;
import expert.wearedata.api.response.StockDataAPIResponse;


@Service
public class StockDataService {
	
	@Autowired
	private StockDataDao stockDataDao;
	
	/**
	 * @param itemName
	 * @param dateFrom
	 * @param dateTo
	 * @return
	 * @throws Exception
	 */
	public String getStockDataAsJson(String itemName, 
			String strDateFrom, 
			String strDateTo) throws Exception {
		
		StockItem stockItem = new StockItem();
		LocalDate dateFrom = parseDate(strDateFrom);
		LocalDate dateTo = parseDate(strDateTo);
		List<StockData> stockData = stockDataDao.selectList(itemName, dateFrom, dateTo);
		
		StockDataAPIResponse apiResponse = new StockDataAPIResponse();
		apiResponse.setItem(stockItem);
		apiResponse.setDateFrom(dateFrom);
		apiResponse.setDateTo(dateTo);
		apiResponse.setStockData(stockData);
		
		return new Gson().toJson(apiResponse);
	}
	
	/**
	 * @param date
	 * @return
	 */
	public LocalDate parseDate(String date) {
		return LocalDate.now();
	}

}
