package expert.wearedata.api.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import expert.wearedata.api.service.StockDataService;


@Controller
@RequestMapping("/v1/stock")
public class StockDataController {
	
	public static Logger logger = Logger.getLogger(StockDataController.class);
	
	@Autowired
	private StockDataService stockDataService;
	
	@GetMapping("/{itemName}")
	@ResponseBody
	public ResponseEntity<String> list(@PathVariable String itemName, 
			@RequestParam("dateFrom") String dateFrom,
			@RequestParam("dateTo") String dateTo) throws Exception {
		
		return new ResponseEntity<String>(
				stockDataService.getStockDataAsJson(itemName, dateFrom, dateTo), 
				HttpStatus.OK);
	}
	
}
