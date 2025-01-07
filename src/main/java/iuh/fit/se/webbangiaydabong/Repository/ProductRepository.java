package iuh.fit.se.webbangiaydabong.Repository;


import iuh.fit.se.webbangiaydabong.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
