package io.seata.core.rpc;

import io.seata.core.rpc.netty.NettyPoolKey;

import java.util.Set;

public class ClientInfo {

    private String resourceId;

    private String clientId;

    private NettyPoolKey.TransactionRole clientRole;

    private String version;

    private String applicationId;

    private String transactionServiceGroup;

    private Set<String> resourceSets;

    public ClientInfo(String resourceId, String rmClientId, NettyPoolKey.TransactionRole clientRole, String version, String applicationId, String transactionServiceGroup, Set<String> resourceSets) {
        this.resourceId = resourceId;
        this.clientId = rmClientId;
        this.clientRole = clientRole;
        this.version = version;
        this.applicationId = applicationId;
        this.transactionServiceGroup = transactionServiceGroup;
        this.resourceSets = resourceSets;
    }
    public ClientInfo(String resourceId, RpcContext rpcContext) {
        this.resourceId = resourceId;
        this.clientId = rpcContext.getClientId();
        this.clientRole = rpcContext.getClientRole();
        this.version = rpcContext.getVersion();
        this.applicationId = rpcContext.getApplicationId();
        this.transactionServiceGroup = rpcContext.getTransactionServiceGroup();
        this.resourceSets = rpcContext.getResourceSets();
    }

    public ClientInfo(RpcContext rpcContext) {
        this.clientId = rpcContext.getClientId();
        this.clientRole = rpcContext.getClientRole();
        this.version = rpcContext.getVersion();
        this.applicationId = rpcContext.getApplicationId();
        this.transactionServiceGroup = rpcContext.getTransactionServiceGroup();
        this.resourceSets = rpcContext.getResourceSets();
    }


    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public NettyPoolKey.TransactionRole getClientRole() {
        return clientRole;
    }

    public void setClientRole(NettyPoolKey.TransactionRole clientRole) {
        this.clientRole = clientRole;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getTransactionServiceGroup() {
        return transactionServiceGroup;
    }

    public void setTransactionServiceGroup(String transactionServiceGroup) {
        this.transactionServiceGroup = transactionServiceGroup;
    }

    public Set<String> getResourceSets() {
        return resourceSets;
    }

    public void setResourceSets(Set<String> resourceSets) {
        this.resourceSets = resourceSets;
    }
}
