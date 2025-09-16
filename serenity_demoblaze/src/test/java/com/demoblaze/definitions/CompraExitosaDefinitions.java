package com.demoblaze.definitions;

import com.demoblaze.configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompraExitosaDefinitions {

    private WebDriver driver;
    private WebDriverWait wait;
    private int ms=1000;

    public CompraExitosaDefinitions() {
        this.driver = WebDriverManager.getDriver();
    }


    @Given("el usuario ingresa a la pagina demoblaze {string}")
    public void el_usuario_ingresa_a_la_pagina_demoblaze(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(ms);
    }

    @When("selecciona el primer producto")
    public void selecciona_el_primer_producto() throws InterruptedException {
        driver.findElement(By.cssSelector("a.hrefch[href='prod.html?idp_=1']")).click();
        Thread.sleep(ms);
    }

    @When("agrega al carrito el primer producto")
    public void agrega_al_carrito_el_primer_producto() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(ms);
    }

    @When("da clic en Aceptar agregar al carrito para el primer producto")
    public void da_clic_en_aceptar_agregar_al_carrito_para_el_primer_producto() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(ms);

    }

    @When("regresa al home de la pagina demoblaze {string}")
    public void regresa_al_home_de_la_pagina_demoblaze(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(ms);
    }

    @When("selecciona el segundo producto")
    public void selecciona_el_segundo_producto() throws InterruptedException {
        driver.findElement(By.cssSelector("a.hrefch[href='prod.html?idp_=8']")).click();
        Thread.sleep(ms);
    }

    @When("agrega al carrito el segundo producto")
    public void agrega_al_carrito_el_segundo_producto() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(ms);
    }

    @When("da clic en Aceptar agregar al carrito para el segundo producto")
    public void da_clic_en_aceptar_agregar_al_carrito_para_el_segundo_producto() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(ms);
    }


    @When("va al carrito el compras {string}")
    public void va_al_carrito_el_compras(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(ms);
    }

    @When("ordena la compra")
    public void ordena_la_compra() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        Thread.sleep(ms);
    }

    @Then("completa el formulario de compra y finaliza la compra y se muestra el mensaje {string}")
    public void completa_el_formulario_de_compra_y_finaliza_la_compra_y_se_muestra_el_mensaje(String mensaje) {
        driver.findElement(By.id("name")).sendKeys("Evelyn Balseca");
        driver.findElement(By.id("country")).sendKeys("Ecuador");
        driver.findElement(By.id("city")).sendKeys("Quito");
        driver.findElement(By.id("card")).sendKeys("478512369666632");
        driver.findElement(By.id("month")).sendKeys("10");
        driver.findElement(By.id("year")).sendKeys("29");
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        System.out.println("mensaje esperado: "+mensaje);
        String mensajeReal = "";
        mensajeReal = driver.findElement(By.cssSelector(".sweet-alert h2")).getText();
        System.out.println("mensaje real: "+mensajeReal);
        Assert.assertEquals(mensaje,mensajeReal);
    }
}
