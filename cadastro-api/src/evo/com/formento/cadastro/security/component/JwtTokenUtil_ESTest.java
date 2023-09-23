/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 03 21:13:12 GMT 2023
 */

package com.formento.cadastro.security.component;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.formento.cadastro.security.UsuarioAuthentication;
import com.formento.cadastro.security.component.JwtTokenUtil;
import java.time.LocalDateTime;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.security.core.userdetails.UserDetails;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JwtTokenUtil_ESTest extends JwtTokenUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      UserDetails userDetails0 = mock(UserDetails.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        jwtTokenUtil0.validateToken((String) null, userDetails0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.springframework.security.core.userdetails.UserDetails$MockitoMock$1693451792 cannot be cast to com.formento.cadastro.security.JwtUser
         //
         verifyException("com.formento.cadastro.security.component.JwtTokenUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      Optional<String> optional0 = jwtTokenUtil0.getEmailFromToken("");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      Optional<LocalDateTime> optional0 = jwtTokenUtil0.getExpirationDateFromToken("");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      Boolean boolean0 = jwtTokenUtil0.validateToken("", (UserDetails) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      UsuarioAuthentication usuarioAuthentication0 = mock(UsuarioAuthentication.class, new ViolatedAssumptionAnswer());
      doReturn("").when(usuarioAuthentication0).getEmail();
      // Undeclared exception!
      try { 
        jwtTokenUtil0.generateToken(usuarioAuthentication0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.formento.cadastro.security.component.JwtTokenUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JwtTokenUtil jwtTokenUtil0 = new JwtTokenUtil();
      Optional<LocalDateTime> optional0 = jwtTokenUtil0.getCreatedDateFromToken("");
      assertNotNull(optional0);
  }
}