package cn.rsx.dao;

import cn.rsx.pojo.po.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    Book selectByPrimaryKey(Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Book record);
}