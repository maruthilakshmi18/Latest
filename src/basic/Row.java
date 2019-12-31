package basic;

import java.util.ArrayList;
import java.util.List;

public class Row {
	
	List<Cell> cellList = new ArrayList<>();

	public List<Cell> getCellList() {
		return cellList;
	}

	public void setCellList(List<Cell> cellList) {
		this.cellList = cellList;
	}
	

}
