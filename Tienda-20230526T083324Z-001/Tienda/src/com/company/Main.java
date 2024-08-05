package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CarritoCompra carritoCompra = new CarritoCompra();
        int x = 0;
        while (x != 7) {

            System.out.println("introduce un número del 1 al 7: ");
            System.out.println("1.Añadir producto ");
            System.out.println("2.Buscar producto ");
            System.out.println("3.Eliminar producto ");
            System.out.println("4.listar productos ");
            System.out.println("5.actualiza productos ");
            System.out.println("6.precio total ");
            System.out.println("7salir ");
            x = scan.nextInt();
            scan.nextLine();
            switch (x) {
                case 1:
                    System.out.println("introduce un nombre de producto ");

                    String nombre1 = scan.nextLine();
                    System.out.println("introduce una categoria");
                    String categoria1 = scan.nextLine();
                    System.out.println("introduce un precio");
                    double precio1 = scan.nextDouble();
                    scan.nextLine();

                    System.out.println("introduce una cantidad");
                    String cantidad1 = scan.nextLine();

                    Producto p1 = new Producto(nombre1, categoria1, precio1, Integer.parseInt(cantidad1));
                    carritoCompra.addProduct(p1);
                    System.out.println("producto añadido correctamente");
                    break;
                case 2:

                    System.out.println("introduce un nombre de producto ");
                    String nombre = scan.nextLine();
                    System.out.println("introduce una categoria");
                    String categoria = scan.nextLine();

                    System.out.println("introduce una cantidad");
                    int precio = scan.nextInt();
                    System.out.println("introduce una cantidad");
                    String cantidad = scan.nextLine();

                    Producto p2 = new Producto(nombre, categoria, precio, Integer.parseInt(cantidad));
                    int indice = carritoCompra.getProductIndex(p2);
                    if (indice != -1) {
                        System.out.println("el producto esta en la posicion" + indice);
                    } else {
                        System.out.println("el producto no existe");
                    }
                    break;

                case 3:
                    System.out.println("introduce un nombre de producto ");
                    String nombre2 = scan.nextLine();
                    System.out.println("introduce una categoria");
                    String categoria2 = scan.nextLine();
                    System.out.println("introduce un precio");
                    int precio2 = scan.nextInt();

                    System.out.println("introduce una cantidad");
                    String cantidad2 = scan.nextLine();

                    Producto p3 = new Producto(nombre2, categoria2, precio2, Integer.parseInt(cantidad2));
                    carritoCompra.deleteProduct(p3);


                    break;
                case 4:
                    carritoCompra.listProducts();
                    System.out.println("listado de productos");
                    break;
                case 5:
                    System.out.println("introduce un nombre de producto ");
                    String nombre3 = scan.nextLine();
                    System.out.println("introduce una categoria");
                    String categoria3 = scan.nextLine();
                    System.out.println("introduce un precio");
                    int precio3 = scan.nextInt();

                    System.out.println("introduce una cantidad");
                    String cantidad3 = scan.nextLine();

                    Producto p4 = new Producto(nombre3, categoria3, precio3, Integer.parseInt(cantidad3));
                    System.out.println("introducr el producto al que quieres modificarlo:");
                    System.out.println("introduce un nombre de producto ");
                    String nombre4 = scan.nextLine();
                    System.out.println("introduce una categoria");
                    String categoria4 = scan.nextLine();
                    System.out.println("introduce un precio");
                    int precio4 = scan.nextInt();
                    System.out.println("introduce una cantidad");
                    String cantidad4 = scan.nextLine();
                    Producto p5 = new Producto(nombre4, categoria4, precio4, Integer.parseInt(cantidad4));











                    int i = carritoCompra.getProductIndex(p4);
                    carritoCompra.updateProduct(p5, i);
                    System.out.println("ACTUALIZAR");
                    break;
                case 6:
                    System.out.println("suma total es "+ carritoCompra.sumaTotalPrecio());
                    break;
                Default:
                System.out.println("el num introducido no es correcto");
                break;
            }

        }




        // write your code here
    }
}
