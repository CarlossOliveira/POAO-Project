public class DateTime {
    public int ano;
    public int mes;
    public int dia;
    public int hora;
    public int minuto;
    public int segundo;
    
    public DateTime(){}

    public DateTime(int ano, int mes, int dia, int hora, int minuto, int segundo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                ", hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}
