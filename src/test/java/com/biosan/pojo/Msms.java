package com.biosan.pojo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum Msms {
	ALA("ALA", 180.5, 663.87),
	ARG("ARG", 9.37, 24.13),
	CIT("CIT", 7.26, 32.06),
	GLY("GLY", 275.32, 1000.0),
	INT_ALA("INT ALA", 173900.0, 514200.0),
	INT_ALA_IS("INT ALA IS", 118000.0, 180600.0),
	INT_ARG("INT ARG", 32360.0, 83700.0),
	INT_ARG_IS("INT ARG IS", 351900.0, 596700.0),
	INT_CIT("INT CIT", 3239.0, 12140.0),
	INT_CIT_IS("INT CIT IS", 32500.0, 66950.0),
	INT_GLY("INT GLY", 39710.0, 96890.0),
	INT_GLY_IS("INT GLY IS", 96520.0, 157900.0),
	INT_LEU_IS("INT LEU IS", 647300.0, 996000.0),
	INT_LEU_ILE_PRO_OH("INT LEU+ILE+PRO-OH", 523900.0, 1135000.0),
	INT_MET("INT MET", 8991.0, 33720.0),
	INT_MET_IS("INT MET IS", 118400.0, 190000.0),
	INT_ORN("INT ORN", 96670.0, 232600.0),
	INT_ORN_IS("INT ORN IS", 108000.0, 208200.0),
	INT_PHE("INT PHE", 136300.0, 330800.0),
	INT_PHE_IS("INT PHE IS", 568200.0, 881000.0),
	INT_PRO("INT PRO", 205000.0, 498400.0),
	INT_PRO_IS("INT PRO IS", 211700.0, 335900.0),
	INT_SA("INT SA", 742.0, 1622.0),
	INT_SA_IS("INT SA IS", 306400.0, 450300.0),
	INT_TYR("INT TYR", 37780.0, 214500.0),
	INT_TYR_IS("INT TYR IS", 107600.0, 177400.0),
	INT_VAL("INT VAL", 290100.0, 646900.0),
	INT_VAL_IS("INT VAL IS", 497900.0, 766200.0),
	LEU_ILE_PRO_OH("LEU+ILE+PRO-OH", 89.45, 223.99),
	MET("MET", 9.28, 41.1),
	ORN("ORN", 75.84, 219.21),
	PHE("PHE", 28.28, 81.07),
	PRO("PRO", 98.5, 288.63),
	SA("SA", 0.33, 0.68),
	TYR("TYR", 45.0, 310.79),
	VAL("VAL", 62.39, 169.06),
	C0("C0", 8.86, 34.68),
	C2("C2", 8.42, 33.41),
	C3("C3", 0.72, 10.0),
	C3DC_C4OH("C3DC+C4OH", 0.03, 0.24),
	C4("C4", 0.08, 0.4),
	C4DC_C5OH("C4DC+C5OH", 0.08, 0.29),
	C5("C5", 0.05, 0.21),
	C5_1("C5:1", 0.0, 0.01),
	C5DC_C6OH("C5DC+C6OH", 0.04, 0.18),
	C6("C6", 0.01, 0.07),
	C6DC("C6DC", 0.05, 0.19),
	C8("C8", 0.02, 0.12),
	C8_1("C8:1", 0.05, 0.25),
	INT_C0("INT C0", 28020.0, 106400.0),
	INT_C0_IS("INT C0 IS", 113400.0, 201000.0),
	INT_C2("INT C2", 227400.0, 942900.0),
	INT_C2_IS("INT C2 IS", 113600.0, 201300.0),
	INT_C3("INT C3", 29620.0, 199800.0),
	INT_C3_IS("INT C3 IS", 103400.0, 175100.0),
	INT_C3DC_C4OH("INT C3DC+C4OH", 1575.0, 12210.0),
	INT_C4("INT C4", 4497.0, 21340.0),
	INT_C4_IS("INT C4 IS", 107200.0, 174400.0),
	INT_C4DC_C5OH("INT C4DC+C5OH", 5177.0, 21370.0),
	INT_C5("INT C5", 3451.0, 16200.0),
	INT_C5_IS("INT C5 IS", 122100.0, 199500.0),
	INT_C5_1("INT C5:1", 100.0, 925.0),
	INT_C5DC_IS("INT C5DC IS", 32560.0, 61940.0),
	INT_C5DC_C6OH("INT C5DC+C6OH", 861.0, 3216.0),
	INT_C6("INT C6", 1121.0, 5043.0),
	INT_C6_IS("INT C6 IS", 138200.0, 224900.0),
	INT_C6DC("INT C6DC", 943.0, 3576.0),
	INT_C8("INT C8", 1501.0, 10900.0),
	INT_C8_IS("INT C8 IS", 186800.0, 270000.0),
	INT_C8_1("INT C8:1", 4845.0, 22790.0),
	C10("C10", 0.02, 0.16),
	C10_1("C10:1", 0.02, 0.16),
	C10_2("C10:2", 0.0, 0.03),
	C12("C12", 0.02, 0.27),
	C12_1("C12:1", 0.02, 0.18),
	C14("C14", 0.07, 0.42),
	C14_1("C14:1", 0.03, 0.25),
	C14_2("C14:2", 0.01, 0.03),
	C14OH("C14OH", 0.0, 0.03),
	C16("C16", 1.06, 5.93),
	C16_1("C16:1", 0.05, 0.37),
	C16_1OH("C16:1OH", 0.01, 0.06),
	C16OH("C16OH", 0.01, 0.03),
	C18("C18", 0.27, 1.85),
	C18_1("C18:1", 0.63, 2.29),
	C18_1OH("C18:1OH", 0.01, 0.03),
	C18_2("C18:2", 0.05, 0.42),
	C18OH("C18OH", 0.0, 0.02),
	INT_C10("INT C10", 2504.0, 21000.0),
	INT_C10_IS("INT C10 IS", 281400.0, 369300.0),
	INT_C10_1("INT C10:1", 2823.0, 19920.0),
	INT_C10_2("INT C10:2", 384.0, 3900.0),
	INT_C12("INT C12", 4198.0, 42110.0),
	INT_C12_IS("INT C12 IS", 663800.0, 868100.0),
	INT_C12_1("INT C12:1", 2773.0, 28240.0),
	INT_C14("INT C14", 14160.0, 83700.0),
	INT_C14_IS("INT C14 IS", 856700.0, 1097000.0),
	INT_C14_1("INT C14:1", 5493.0, 49760.0),
	INT_C14_2("INT C14:2", 1241.0, 5850.0),
	INT_C14OH("INT C14OH", 578.0, 5671.0),
	INT_C16("INT C16", 224700.0, 1228000.0),
	INT_C16_IS("INT C16 IS", 892800.0, 1146000.0),
	INT_C16_1("INT C16:1", 11800.0, 73030.0),
	INT_C16_1OH("INT C16:1OH", 2697.0, 13060.0),
	INT_C16OH("INT C16OH", 1441.0, 6909.0),
	INT_C18("INT C18", 64560.0, 442500.0),
	INT_C18_IS("INT C18 IS", 1055000.0, 1383000.0),
	INT_C18_1("INT C18:1", 159900.0, 548300.0),
	INT_C18_1OH("INT C18:1OH", 2044.0, 7658.0),
	INT_C18_2("INT C18:2", 13770.0, 99910.0),
	INT_C18OH("INT C18OH", 834.0, 4017.0);
	

	private String name;
	private Double min;
	private Double max;

	private Msms(String name, Double min, Double max) {
		this.name = name;
		this.min = min;
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public Double getMin() {
		return min;
	}

	public Double getMax() {
		return max;
	}

	public static Msms getMsmsByName(String name) {
		for (Msms m : Msms.values()) {
			if (m.getName() == name) {
				return m;
			}
		}
		return null;
	}

	public static Double getMinByName(String name) {
		for (Msms m : Msms.values()) {
			if (m.getName() == name) {
				return m.getMin();
			}
		}
		return 0D;
	}

	public static Double getMaxByName(String name) {
		for (Msms m : Msms.values()) {
			if (m.getName() == name) {
				return m.getMax();
			}
		}
		return 0D;
	}

	public static Map<String, Double> creatMsms() {
		Map<String, Double> map = new HashMap<>();
        for (Msms m : Msms.values()) {
        	Random random = new Random();
        	double d = m.getMin() + random.nextDouble() * (m.getMax() - m.getMin());
        	BigDecimal b = new BigDecimal(d);
        	d = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();     
        	map.put(m.getName(), d);
        }
        return map;
    }
}
