package Ciuris.personal;
import javax.persistence.*;

@Entity
@Table(name = "test")
public class IpInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "ip")
    private String ip;
    @Column(name = "hostname")
    private String hostname;
    @Column(name = "city")
    private String city;


    @Column(name = "region")
    private String region;
    @Column(name = "country")
    private String country;
    @Column(name = "loc")
    private String loc;
    @Column(name = "org")
    private String org;
    @Column(name = "postal")
    private String postal;
    @Column(name = "timezone")
    private String timezone;


    public IpInfo( String ip, String hostname, String city, String region, String country, String loc, String org, String postal, String timezone) {
        this.ip = ip;
        this.hostname = hostname;
        this.city = city;
        this.region = region;
        this.country = country;
        this.loc = loc;
        this.org = org;
        this.postal = postal;
        this.timezone = timezone;
    }
    public IpInfo() {
        this.ip = "";
        this.hostname = "";
        this.city = "";
        this.region = "";
        this.country = "";
        this.loc = "";
        this.org = "";
        this.postal = "";
        this.timezone = "";
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}