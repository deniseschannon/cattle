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
@javax.persistence.Table(name = "storage_pool_host_map", schema = "dstack")
public interface StoragePoolHostMap extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.storage_pool_host_map.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool_host_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.storage_pool_host_map.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool_host_map.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", nullable = false, precision = 19)
	public java.lang.Long getHostId();

	/**
	 * Setter for <code>dstack.storage_pool_host_map.storage_pool_id</code>. 
	 */
	public void setStoragePoolId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool_host_map.storage_pool_id</code>. 
	 */
	@javax.persistence.Column(name = "storage_pool_id", nullable = false, precision = 19)
	public java.lang.Long getStoragePoolId();

	/**
	 * Setter for <code>dstack.storage_pool_host_map.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool_host_map.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface StoragePoolHostMap
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.StoragePoolHostMap from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface StoragePoolHostMap
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.StoragePoolHostMap> E into(E into);
}
