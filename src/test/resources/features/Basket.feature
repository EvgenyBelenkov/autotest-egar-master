Feature: Add product in basket

  Scenario:
    Then Input name product "Apple iPhone 11 Pro Max 64GB (золотистый)"
    Then click add basket
    Then click go to basket "Оформить заказ"
    Then basket visible "Корзина"
    Then check product name "Apple iPhone 11 Pro Max 64GB (золотистый)"
    Then click + increase by one
    Then check cost product

