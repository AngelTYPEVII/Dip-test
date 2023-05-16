package model;

public class Info {
    public Object logoUrl;
    public Object activeBrandbookSchemaId;
    public KeycloakSettings keycloakSettings;

    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Object getActiveBrandbookSchemaId() {
        return activeBrandbookSchemaId;
    }

    public void setActiveBrandbookSchemaId(Object activeBrandbookSchemaId) {
        this.activeBrandbookSchemaId = activeBrandbookSchemaId;
    }

    public KeycloakSettings getKeycloakSettings() {
        return keycloakSettings;
    }

    public void setKeycloakSettings(KeycloakSettings keycloakSettings) {
        this.keycloakSettings = keycloakSettings;
    }
}
