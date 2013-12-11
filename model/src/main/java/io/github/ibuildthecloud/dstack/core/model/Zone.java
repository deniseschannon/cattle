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
@javax.persistence.Table(name = "zone", schema = "dstack")
public interface Zone extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.zone.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.zone.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.zone.name</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.zone.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 128)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.zone.description</code>. 
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>dstack.zone.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>dstack.zone.uuid</code>. 
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.zone.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>dstack.zone.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.zone.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>dstack.zone.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.zone.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Zone
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.Zone from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Zone
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.Zone> E into(E into);
}
