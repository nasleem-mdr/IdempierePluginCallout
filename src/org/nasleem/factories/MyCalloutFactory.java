package org.nasleem.factories;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.nasleem.callouts.MyCallout;
import org.nasleem.model.I_C_Order_tts;
import org.nasleem.model.X_C_Order_tts;

public class MyCalloutFactory implements IColumnCalloutFactory {

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		// TODO Auto-generated method stub
		List<IColumnCallout>list = new ArrayList<IColumnCallout>();
		if(tableName.equalsIgnoreCase(X_C_Order_tts.Table_Name) && columnName.equalsIgnoreCase(X_C_Order_tts.COLUMNNAME_tts))
			list.add(new MyCallout());
		if(tableName.equalsIgnoreCase(MOrderLine.Table_Name) && columnName.equalsIgnoreCase(MOrderLine.COLUMNNAME_Description))
			list.add(new MyCallout());
		
		return list != null ? list.toArray(new IColumnCallout[0]): new IColumnCallout[0];
	}

}
