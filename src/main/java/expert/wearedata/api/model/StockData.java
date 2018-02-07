package expert.wearedata.api.model;

import java.time.LocalDate;

import lombok.Data;

public @Data class StockData {
	
	private int dataId;
	private int symbolId;
	private int itemId;
	private int value;
	private DataType dataType;
	private LocalDate date;

}
