package com.speksy.ocp.chapter6.usingMultyCatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class BigMessOfExceptions {
    public static void main(String[] args) {

    }

//    public void doesNotCompile () { // METHOD DOES NOT COMPILE
//        try {
//            mightThrow();
//        } catch (FileNotFoundException | IllegalStateException e) {
//        } catch (InputMismatchException e | MissingResourceException e){
//        } catch (SQLException | ArrayIndexOutOfBoundsException e){
//        } catch (FileNotFoundException | IllegalStateException e){
//        } catch (Exception e){
//        } catch (IOException e){
//        }
//    }
    /*
    1) catch (InputMismatchException e | MissingResourceException e){
    - there can be only one variable on catch block
    2)  } catch (Exception e){
       } catch (IOException e){}
    - exceptions are reversed - The more general exception must be caught
    after their subclass
    3) } catch (FileNotFoundException | IllegalStateException e){
    - FNF was already catch in previous catch block. You can't list the same
    exception more that ones in the same try statement. Just like with "regular"
    catch blocks.
    4)} catch (SQLException | ArrayIndexOutOfBoundsException e){
    - Cannot catch SQLException because nothing in the try statement can
    potentially throw one. Only checked exceptions that have the potential to be
    thrown are allowed to be caught.
    * */

    private void mightThrow() throws DateTimeParseException, IOException {
    }
}
