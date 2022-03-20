package src.main.java.com.fcastillo.demo;

public class Venta {
    private String mes;
    private Double total;
    private Integer anio;

    public Venta() {
    }

    public Venta(String mes, Double total, Integer anio) {
        this.mes = mes;
        this.total = total;
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

}
