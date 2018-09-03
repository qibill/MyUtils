package com.qibill.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.wltea.expression.ExpressionEvaluator;
import org.wltea.expression.PreparedExpression;
import org.wltea.expression.datameta.Variable;

import com.biosan.pojo.Msmspojo;

public class ExpressionTest {

	
	public static List<Msmspojo> test() {
		String expression = ("C3>4.5&&C3/C2>0.2 && !(C3/C2>0.32) && !(C3>6.5) && !(C3/C0>0.4) && ! (C3/MET>0.55)");
		List<Msmspojo> msmspojolists = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			boolean flag = true; 
			while (flag) {
				List<Variable> variables = new ArrayList<Variable>();
				Msmspojo creatpojo = Msmspojo.creatpojo();
				for (String key : creatpojo.getMap().keySet()) {
					variables.add(Variable.createVariable(key, creatpojo.getMap().get(key)));
				}
				//预编译表达式
				PreparedExpression pe = ExpressionEvaluator.preparedCompile(expression, variables);
				//执行表达式
				Object result = pe.execute();
				flag = !((boolean) result);
				if (!flag) {
					msmspojolists.add(creatpojo);
				}
			}		
		}
		System.out.println(msmspojolists.toString());
		return msmspojolists;
	}
	
	@Test
	public void test1() {
		String expression = ("3>980  || 3 <10 && ! (3 > 5)  || 1>0");
		Object evaluate = ExpressionEvaluator.evaluate(expression);

		System.out.println(evaluate.toString());
	}
}
