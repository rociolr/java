package com.company;

import java.util.ArrayList;

public class CarritoCompra {

    private ArrayList<Producto> productList;

    public CarritoCompra() {
        this.productList = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductList() {
        return productList;
    }

    public void addProduct(Producto producto) {
        //Contains hace equals para cada uno de los elementos de la lista, si alguno es true --> Contains = true
        if (productList.contains(producto)) {
            //Actualiza el producto si existe
            System.out.println("El producto ya está añadido, actualizando cantidad de producto.");
            updateProductQuantity(producto, getProductIndex(producto));
        } else {
            //Añade el producto si no existe
            productList.add(producto);
            System.out.println("Producto añadido con éxito");

        }
    }

    private void updateProductQuantity(Producto producto, int productIndex) {
        Producto productoAActualizar = productList.get(productIndex);
        productoAActualizar.setCantidad(productoAActualizar.getCantidad() + producto.getCantidad());

    }


    public void updateProduct(Producto producto, int index) {
        Producto productoAActualizar=  productList.get(index);
        productoAActualizar.setNombre(producto.getNombre());
        productoAActualizar.setCategoria(producto.getCategoria());
        productoAActualizar.setPrecio(producto.getPrecio());
        productoAActualizar.setCantidad(producto.getCantidad());

    }

    public void deleteProduct(Producto producto) {
        //.remove comprueba si la lista contiene el objeto y  si lo hace elimina la primera ocurrencia de ese objeto en la lista
        productList.remove(producto);
    }

    public void listProducts() {
        for (Producto p : productList) {
            System.out.println(p.toString());
        }
    }














       double total=0.0;
        for(Producto p:productList){
         total= total+p.getPrecio();
        }

        return total;
    }


    public int getProductIndex(Producto producto) {
        return productList.indexOf(producto);
    }
}
