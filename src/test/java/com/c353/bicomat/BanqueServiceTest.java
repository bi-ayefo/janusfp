/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c353.bicomat;

import com.c353.bicomat.services.CompteService;
import com.c353.bicomat.services.common.impl.banque.BanqueDefaultService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author k.atsou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BanqueDefaultService.class})
public class BanqueServiceTest {

    @Autowired
    private BanqueDefaultService banqueDefaultService;

    public BanqueServiceTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test() {
        System.out.println("Hello!");
        banqueDefaultService.testFromBanque();
    }
}