package com.company;

public class Catalogo {
    Productos[][] catalogoProducto;
    int x;
    int y;


    public void catalogoProductos(){
        catalogoProducto=new Productos[5][5];
        catalogoProducto[0][0]= new Productos("Pan",75000001,12.89);
        catalogoProducto[0][1]= new Productos("Leche",75000002,10.25);
        catalogoProducto[0][2]= new Productos("Huevos",75000003,39.50);
        catalogoProducto[0][3]= new Productos("Azúcar",75000004,15.60);
        catalogoProducto[0][4]= new Productos("Sal",75000005,6.50);
        catalogoProducto[1][0]= new Productos("Café",75000006,49.50);
        catalogoProducto[1][1]= new Productos("Cepillo de Dientes",75000007,10.89);
        catalogoProducto[1][2]= new Productos("Jabón",75000008,24.95);
        catalogoProducto[1][3]= new Productos("Shampoo",75000009,50.75);
        catalogoProducto[1][4]= new Productos("Acondicionador",75000010,50.75);
        x=1;
        y=-1;

    }

    public void ingresarProductos(String n, int c, double p)
    {
        Productos prod=new Productos(n,c,p);
        catalogoProducto[x++][y++]=prod;
        x--;
        if (y==4)
        {
            x++;
        }
    }

}

