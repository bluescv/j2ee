package learning.mybatis.domain;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.NAME
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.age
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.NAME
     *
     * @return the value of users.NAME
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.NAME
     *
     * @param name the value for users.NAME
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.age
     *
     * @return the value of users.age
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.age
     *
     * @param age the value for users.age
     *
     * @mbggenerated Tue Jul 12 11:00:33 GMT+08:00 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}