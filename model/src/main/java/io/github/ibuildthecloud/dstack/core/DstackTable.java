/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DstackTable extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1351227064;

	/**
	 * The singleton instance of <code>dstack</code>
	 */
	public static final DstackTable DSTACK = new DstackTable();

	/**
	 * No further instances allowed
	 */
	private DstackTable() {
		super("dstack");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			io.github.ibuildthecloud.dstack.core.tables.AccountTable.ACCOUNT,
			io.github.ibuildthecloud.dstack.core.tables.AgentTable.AGENT,
			io.github.ibuildthecloud.dstack.core.tables.AgentGroupTable.AGENT_GROUP,
			io.github.ibuildthecloud.dstack.core.tables.CredentialTable.CREDENTIAL,
			io.github.ibuildthecloud.dstack.core.tables.DataTable.DATA,
			io.github.ibuildthecloud.dstack.core.tables.DatabasechangelogTable.DATABASECHANGELOG,
			io.github.ibuildthecloud.dstack.core.tables.DatabasechangeloglockTable.DATABASECHANGELOGLOCK,
			io.github.ibuildthecloud.dstack.core.tables.HostTable.HOST,
			io.github.ibuildthecloud.dstack.core.tables.ImageTable.IMAGE,
			io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable.IMAGE_FORMAT,
			io.github.ibuildthecloud.dstack.core.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP,
			io.github.ibuildthecloud.dstack.core.tables.InstanceTable.INSTANCE,
			io.github.ibuildthecloud.dstack.core.tables.InstanceHostMapTable.INSTANCE_HOST_MAP,
			io.github.ibuildthecloud.dstack.core.tables.IpAddressTable.IP_ADDRESS,
			io.github.ibuildthecloud.dstack.core.tables.IpAssignmentTable.IP_ASSIGNMENT,
			io.github.ibuildthecloud.dstack.core.tables.ItemPoolTable.ITEM_POOL,
			io.github.ibuildthecloud.dstack.core.tables.ItemPoolGeneratorTable.ITEM_POOL_GENERATOR,
			io.github.ibuildthecloud.dstack.core.tables.NetworkTable.NETWORK,
			io.github.ibuildthecloud.dstack.core.tables.NicTable.NIC,
			io.github.ibuildthecloud.dstack.core.tables.OfferingTable.OFFERING,
			io.github.ibuildthecloud.dstack.core.tables.ProcessInstanceTable.PROCESS_INSTANCE,
			io.github.ibuildthecloud.dstack.core.tables.SettingTable.SETTING,
			io.github.ibuildthecloud.dstack.core.tables.StoragePoolTable.STORAGE_POOL,
			io.github.ibuildthecloud.dstack.core.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP,
			io.github.ibuildthecloud.dstack.core.tables.VnetTable.VNET,
			io.github.ibuildthecloud.dstack.core.tables.VolumeTable.VOLUME,
			io.github.ibuildthecloud.dstack.core.tables.VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP,
			io.github.ibuildthecloud.dstack.core.tables.ZoneTable.ZONE);
	}
}
