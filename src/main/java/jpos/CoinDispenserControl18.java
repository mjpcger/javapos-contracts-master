//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// CoinDispenserControl18
//
//   Interface definining all new capabilities, properties and
//   methods that are specific to Coin Dispenser for release 1.8.
//
// Modification history
// ------------------------------------------------------------------
// 2004-Apr-01 JavaPOS Release 1.8                                 BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface CoinDispenserControl18 extends CoinDispenserControl17
{
  // Capabilities
  public boolean getCapStatisticsReporting() throws JposException;
  public boolean getCapUpdateStatistics() throws JposException;

  // Methods
  public void    resetStatistics(String statisticsBuffer)
                     throws JposException;
  public void    retrieveStatistics(String[] statisticsBuffer)
                     throws JposException;
  public void    updateStatistics(String statisticsBuffer)
                     throws JposException;
}