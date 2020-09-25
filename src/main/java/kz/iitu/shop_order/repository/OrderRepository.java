package kz.iitu.shop_order.repository;

import kz.iitu.shop_order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
