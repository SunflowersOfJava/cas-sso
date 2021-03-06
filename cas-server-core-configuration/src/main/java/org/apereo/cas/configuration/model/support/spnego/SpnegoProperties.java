package org.apereo.cas.configuration.model.support.spnego;

import org.apereo.cas.configuration.model.core.authentication.PersonDirPrincipalResolverProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * This is {@link SpnegoProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */

public class SpnegoProperties {
    
    
    private boolean principalWithDomainName;
    private boolean ntlmAllowed = true;
    private boolean send401OnAuthenticationFailure = true;

    private String hostNameClientActionStrategy = "hostnameSpnegoClientAction";
    
    private String jcifsPassword;
    private String jcifsServicePassword;
    private String jcifsServicePrincipal = "HTTP/cas.example.com@EXAMPLE.COM";
    private String kerberosConf;
    private String kerberosKdc = "172.10.1.10";
    private String kerberosRealm = "EXAMPLE.COM";
    private String loginConf;
    private long timeout = 300000;
    private long cachePolicy = 600;
    private String jcifsNetbiosWins;
    private String jcifsUsername;
    private String jcifsDomainController;
    private String jcifsDomain;
    private String kerberosDebug;
    private boolean useSubjectCredsOnly;
    private int dnsTimeout = 2000;
    private String hostNamePatternString = ".+";
    private String ipsToCheckPattern = "127.+";
    private String alternativeRemoteHostAttribute = "alternateRemoteHeader";
    private String spnegoAttributeName = "distinguishedName";

    private boolean ntlm;
    private boolean mixedModeAuthentication;
    private String supportedBrowsers = "MSIE,Trident,Firefox,AppleWebKit";

    @NestedConfigurationProperty
    private PersonDirPrincipalResolverProperties principal = new PersonDirPrincipalResolverProperties();

    public PersonDirPrincipalResolverProperties getPrincipal() {
        return principal;
    }

    public void setPrincipal(final PersonDirPrincipalResolverProperties principal) {
        this.principal = principal;
    }

    public boolean isSend401OnAuthenticationFailure() {
        return send401OnAuthenticationFailure;
    }

    public void setSend401OnAuthenticationFailure(final boolean send401OnAuthenticationFailure) {
        this.send401OnAuthenticationFailure = send401OnAuthenticationFailure;
    }

    public String getHostNameClientActionStrategy() {
        return hostNameClientActionStrategy;
    }

    public void setHostNameClientActionStrategy(final String hostNameClientActionStrategy) {
        this.hostNameClientActionStrategy = hostNameClientActionStrategy;
    }

    public boolean isNtlm() {
        return ntlm;
    }

    public void setNtlm(final boolean ntlm) {
        this.ntlm = ntlm;
    }

    public boolean isMixedModeAuthentication() {
        return mixedModeAuthentication;
    }

    public void setMixedModeAuthentication(final boolean mixedModeAuthentication) {
        this.mixedModeAuthentication = mixedModeAuthentication;
    }

    public String getSupportedBrowsers() {
        return supportedBrowsers;
    }

    public void setSupportedBrowsers(final String supportedBrowsers) {
        this.supportedBrowsers = supportedBrowsers;
    }

    public String getSpnegoAttributeName() {
        return spnegoAttributeName;
    }

    public void setSpnegoAttributeName(final String spnegoAttributeName) {
        this.spnegoAttributeName = spnegoAttributeName;
    }

    public int getDnsTimeout() {
        return dnsTimeout;
    }

    public void setDnsTimeout(final int dnsTimeout) {
        this.dnsTimeout = dnsTimeout;
    }

    public String getIpsToCheckPattern() {
        return ipsToCheckPattern;
    }

    public void setIpsToCheckPattern(final String ipsToCheckPattern) {
        this.ipsToCheckPattern = ipsToCheckPattern;
    }

    public String getAlternativeRemoteHostAttribute() {
        return alternativeRemoteHostAttribute;
    }

    public void setAlternativeRemoteHostAttribute(final String alternativeRemoteHostAttribute) {
        this.alternativeRemoteHostAttribute = alternativeRemoteHostAttribute;
    }

    public String getJcifsPassword() {
        return jcifsPassword;
    }

    public String getHostNamePatternString() {
        return hostNamePatternString;
    }

    public void setHostNamePatternString(final String hostNamePatternString) {
        this.hostNamePatternString = hostNamePatternString;
    }

    public void setJcifsPassword(final String jcifsPassword) {
        this.jcifsPassword = jcifsPassword;
    }

    public String getJcifsServicePassword() {
        return jcifsServicePassword;
    }

    public void setJcifsServicePassword(final String jcifsServicePassword) {
        this.jcifsServicePassword = jcifsServicePassword;
    }

    public String getJcifsServicePrincipal() {
        return jcifsServicePrincipal;
    }

    public void setJcifsServicePrincipal(final String jcifsServicePrincipal) {
        this.jcifsServicePrincipal = jcifsServicePrincipal;
    }

    public String getKerberosConf() {
        return kerberosConf;
    }

    public void setKerberosConf(final String kerberosConf) {
        this.kerberosConf = kerberosConf;
    }

    public String getKerberosKdc() {
        return kerberosKdc;
    }

    public void setKerberosKdc(final String kerberosKdc) {
        this.kerberosKdc = kerberosKdc;
    }

    public String getKerberosRealm() {
        return kerberosRealm;
    }

    public void setKerberosRealm(final String kerberosRealm) {
        this.kerberosRealm = kerberosRealm;
    }

    public String getLoginConf() {
        return loginConf;
    }

    public void setLoginConf(final String loginConf) {
        this.loginConf = loginConf;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(final long timeout) {
        this.timeout = timeout;
    }

    public long getCachePolicy() {
        return cachePolicy;
    }

    public void setCachePolicy(final long cachePolicy) {
        this.cachePolicy = cachePolicy;
    }

    public String getJcifsNetbiosWins() {
        return jcifsNetbiosWins;
    }

    public void setJcifsNetbiosWins(final String jcifsNetbiosWins) {
        this.jcifsNetbiosWins = jcifsNetbiosWins;
    }

    public String getJcifsUsername() {
        return jcifsUsername;
    }

    public void setJcifsUsername(final String jcifsUsername) {
        this.jcifsUsername = jcifsUsername;
    }

    public String getJcifsDomainController() {
        return jcifsDomainController;
    }

    public void setJcifsDomainController(final String jcifsDomainController) {
        this.jcifsDomainController = jcifsDomainController;
    }

    public String getJcifsDomain() {
        return jcifsDomain;
    }

    public void setJcifsDomain(final String jcifsDomain) {
        this.jcifsDomain = jcifsDomain;
    }

    public String getKerberosDebug() {
        return kerberosDebug;
    }

    public void setKerberosDebug(final String kerberosDebug) {
        this.kerberosDebug = kerberosDebug;
    }

    public boolean isUseSubjectCredsOnly() {
        return useSubjectCredsOnly;
    }

    public void setUseSubjectCredsOnly(final boolean useSubjectCredsOnly) {
        this.useSubjectCredsOnly = useSubjectCredsOnly;
    }

    public boolean isPrincipalWithDomainName() {
        return principalWithDomainName;
    }

    public void setPrincipalWithDomainName(final boolean principalWithDomainName) {
        this.principalWithDomainName = principalWithDomainName;
    }

    public boolean isNtlmAllowed() {
        return ntlmAllowed;
    }

    public void setNtlmAllowed(final boolean ntlmAllowed) {
        this.ntlmAllowed = ntlmAllowed;
    }
    
    
}

