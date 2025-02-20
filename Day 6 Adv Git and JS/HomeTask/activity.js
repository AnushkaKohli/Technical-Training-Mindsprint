class Product {
  constructor(id, name, price, category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }
}

class Cart {
  constructor() {
    this.cart = [];
  }

  addItem(product) {
    // By default quantity will be one
    // {id: Date.now(), product: {name: "", price: <int>}, quantity: 1}
    this.cart.push({ id: Date.now(), product, quantity: 1 });
  }

  removeItem(productName) {
    // Remove item by product name
    this.cart = this.cart.filter((item) => item.product.name !== productName);
  }

  updateItem(productName) {
    // Increase the quantity by one
    this.cart = this.cart.map((item) => {
      if (item.product.name === productName) {
        item.quantity += 1;
      }
      return item;
    });
  }

  showTotalAmount() {
    // quantity * price
    return this.cart.reduce(
      (total, item) => total + item.product.price * item.quantity,
      0
    );
  }

  showCart() {
    // Display all items in the cart
    return this.cart.map((item) => ({
      id: item.id,
      product: item.product,
      quantity: item.quantity,
    }));
  }
}
const cart = new Cart();
console.log("Cart after initialization: ", cart.showCart());
cart.addItem(new Product(1, "Pen", 10, "Stationary"));
cart.addItem(new Product(2, "Notebook", 50, "Stationary"));
console.log("Cart after adding product: ", cart.showCart());
cart.updateItem("Pen");
console.log("Cart after updating product: ", cart.showCart());
console.log("Total value of cart: ", cart.showTotalAmount());
