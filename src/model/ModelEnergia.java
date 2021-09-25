/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lucas Hype
 */
public class ModelEnergia {
    
    private double fornecimento, consumo, icms, cofins, pispasep, icmscofins,icmspispasep, fatura;

    public ModelEnergia(double consumo) {
        setConsumo(consumo);
    }
    

    public double getFornecimento() {
        return fornecimento;
    }

    private void setFornecimento(double fornecimento) {
        this.fornecimento = fornecimento;
    }

    public double getConsumo() {
        return consumo;
    }

    private void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getIcms() {
        return icms;
    }

    private void setIcms(double icms) {
        this.icms = icms;
    }

    public double getCofins() {
        return cofins;
    }

    private void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPispasep() {
        return pispasep;
    }

    private void setPispasep(double pispasep) {
        this.pispasep = pispasep;
    }

    public double getIcmscofins() {
        return icmscofins;
    }

    private void setIcmscofins(double icmscofins) {
        this.icmscofins = icmscofins;
    }

    public double getIcmspispasep() {
        return icmspispasep;
    }

    private void setIcmspispasep(double icmspispasep) {
        this.icmspispasep = icmspispasep;
    }

    public double getFatura() {
        return fatura;
    }

    private void setFatura(double fatura) {
        this.fatura = fatura;
    }
    
    public void calcularFornecimento(){
        this.setFornecimento(getConsumo() * 0.28172);  
    }
    
    public void calcularIcms(){
        if (getConsumo() <= 200){
            this.setIcms(0.136363 * getFornecimento());
        }
        else this.setIcms(0.333333 * getFornecimento());               
    }
    
    public void calcularCofins(){
        if (getConsumo() <= 200){
            this.setCofins(0.0614722 * getFornecimento());
        }
        else this.setCofins(0.0730751 * getFornecimento());               
    }
    
    public void calcularPispasep(){
        if (getConsumo() <= 200){
            this.setPispasep(0.013346 * getFornecimento());
        }
        else this.setPispasep(0.0158651 * getFornecimento());        
    }
    
    public void CalcularIcmscofins(){
        if (getConsumo() <= 200){
            this.setIcmscofins(getFornecimento() * 0.136363 * 0.013346);
        }
        else this.setIcmscofins(getFornecimento() * 0.333333 * 0.0730751 );
    }
    
    public void calcularIcmspispasep(){
        if (getConsumo() <= 200){
            this.setIcmspispasep(getFornecimento() * 0.136363 * 0.013346);
        }
        else this.setIcmspispasep(getFornecimento() * 0.333333 * 0.0158651 );
    }
    
    public void calcularFatura(){
        this.setFatura(getFornecimento() + getIcms() + getCofins() + getPispasep() + getIcmscofins() + getIcmspispasep());
    }
    
    @Override
    public String toString(){
        String ret = null;
        ret = "Fornecimento : " + getFornecimento()+"\n"+
              "ICMS: " + getIcms()+"\n"+
              "COFINS : " + getCofins()+"\n"+
              "PIS/PASEP : " + getPispasep()+"\n"+
              "ICMS/COFINS : " + getIcmscofins()+"\n"+
              "ICMS/PIS/PASEP : " + getIcmspispasep()+"\n"+
              "FATURA : " + getFatura()+"\n";
        return ret;
    }
    
    
    
    
}

