package com.company;

public class Compra {
    int x;
    int y;
    Double totalCompra;
    Double promedio;
    int contador;
    Productos[][] Compra;

    public void detalleCompra(){
        Compra=new Productos[5][5];
        totalCompra=0.0;
        x=-1;
        y=-1;
    }

    public void ingresarCompra(int c){
        Catalogo busqueda= new Catalogo();
        for (int i=0; i<10; i++)
        {
            for(int j=0;j<10;j++)
            {
                if(busqueda.catalogoProducto[i][j].getCodigo()== c)
                {
                    Compra[x++][y++]=busqueda.catalogoProducto[i][j];
                    totalCompra+=Compra[x][y].getPrecio();
                    contador++;
                    x--;
                    if (y==4)
                    {
                        x++;
                    }
                }

            }
        }
    }

    public String mostrarCompras(){
        return ("Total de compras: "+totalCompra);
    }

    public Double promedio()
    {
        promedio=totalCompra/contador;
        return promedio;
    }

}
