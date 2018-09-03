package com.qibill.spring;

import java.util.List;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.qibill.utils.DESUtil;

/**
 * 对properties文件里的一些加密属性解密，在{@link #setEncryptPropNames(List) "encryptPropNames"}放入
 * 需解密的属性。
 * 
 * <pre>
 * <p>applicationContext.xml案例：
 * {@code
 * <bean class="com.biosan.utils.EncryptPropertyPlaceholderConfigurer">
 * 	<property name="encryptPropNames">
 * 		<list>
 * 			<value>jdbc.password</value>
 * 		</list>
 * 	</property>
 * 	<property name="locations">
 * 		<list>
 * 			<value>classpath:jdbc.properties</value>
 * 			<value>classpath:resource.properties</value>
 * 		</list>
 * 	</property>
 * </bean>
 * }
 * </pre>
 * 
 * @author qibill
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	private List<String> encryptPropNames;

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {

		if (encryptPropNames.contains(propertyName)) {
			return DESUtil.decrypt(propertyValue, "Bio-San#17");
		}

		return super.convertProperty(propertyName, propertyValue);
	}

	public List<String> getEncryptPropNames() {
		return encryptPropNames;
	}

	public void setEncryptPropNames(List<String> encryptPropNames) {
		this.encryptPropNames = encryptPropNames;
	}
}
