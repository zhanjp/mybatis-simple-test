package shawne.mybatis.simple.model;

/**
 * @author zhanjp
 * @DATE 2019/10/28
 */
public class Country {

    private Integer id;

    private String countrycode;

    private String countryname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countrycode='" + countrycode + '\'' +
                ", countryname='" + countryname + '\'' +
                '}';
    }
}
