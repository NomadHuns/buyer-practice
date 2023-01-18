package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRepository {

    public List<Product> findAll();

    public Product findById(int id);

    public int updateQty(@Param("id") int id, @Param("count") int count);
}
