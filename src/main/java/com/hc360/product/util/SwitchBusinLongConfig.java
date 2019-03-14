package com.hc360.product.util; /**
 * @Title: ActivityUserMapConfig.java
 * @Description: TODO(  )
 * @author leo(Li lele)
 * @date 2014年6月16日 下午3:45:06
 */

import java.util.Properties;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationConverter;
import com.hc360.b2b.exception.LogFactory;
import com.hc360.b2b.exception.Logger;
import com.hc360.config.ConfigureCentreNotify;
import com.hc360.config.manager.util.ServerInvokerHelper;

/**
 * @ClassName:
 * @Description: TODO( businlonginfo 通过配置管理中心控制数据的存储 )
 * @author leo(Li lele)
 * @date 2014-11-02 14:14:49
 */
public class SwitchBusinLongConfig extends ConfigureCentreNotify {

	final static Logger log = LogFactory.getLogger(SwitchBusinLongConfig.class.toString());

	private static String getSwitchByProperties(){
		String result = "";
		try{
			Object configFile = ServerInvokerHelper.getSysConfigFile ("my","switchBusinLong.properties");
			if( configFile != null ){
				Properties properties = ConfigurationConverter.getProperties((Configuration)configFile);
				if(properties != null){
					result = properties.getProperty( "switch" );
					return result;
				}
			}else{
				log.error("从配置管理中心读取switchBusinLong.properties时，未找到该文件",null);
			}
		}catch(Exception e){
			e.printStackTrace();
			log.error("从配置管理中心读取 properties 异常.", e);
		} finally {
			return result;
		}
	}

	public static String getSwitch(){
		String result = getSwitchByProperties();
		return result;
	}
	/* (non-Javadoc)
	 * <p>Title: notifyUpdate</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @param arg1 
	 * @see com.hc360.config.ConfigureCentreNotify#notifyUpdate(java.lang.String, java.lang.String) 
	 */
	@Override
	public void notifyUpdate( String arg0 , String arg1 ) {
		SwitchBusinLongConfig.getSwitchByProperties();
	}

}
