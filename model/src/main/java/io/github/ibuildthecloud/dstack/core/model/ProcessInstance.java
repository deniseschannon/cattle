/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "process_instance", schema = "dstack")
public interface ProcessInstance extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.process_instance.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.process_instance.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.process_instance.start_time</code>. 
	 */
	public void setStartTime(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.process_instance.start_time</code>. 
	 */
	@javax.persistence.Column(name = "start_time")
	public java.sql.Timestamp getStartTime();

	/**
	 * Setter for <code>dstack.process_instance.end_time</code>. 
	 */
	public void setEndTime(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.process_instance.end_time</code>. 
	 */
	@javax.persistence.Column(name = "end_time")
	public java.sql.Timestamp getEndTime();

	/**
	 * Setter for <code>dstack.process_instance.log</code>. 
	 */
	public void setLog(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.process_instance.log</code>. 
	 */
	@javax.persistence.Column(name = "log", length = 16777215)
	public java.util.Map<String,Object> getLog();

	/**
	 * Setter for <code>dstack.process_instance.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.process_instance.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>dstack.process_instance.process_name</code>. 
	 */
	public void setProcessName(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.process_name</code>. 
	 */
	@javax.persistence.Column(name = "process_name", length = 128)
	public java.lang.String getProcessName();

	/**
	 * Setter for <code>dstack.process_instance.resource_type</code>. 
	 */
	public void setResourceType(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.resource_type</code>. 
	 */
	@javax.persistence.Column(name = "resource_type", length = 128)
	public java.lang.String getResourceType();

	/**
	 * Setter for <code>dstack.process_instance.resource_id</code>. 
	 */
	public void setResourceId(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.resource_id</code>. 
	 */
	@javax.persistence.Column(name = "resource_id", length = 128)
	public java.lang.String getResourceId();

	/**
	 * Setter for <code>dstack.process_instance.result</code>. 
	 */
	public void setResult(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.result</code>. 
	 */
	@javax.persistence.Column(name = "result", length = 128)
	public java.lang.String getResult();

	/**
	 * Setter for <code>dstack.process_instance.exit_reason</code>. 
	 */
	public void setExitReason(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.exit_reason</code>. 
	 */
	@javax.persistence.Column(name = "exit_reason", length = 128)
	public java.lang.String getExitReason();

	/**
	 * Setter for <code>dstack.process_instance.phase</code>. 
	 */
	public void setPhase(java.lang.String value);

	/**
	 * Getter for <code>dstack.process_instance.phase</code>. 
	 */
	@javax.persistence.Column(name = "phase", length = 128)
	public java.lang.String getPhase();

	/**
	 * Setter for <code>dstack.process_instance.start_process_server_id</code>. 
	 */
	public void setStartProcessServerId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.process_instance.start_process_server_id</code>. 
	 */
	@javax.persistence.Column(name = "start_process_server_id", precision = 20)
	public java.lang.Long getStartProcessServerId();

	/**
	 * Setter for <code>dstack.process_instance.running_process_server_id</code>. 
	 */
	public void setRunningProcessServerId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.process_instance.running_process_server_id</code>. 
	 */
	@javax.persistence.Column(name = "running_process_server_id", precision = 20)
	public java.lang.Long getRunningProcessServerId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ProcessInstance
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.ProcessInstance from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ProcessInstance
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.ProcessInstance> E into(E into);
}
