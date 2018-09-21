package de.metas.monitoring.api;

import de.metas.util.ISingletonService;

/**
 * Monitoring Service API.
 * 
 * 
 */
public interface IMonitoringBL extends ISingletonService
{
	/**
	 * Creates or gets a new meter with the given names.
	 * For the newly created meter, a JMX MBean is created with the object name:
	 * 
	 * <pre>
	 * moduleName + &quot;:type=&quot; + meterName
	 * </pre>
	 * 
	 * @param moduleName
	 * @param meterName
	 * @return meter
	 */
	IMeter createOrGet(String moduleName, String meterName);
}
