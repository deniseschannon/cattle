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
@javax.persistence.Table(name = "instance_host_map", schema = "dstack")
public interface InstanceHostMap extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.instance_host_map.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.instance_host_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.instance_host_map.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.instance_host_map.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.instance_host_map.instance_id</code>. 
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.instance_host_map.instance_id</code>. 
	 */
	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>dstack.instance_host_map.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.instance_host_map.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", nullable = false, precision = 19)
	public java.lang.Long getHostId();

	/**
	 * Setter for <code>dstack.instance_host_map.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.instance_host_map.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface InstanceHostMap
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.InstanceHostMap from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface InstanceHostMap
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.InstanceHostMap> E into(E into);
}
