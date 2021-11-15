//
// This file generated by rdl 1.5.2. Do not modify!
//
package com.yahoo.athenz.msd;

import com.yahoo.rdl.*;
import javax.ws.rs.client.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.net.ssl.HostnameVerifier;

public class MSDRDLGeneratedClient {
    Client client;
    WebTarget base;
    String credsHeader;
    String credsToken;

    public MSDRDLGeneratedClient(String url) {
        client = ClientBuilder.newClient();
        base = client.target(url);
    }

    public MSDRDLGeneratedClient(String url, HostnameVerifier hostnameVerifier) {
        client = ClientBuilder.newBuilder()
            .hostnameVerifier(hostnameVerifier)
            .build();
        base = client.target(url);
    }

    public MSDRDLGeneratedClient(String url, Client rsClient) {
        client = rsClient;
        base = client.target(url);
    }
    
    public void close() {
        client.close();
    }

    public MSDRDLGeneratedClient setProperty(String name, Object value) {
        client = client.property(name, value);
        base = client.target(base.getUri().toString());
        return this;
    }

    public MSDRDLGeneratedClient addCredentials(String header, String token) {
        credsHeader = header;
        credsToken = token;
        return this;
    }

    public TransportPolicyRules getTransportPolicyRules(String matchingTag, java.util.Map<String, java.util.List<String>> headers) {
        WebTarget target = base.path("/transportpolicies");
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        if (matchingTag != null) {
            invocationBuilder = invocationBuilder.header("If-None-Match", matchingTag);
        }
        Response response = invocationBuilder.get();
        int code = response.getStatus();
        switch (code) {
        case 200:
        case 304:
            if (headers != null) {
                headers.put("tag", java.util.Arrays.asList((String) response.getHeaders().getFirst("ETag")));
            }
            if (code == 304) {
                return null;
            }
            return response.readEntity(TransportPolicyRules.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public TransportPolicyValidationResponse validateTransportPolicy(TransportPolicyValidationRequest transportPolicy) {
        WebTarget target = base.path("/transportpolicy/validate");
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        Response response = invocationBuilder.post(javax.ws.rs.client.Entity.entity(transportPolicy, "application/json"));
        int code = response.getStatus();
        switch (code) {
        case 200:
            return response.readEntity(TransportPolicyValidationResponse.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public TransportPolicyValidationResponseList getTransportPolicyValidationStatus(String domainName) {
        WebTarget target = base.path("/domain/{domainName}/transportpolicy/validationstatus")
            .resolveTemplate("domainName", domainName);
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        Response response = invocationBuilder.get();
        int code = response.getStatus();
        switch (code) {
        case 200:
            return response.readEntity(TransportPolicyValidationResponseList.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public Workloads getWorkloadsByService(String domainName, String serviceName, String matchingTag, java.util.Map<String, java.util.List<String>> headers) {
        WebTarget target = base.path("/domain/{domainName}/service/{serviceName}/workloads")
            .resolveTemplate("domainName", domainName)
            .resolveTemplate("serviceName", serviceName);
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        if (matchingTag != null) {
            invocationBuilder = invocationBuilder.header("If-None-Match", matchingTag);
        }
        Response response = invocationBuilder.get();
        int code = response.getStatus();
        switch (code) {
        case 200:
        case 304:
            if (headers != null) {
                headers.put("tag", java.util.Arrays.asList((String) response.getHeaders().getFirst("ETag")));
            }
            if (code == 304) {
                return null;
            }
            return response.readEntity(Workloads.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public Workloads getWorkloadsByIP(String ip, String matchingTag, java.util.Map<String, java.util.List<String>> headers) {
        WebTarget target = base.path("/workloads/{ip}")
            .resolveTemplate("ip", ip);
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        if (matchingTag != null) {
            invocationBuilder = invocationBuilder.header("If-None-Match", matchingTag);
        }
        Response response = invocationBuilder.get();
        int code = response.getStatus();
        switch (code) {
        case 200:
        case 304:
            if (headers != null) {
                headers.put("tag", java.util.Arrays.asList((String) response.getHeaders().getFirst("ETag")));
            }
            if (code == 304) {
                return null;
            }
            return response.readEntity(Workloads.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public WorkloadOptions putDynamicWorkload(String domainName, String serviceName, WorkloadOptions options) {
        WebTarget target = base.path("/domain/{domainName}/service/{serviceName}/workload/dynamic")
            .resolveTemplate("domainName", domainName)
            .resolveTemplate("serviceName", serviceName);
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        Response response = invocationBuilder.put(javax.ws.rs.client.Entity.entity(options, "application/json"));
        int code = response.getStatus();
        switch (code) {
        case 204:
            return null;
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public StaticWorkload putStaticWorkload(String domainName, String serviceName, StaticWorkload staticWorkload) {
        WebTarget target = base.path("/domain/{domainName}/service/{serviceName}/workload/static")
            .resolveTemplate("domainName", domainName)
            .resolveTemplate("serviceName", serviceName);
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        Response response = invocationBuilder.put(javax.ws.rs.client.Entity.entity(staticWorkload, "application/json"));
        int code = response.getStatus();
        switch (code) {
        case 204:
            return null;
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

    public NetworkPolicyChangeImpactResponse evaluateNetworkPolicyChange(NetworkPolicyChangeImpactRequest detail) {
        WebTarget target = base.path("/transportpolicy/evaluatenetworkpolicychange");
        Invocation.Builder invocationBuilder = target.request("application/json");
        if (credsHeader != null) {
            invocationBuilder = credsHeader.startsWith("Cookie.") ? invocationBuilder.cookie(credsHeader.substring(7),
                credsToken) : invocationBuilder.header(credsHeader, credsToken);
        }
        Response response = invocationBuilder.post(javax.ws.rs.client.Entity.entity(detail, "application/json"));
        int code = response.getStatus();
        switch (code) {
        case 200:
            return response.readEntity(NetworkPolicyChangeImpactResponse.class);
        default:
            throw new ResourceException(code, response.readEntity(ResourceError.class));
        }

    }

}
