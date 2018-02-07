package expert.wearedata.api.model;

import lombok.Data;

public @Data class StockItem {
	
	private int itemId;
	private int itemName;
	private DataType dataType;
	private String kind;
}
