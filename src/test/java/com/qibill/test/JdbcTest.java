package com.qibill.test;

import org.apache.log4j.Logger;

public class JdbcTest {

	private static final Logger logger = Logger.getLogger(JdbcTest.class);
/*
	@Test
	public void updateBusiness11() throws SQLException {
		//在做实验的
		String sql = "select distinct cd.SAMPLEID from mwg4_processinstance s " + 
				"LEFT JOIN ground_tp_create_data cd on s.INSTANCEKEY = cd.KEY " + 
				"where NODENAME NOT like '%加样' or NEXTNODE = '原血片复查'";
		Object[] param = {};
		List<Map<String, Object>> listMap = BiosanUtils.getListMap(sql, param);
		logger.info("有-----" + listMap.size() + "---条样品");
		List<Object> list = new ArrayList<>(); 
		for (Map<String, Object> map : listMap) {
			list.add(map.get("SAMPLEID"));
		}
		
		//做完一部分实验的
		sql = "SELECT cd.SAMPLEID ,"
				+ "replace(replace(cd.experimentitem,'labitem_'),'17_a_OHP','OHP') AS EXPERIMENTITEM ,"
				+ "cd.labitem_17_a_ohp__conclusion AS OHP_RESULT,"
				+ "cd.labitem_phe__conclusion AS PHE_RESULT,"
				+ "cd.labitem_tsh__conclusion AS TSH_RESULT,"
				+ "cd.labitem_g6pd__conclusion AS G6PD_RESULT,"
				+ "cd.labitem_gal__conclusion AS GAL_RESULT,"
				+ "cd.labitem_msms__conclusion AS MSMS_RESULT "
				+ "from ground_tp_create_data cd "
				+ "LEFT JOIN GROUND_TB_SAM_DEP_BUSINESS sdb on cd.SAMPLEID = sdb.SAMPLEID "
				+ "where sdb.BUSINESS = 8 ";
		
		List<Map<String, Object>> listMap1 = BiosanUtils.getListMap(sql, param);
		
		logger.info("有-----" + listMap.size() + "---条样品");
		
		for (Map<String, Object> map : listMap1) {
			String string = (String) map.get("EXPERIMENTITEM");
			logger.debug("样品要做的项目======" + string);
			String[] split = string.split(",");
			// 是否有完成实验
			boolean flag = false;

			for (String experimentitem : split) {
				String result = (String) map.get(experimentitem + "_RESULT");
				if (result != null ) {
					flag = true;
					logger.info("样品sampleid========" + map.get("SAMPLEID"));
					logger.info("样品要做的项目======" + string);
					logger.info(experimentitem + "已经有结果");
					break;
				}
			}
			
			// 是否有完成实验
			if (flag) {
				logger.debug("样品ID------" + map.get("SAMPLEID") + "完成全部实验");
				list.add(map.get("SAMPLEID"));
			}
			
		}
		
		//修改流程状态
		sql = "UPDATE GROUND_TB_SAM_DEP_BUSINESS SET BUSINESS = 11 where sampleid = ?";
		Object[][] params = new Object[list.size()][];
		for (int i = 0; i < params.length; i++) {
			Object[] objects = {list.get(i)};
			params[i] = objects;
		}
		int[] batch = BiosanUtils.executeUpdateBatch(sql, params);
		logger.info("数据库修改了=========" + batch.length + "=========条信息");
	}

	@Test
	public void updateBusiness9() throws SQLException {
		String sql = "SELECT cd.SAMPLEID ,"
				+ "replace(replace(cd.experimentitem,'labitem_'),'17_a_OHP','OHP') AS EXPERIMENTITEM ,"
				+ "cd.labitem_17_a_ohp__conclusion AS OHP_RESULT,"
				+ "cd.labitem_phe__conclusion AS PHE_RESULT,"
				+ "cd.labitem_tsh__conclusion AS TSH_RESULT,"
				+ "cd.labitem_g6pd__conclusion AS G6PD_RESULT,"
				+ "cd.labitem_gal__conclusion AS GAL_RESULT,"
				+ "cd.labitem_msms__conclusion AS MSMS_RESULT "
				+ "from ground_tp_create_data cd "
				+ "LEFT JOIN GROUND_TB_SAM_DEP_BUSINESS sdb on cd.SAMPLEID = sdb.SAMPLEID "
				+ "where sdb.BUSINESS = 8 or sdb.BUSINESS = 11";
		Object[] param = {};
		List<Map<String, Object>> listMap = BiosanUtils.getListMap(sql, param);
		logger.info("有-----" + listMap.size() + "---条样品");
		List<Object> list = new ArrayList<>(); 
		for (Map<String, Object> map : listMap) {
			String string = (String) map.get("EXPERIMENTITEM");
			logger.debug("样品要做的项目======" + string);
			String[] split = string.split(",");
			// 是否完成全部实验
			boolean flag = true;

			for (String experimentitem : split) {
				String result = (String) map.get(experimentitem + "_RESULT");
				if (result == null || result.equals("原血片复查")) {
					flag = false;
					logger.info("样品sampleid========" + map.get("SAMPLEID"));
					logger.info("样品要做的项目======" + string);
					logger.info(experimentitem + "没有结果");
					break;
				}
			}
			
			// 是否完成全部实验
			if (flag) {
				logger.debug("样品ID------" + map.get("SAMPLEID") + "完成全部实验");
				list.add(map.get("SAMPLEID"));
			}
			
		}
		logger.info("有-----" + list.size() + "---条已完成实验样品");
		
		sql = "UPDATE GROUND_TB_SAM_DEP_BUSINESS SET BUSINESS = 9 where sampleid = ?";
		Object[][] params = new Object[list.size()][];
		for (int i = 0; i < params.length; i++) {
			Object[] objects = {list.get(i)};
			params[i] = objects;
		}
		int[] batch = BiosanUtils.executeUpdateBatch(sql, params);
		logger.info("数据库修改了=========" + batch.length + "=========条信息");

	}
	
	@Test
	public void inspectBusiness9() throws SQLException {
		String sql = "SELECT cd.SAMPLEID ,"
				+ "replace(replace(cd.experimentitem,'labitem_'),'17_a_OHP','OHP') AS EXPERIMENTITEM ,"
				+ "cd.labitem_17_a_ohp__conclusion AS OHP_RESULT,"
				+ "cd.labitem_phe__conclusion AS PHE_RESULT,"
				+ "cd.labitem_tsh__conclusion AS TSH_RESULT,"
				+ "cd.labitem_g6pd__conclusion AS G6PD_RESULT,"
				+ "cd.labitem_gal__conclusion AS GAL_RESULT,"
				+ "cd.labitem_msms__conclusion AS MSMS_RESULT "
				+ "from ground_tp_create_data cd "
				+ "LEFT JOIN GROUND_TB_SAM_DEP_BUSINESS sdb on cd.SAMPLEID = sdb.SAMPLEID "
				+ "where sdb.BUSINESS = 9 ";
		Object[] param = {};
		List<Map<String, Object>> listMap = BiosanUtils.getListMap(sql, param);
		logger.info("有-----" + listMap.size() + "---条样品");
		List<Object> list = new ArrayList<>(); 
		for (Map<String, Object> map : listMap) {
			String string = (String) map.get("EXPERIMENTITEM");
			logger.debug("样品要做的项目======" + string);
			String[] split = string.split(",");
			// 是否完成全部实验
			boolean flag = true;

			for (String experimentitem : split) {
				String result = (String) map.get(experimentitem + "_RESULT");
				logger.debug(experimentitem + "==========" + result);
				if (result == null || result.equals("原血片复查")) {
					flag = false;
					logger.info("样品sampleid========" + map.get("SAMPLEID"));
					logger.info("样品要做的项目======" + string);
					logger.info(experimentitem + "没有结果");
					break;
				}
			}
			
			// 是否完成全部实验
			if (!flag) {
				logger.debug("样品ID------" + map.get("SAMPLEID") + "没有完成全部实验");
				list.add(map.get("SAMPLEID"));
			}
		}
		
		logger.info("有-----" + list.size() + "---条已完成实验样品");
		
		sql = "UPDATE GROUND_TB_SAM_DEP_BUSINESS SET BUSINESS = 11 where sampleid = ?";
		Object[][] params = new Object[list.size()][];
		for (int i = 0; i < params.length; i++) {
			Object[] objects = {list.get(i)};
			params[i] = objects;
		}
		int[] batch = BiosanUtils.executeUpdateBatch(sql, params);
		logger.info("数据库修改了=========" + batch.length + "=========条信息");

	}
*/
}
