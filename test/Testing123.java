/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import obesityidentifier.Obesity;
import obesityidentifier.Female;
import obesityidentifier.Male;
import obesityidentifier.ObesityIdentifier ;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

/**
 *
 * @author Indri
 */
public class Testing123 {
    
    public Testing123() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMale() {
        System.out.println("-----Testing Rumus Male----");
        ObesityIdentifier  instance = new ObesityIdentifier ();
        double expResult = 72;
        Male male = new Male(125,188);
        double result = instance.CalculateWeight(male);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testFemale() {
        System.out.println("\n-----Testing Rumus Female----");
        ObesityIdentifier  instance = new ObesityIdentifier ();
       double expResult = 68;
        Female Female = new Female(50,160);
        double result = instance.CalculateWeight(Female);
        assertEquals(expResult, result, 0.0);
    }
  
    //Mengetes value terhadap nama
    @Test
    public void NotnullVal(){
        System.out.println("\n-----Test Nama NOT NULL----");
        String nama = ObesityIdentifier .name();
        assertThat(nama,is(not(nullValue())));        
    }
    
    //ini untuk mengetes huruf awal harus sama kaya value
    @Test
    public void startWithVal(){
        System.out.println("\n-----Test Nama Star With----");
        String nama = ObesityIdentifier .name();
        assertThat(nama,startsWith("Ir"));   
    }
    
    @Test
    public void startWithJenisKelamin(){
        System.out.println("\n----Test Jenis Kelamin Start With----");
        String GenderAnswer = ObesityIdentifier .rumusByGender();
        assertThat(GenderAnswer,startsWith("M"));   
    }
    
    @Test
    public void testUmur() {
        System.out.println("\n----Test Umur----");
        int expResult = 19;
        int age = ObesityIdentifier .age();
        System.out.println("Exp Result :"+ expResult);
        System.out.println("Result :" + age);
        assertEquals(expResult, age);  
    }
    

}
