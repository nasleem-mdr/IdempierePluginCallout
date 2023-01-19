package org.nasleem.callouts;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MyCallout implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		mTab.setValue(MOrder.COLUMNNAME_POReference, "Test");
//		String sql = "SELECT PaymentRule,C_PaymentTerm_ID,"            //  1..2
//				+ "InvoiceRule,DeliveryRule,"                       //  3..4
//				+ "FreightCostRule,DeliveryViaRule, "               //  5..6
//				+ "PaymentRulePO,PO_PaymentTerm_ID "
//				+ "FROM C_BPartner "
//				+ "WHERE C_BPartner_ID=?";		//	#1
//			PreparedStatement pstmt = null;
//			
//			pstmt = DB.prepareStatement(sql, null);
//			int C_BPartner_ID = Env.getContextAsInt(ctx, WindowNo, "C_BPartner_ID");
//			pstmt.setInt(1, C_BPartner_ID);
//			//
//			ResultSet  rs = pstmt.executeQuery();
//			
		BigDecimal ts = new BigDecimal(123);
		mTab.setValue(MOrderLine.COLUMNNAME_QtyEntered , ts);
		return null;
	}

}
