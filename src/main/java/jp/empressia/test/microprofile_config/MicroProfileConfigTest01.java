package jp.empressia.test.microprofile_config;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Config01そのままでも使えるけど、設定を拡張してConfig02を作りたい。
 * でも@AlternativeなBeanに必須の@ConfigPropertyがあると、
 * 設定とかにconfig01がないと、エラーになる。
 */
@ApplicationScoped
public class MicroProfileConfigTest01 {

	@Dependent
	@Alternative
	public static class Config01 {
		@Inject
		public Config01(
			@ConfigProperty(name="config01") String config01
		) {
		}
	}

	// @Dependent
	// public static class Config02 extends Config01 {
	// 	@Inject
	// 	public Config02(
	// 		@ConfigProperty(name="config02") String config02
	// 	) {
	// 		super(config02);
	// 	}
	// }

//	@Inject
//	public ConfigProperty01(Config02 config02) {
//	}

}
