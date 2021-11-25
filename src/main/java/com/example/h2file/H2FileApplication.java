package com.example.h2file;

import com.example.h2file.model.Cart;
import com.example.h2file.model.Item;
import com.example.h2file.repository.CartRepository;
import com.example.h2file.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
		ItemRepository itemRepository = configurableApplicationContext.getBean(ItemRepository.class);

		Cart cart = new Cart("C999");
		Item chocolate = new Item("s123", cart);
		Item shampoo = new Item("s321", cart);
		List<Item> items = List.of(chocolate,shampoo);
		cart.setItems(items);
		cartRepository.save(cart);
		cartRepository.delete(cart);

	}

}
