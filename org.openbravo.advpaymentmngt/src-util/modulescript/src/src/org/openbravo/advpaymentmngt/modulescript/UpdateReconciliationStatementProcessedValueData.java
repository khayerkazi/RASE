//Sqlc generated V1.O00-1
package org.openbravo.advpaymentmngt.modulescript;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class UpdateReconciliationStatementProcessedValueData implements FieldProvider {
static Logger log4j = Logger.getLogger(UpdateReconciliationStatementProcessedValueData.class);
  private String InitRecordNumber="0";
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static UpdateReconciliationStatementProcessedValueData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select((String)null, connectionProvider, 0, 0);
  }

  public static UpdateReconciliationStatementProcessedValueData[] select(String queryType, ConnectionProvider connectionProvider)    throws ServletException {
    return select(queryType, connectionProvider, 0, 0);
  }

  public static UpdateReconciliationStatementProcessedValueData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    return select((String)null, connectionProvider);
  }

  public static UpdateReconciliationStatementProcessedValueData[] select(String queryType, ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select 1 as name from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      String profile = queryType;
      if (profile == null || profile.isEmpty()) {
        profile = SessionInfo.getQueryProfile();
      }
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, profile);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        UpdateReconciliationStatementProcessedValueData objectUpdateReconciliationStatementProcessedValueData = new UpdateReconciliationStatementProcessedValueData();
        objectUpdateReconciliationStatementProcessedValueData.name = UtilSql.getValue(result, "name");
        objectUpdateReconciliationStatementProcessedValueData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUpdateReconciliationStatementProcessedValueData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    UpdateReconciliationStatementProcessedValueData objectUpdateReconciliationStatementProcessedValueData[] = new UpdateReconciliationStatementProcessedValueData[vector.size()];
    vector.copyInto(objectUpdateReconciliationStatementProcessedValueData);
    return(objectUpdateReconciliationStatementProcessedValueData);
  }

  public static int updateFinancialAccount(ConnectionProvider connectionProvider)    throws ServletException {
    return updateFinancialAccount((String)null, connectionProvider);
  }

  public static int updateFinancialAccount(String queryType, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_FINANCIAL_ACCOUNT SET EM_APRM_MatchTrans_Force = em_aprm_matchtransactions";

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      String profile = queryType;
      if (profile == null || profile.isEmpty()) {
        profile = SessionInfo.getQueryProfile();
      }
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, profile);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int updateStatement(ConnectionProvider connectionProvider)    throws ServletException {
    return updateStatement((String)null, connectionProvider);
  }

  public static int updateStatement(String queryType, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_BANKSTATEMENT SET em_aprm_process_bs_force = em_aprm_process_bs ";

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      String profile = queryType;
      if (profile == null || profile.isEmpty()) {
        profile = SessionInfo.getQueryProfile();
      }
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, profile);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int updateReconciliation(ConnectionProvider connectionProvider)    throws ServletException {
    return updateReconciliation((String)null, connectionProvider);
  }

  public static int updateReconciliation(String queryType, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_BANKSTATEMENT SET em_aprm_process_rec_force = em_aprm_process_rec ";

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      String profile = queryType;
      if (profile == null || profile.isEmpty()) {
        profile = SessionInfo.getQueryProfile();
      }
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, profile);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }
}
