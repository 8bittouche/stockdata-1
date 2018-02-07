package expert.wearedata.api.response;

import java.time.LocalDate;
import java.util.List;

import expert.wearedata.api.model.StockData;
import expert.wearedata.api.model.StockItem;
import lombok.Data;

public @Data class StockDataAPIResponse {
	private StockItem item;
	private List<StockData> stockData;
	private LocalDate dateFrom;
	private LocalDate dateTo;
}
