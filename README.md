# MicroProfile Configの動作確認用。

## 1. 概要

@AlternativeなBeanに、必須の@ConfigPropertyを設定すると、Payaraが起動できない。

『./gradlew build』でwarが作れる。

Payara Micro 5.194 （Java11）で動作確認。

## 2. 実行結果

```
[2020-01-26T16:49:22.961+0900] [] [[1;91m重大] [NCLS-CORE-00026] [[1;94mjavax.enterprise.system.core] [tid: _ThreadID=1 _ThreadName=main] [timeMillis: 1580024962961] [levelValue: 1000] [[
  Exception during lifecycle processing
org.glassfish.deployment.common.DeploymentException: CDI definition failure:Exception List with 1 exceptions:
Exception 0 :
javax.enterprise.inject.spi.DeploymentException: Deployment Failure for ConfigProperty config01 in class jp.empressia.test.microprofile_config.MicroProfileConfigTest01.Config01 Reason Microprofile Config Property config01 can not be found
	at fish.payara.microprofile.config.cdi.CDIExtension.validateInjectionPoint(CDIExtension.java:92)
（中略）
	at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: javax.enterprise.inject.spi.DeploymentException: Microprofile Config Property config01 can not be found
	at fish.payara.microprofile.config.cdi.ConfigPropertyProducer.getGenericProperty(ConfigPropertyProducer.java:110)
	at fish.payara.microprofile.config.cdi.CDIExtension.validateInjectionPoint(CDIExtension.java:77)
	... 49 more
（以下略）
```
