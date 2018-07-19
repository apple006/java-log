
## 一、logback的介绍

Logback是由log4j创始人设计的又一个开源日志组件。logback当前分成三个模块：logback-core，logback- classic和logback-access。logback-core是其它两个模块的基础模块。logback-classic是log4j的一个改良版本。此外logback-classic完整实现SLF4J API使你可以很方便地更换成其它日志系统如log4j或JDK14 Logging。logback-access访问模块与Servlet容器集成提供通过Http来访问日志的功能。 Logback是要与SLF4J结合起来用两个组件的官方网站如下：

logback的官方网站： http://logback.qos.ch

SLF4J的官方网站：http://www.slf4j.org