/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class PlanillaC{
    
    double Salario_mensual;
    double Horas_extras;
    Date Fecha_ingreso;
    double Ingresos_horas_extras;
    double Antiguedad;
    double Bonos;
    double Otros_ingresos;
    double Total_ingresos;
    double Inss_laboral;
    double Ir_laboral;
    double Otras_deducciones;
    double Total_deducciones;

    public PlanillaC(double Salario_mensual, double Horas_extras, Date Fecha_ingreso, double Ingresos_horas_extras,double Antiguedad,double Bonos, double Otros_ingresos, double Total_ingresos, double Inss_laboral, double Otras_deducciones, double Total_deducciones) {
        this.Salario_mensual = Salario_mensual;
        this.Horas_extras = Horas_extras;
        this.Fecha_ingreso = Fecha_ingreso;
        this.Ingresos_horas_extras = Ingresos_horas_extras;
        this.Antiguedad = Antiguedad;
        this.Bonos = Bonos;
        this.Otros_ingresos = Otros_ingresos;
        this.Total_ingresos = Total_ingresos;
        this.Inss_laboral = Inss_laboral;
        this.Otras_deducciones = Otras_deducciones;
        this.Total_deducciones = Total_deducciones;
    }

    public double getSalario_mensual() {
        return Salario_mensual;
    }

    public void setSalario_mensual(double Salario_mensual) {
        this.Salario_mensual = Salario_mensual;
    }

    public double getHoras_extras() {
        return Horas_extras;
    }

    public void setHoras_extras(double Horas_extras) {
        this.Horas_extras = Horas_extras;
    }

    public Date getFecha_ingreso() {
        return Fecha_ingreso;
    }

    public void setFecha_ingreso(Date Fecha_ingreso) {
        this.Fecha_ingreso = Fecha_ingreso;
    }

    public double getIngresos_horas_extras() {
        return Ingresos_horas_extras;
    }

    public void setIngresos_horas_extras(double Ingresos_horas_extras) {
        this.Ingresos_horas_extras = Ingresos_horas_extras;
    }

    public double getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(double Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public double getBonos() {
        return Bonos;
    }

    public void setBonos(double Bonos) {
        this.Bonos = Bonos;
    }

    public double getOtros_ingresos() {
        return Otros_ingresos;
    }

    public void setOtros_ingresos(double Otros_ingresos) {
        this.Otros_ingresos = Otros_ingresos;
    }

    public double getTotal_ingresos() {
        return Total_ingresos;
    }

    public void setTotal_ingresos(double Total_ingresos) {
        this.Total_ingresos = Total_ingresos;
    }

    public double getInss_laboral() {
        return Inss_laboral;
    }

    public void setInss_laboral(double Inss_laboral) {
        this.Inss_laboral = Inss_laboral;
    }

    public double getIr_laboral() {
        return Ir_laboral;
    }

    public void setIr_Laboral(double Ir_Laboral) {
        this.Ir_laboral = Ir_Laboral;
    }

    public double getOtras_deducciones() {
        return Otras_deducciones;
    }

    public void setOtras_deducciones(double Otras_deducciones) {
        this.Otras_deducciones = Otras_deducciones;
    }

    public double getTotal_deducciones() {
        return Total_deducciones;
    }

    public void setTotal_deducciones(double Total_deducciones) {
        this.Total_deducciones = Total_deducciones;
    }
    
    public double calcularIngresosHorasExtras(){
        return ((getSalario_mensual() / 240) * 2) * getHoras_extras();
    }
    
     public static int periodo(Date date) {
        Date nacimiento = date;
        Date actual = new Date();
        int edad = (int) ((actual.getTime() - nacimiento.getTime()) / 86400000) / 365;
        return edad ;
    }
    
    public double calcularAntiduedad(){
        
        int ano=0;//= periodo(getFecha_ingreso());
        
        double[] tasas = {0.03,0.05,0.07,0.09,0.10,0.11,0.12,0.13,0.14,0.15
        ,0.155,0.16,0.165,0.17,0.175,0.18,0.185,0.19,0.195,0.20};
        
        if(ano > tasas.length) 
            return getSalario_mensual() * tasas[tasas.length - 1];
        else if(ano < 1) 
            /*posible cambio*/return 0;
        else
            return getSalario_mensual() * tasas[ano - 1];
    }
    
    public double calcularTotalIngresos(){
        return getSalario_mensual() + calcularIngresosHorasExtras() + calcularAntiduedad() + getBonos() + getOtros_ingresos();
    }
    
    public double calcularInssLaboral(){
        return calcularTotalIngresos() * 0.0625;
    }
    
    public double calcularIr(){
        double salario_anual = ((calcularTotalIngresos() - calcularInssLaboral()) * 12);
        double porcentaje;
        double base;
        double exceso;
        
        if(salario_anual >= 1 && salario_anual <= 100000){
            porcentaje = 0;
            base = 0;
            exceso = 0;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 100001 && salario_anual <= 200000){
            porcentaje = 0.15;
            base = 0;
            exceso = 100000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 200001 && salario_anual <= 350000){
            porcentaje = 0.20;
            base = 15000;
            exceso = 200000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 350001 && salario_anual <= 500000){
            porcentaje = 0.25;
            base = 45000;
            exceso = 350000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else{
            porcentaje = 0.30;
            base = 82500;
            exceso = 500000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}
    }
    
    public double calcularTotalDeducciones(){
        return calcularInssLaboral() + calcularIr() + getOtras_deducciones();
    }
    
    public double calcularRemuneracionNeta(){
        return calcularTotalIngresos() - calcularTotalDeducciones();
    }
    
    public double calcularInssPatronal(){
        return calcularTotalIngresos()* 0.19;
    }
    
    public double calcularInatec(){
        return calcularTotalIngresos() * 0.02;
    }
    
    public double calcularVacaciones(){
        return (calcularTotalIngresos() / 30) * 2.25;
    }
    
    public double calcularTreceavoMes(){ 
        return ((calcularTotalIngresos() - getBonos()) / 30) * 2.25;
    }
    
    public double calcularIndemnizacionLaboral(){
        int ano =0;// periodo(getFecha_ingreso());  
        if(ano < 1) 
            return 0;
        else if(ano <= 3)
            return (calcularTotalIngresos() / 30) * 2.25;
        else
            return (calcularTotalIngresos() / 30) * 1.66;
    }
    
}
