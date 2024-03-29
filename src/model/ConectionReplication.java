package model;

public class ConectionReplication {

    private String ReplicationCode;
    
    private String User;

    private String ConnectionName;

    private String ConnectionAddress;

    private String ConnectionPort;

    private String DatabaseSID;

    private String DatabaseType;

    private String DatabaseURL;
    
    private String password;

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ConectionReplication(String replicationCode, String user,String connectionName, String connectionAddress, String connectionPort, String databaseSID, String databaseType, String databaseURL) {
        ReplicationCode = replicationCode;
        User = user;
        ConnectionName = connectionName;
        ConnectionAddress = connectionAddress;
        ConnectionPort = connectionPort;
        DatabaseSID = databaseSID;
        DatabaseType = databaseType;
        DatabaseURL = databaseURL;
    }

    public ConectionReplication() {

    }

    public String getReplicationCode() {
        return ReplicationCode;
    }

    public void setReplicationCode(String replicationCode) {
        ReplicationCode = replicationCode;
    }

    public String getConnectionName() {
        return ConnectionName;
    }

    public void setConnectionName(String connectionName) {
        ConnectionName = connectionName;
    }

    public String getConnectionAddress() {
        return ConnectionAddress;
    }

    public void setConnectionAddress(String connectionAddress) {
        ConnectionAddress = connectionAddress;
    }

    public String getConnectionPort() {
        return ConnectionPort;
    }

    public void setConnectionPort(String connectionPort) {
        ConnectionPort = connectionPort;
    }

    public String getDatabaseSID() {
        return DatabaseSID;
    }

    public void setDatabaseSID(String databaseSID) {
        DatabaseSID = databaseSID;
    }

    public String getDatabaseType() {
        return DatabaseType;
    }

    public void setDatabaseType(String databaseType) {
        DatabaseType = databaseType;
    }

    public String getDatabaseURL() {
        return DatabaseURL;
    }

    public void setDatabaseURL(String databaseURL) {
        DatabaseURL = databaseURL;
    }

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}
}
