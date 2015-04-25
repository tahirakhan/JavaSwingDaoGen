package com.sigma.project.user;


import java.util.*;


/**
 * NotFoundException exception. This exception will be thrown from
 * Dao object if load, update or delete for one object fails to find the
 * correct row.
 *
 * NOTE: You will need only one instance of this class to use multiple
 * DaoGen generated objects.
 */

/**
 * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
 * The usage of generated code is restricted to OpenSource software projects
 * only. DaoGen is available in http://titaniclinux.net/daogen/
 * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
 *
 * DaoGen license: The following DaoGen generated source code is licensed
 * under the terms of GNU GPL license. The full text for license is available
 * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
 *
 * If you wish to use the DaoGen generator to produce code for closed-source
 * commercial applications, you must pay the lisence fee. The price is
 * 5 USD or 5 Eur for each database table, you are generating code for.
 * (That includes unlimited amount of iterations with all supported languages
 * for each database table you are paying for.) Send mail to
 * "Tuomo.Lukka@iki.fi" for more information. Thank you!
 */



public class NotFoundException extends Exception {

  /**
   * Constructor for NotFoundException. The input message is
   * returned in toString() message.
   */
  public NotFoundException(String msg) {
    super(msg);
  }

}