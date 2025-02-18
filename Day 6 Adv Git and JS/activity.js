class Product {
    constructor(id, name, price, category) {
        this.id = id;
        this.name;
        this.price = price;
        this.category;
    }
}

class Cart {
    constructor() {
        this.cart = []
    }

    addItem(product) {
        // By default quantity will be one
        // {id: Date.now(), product: {name: "", price: <int>}, quantity: 1}
        cart.push({ product, quantity: 1 })
    }

    removeItem(productName) {

    }

    updateItem() {
        // Increase the quantity by one
    }

    showTotalAmount() {
        // quantity * price
    }
}
const cart = new Cart();
cart.addItem(new Product(1, "Pen", 10, "Stationary"))