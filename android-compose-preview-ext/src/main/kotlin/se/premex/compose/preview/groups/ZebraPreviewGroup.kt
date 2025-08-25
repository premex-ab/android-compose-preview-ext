// Generated Zebra Preview Group utility. Categories=6, Devices=76
package se.premex.compose.preview.groups

import kotlin.String
import kotlin.collections.List
import se.premex.compose.preview.device.catalog.android.Zebra

/**
 * Zebra device preview group providing categorized access to Zebra's enterprise device catalog.
 *
 * This utility organizes 76 Zebra devices into logical categories based on their intended use
 * cases,
 * making it easier to target specific device types for enterprise application testing.
 */
public object ZebraPreviewGroup {
  /**
   * Device categories organized by Zebra product lines and use cases.
   */
  public object Categories {
    /**
     * Mobile computers and handheld scanners (MC series) (11 devices)
     */
    public val handhelds: List<String> = listOf(
                Zebra.MC2200,
                Zebra.MC2700,
                Zebra.MC33,
                Zebra.MC3300X,
                Zebra.MC3300XC,
                Zebra.MC33C,
                Zebra.MC3400,
                Zebra.MC93,
                Zebra.MC93C,
                Zebra.MC9400,
                Zebra.MC9450
            )

    /**
     * Touch computers and mobile devices (TC series) (35 devices)
     */
    public val touchComputers: List<String> = listOf(
                Zebra.TC15,
                Zebra.TC20KB,
                Zebra.TC20RD,
                Zebra.TC20RT,
                Zebra.TC21,
                Zebra.TC22,
                Zebra.TC25FM,
                Zebra.TC26,
                Zebra.TC27,
                Zebra.TC51,
                Zebra.TC51HC,
                Zebra.TC52,
                Zebra.TC52X,
                Zebra.TC53,
                Zebra.TC53E,
                Zebra.TC55,
                Zebra.TC56,
                Zebra.TC57,
                Zebra.TC57X,
                Zebra.TC58,
                Zebra.TC58E,
                Zebra.TC70,
                Zebra.TC70X,
                Zebra.TC72,
                Zebra.TC73,
                Zebra.TC73T,
                Zebra.TC75,
                Zebra.TC75X,
                Zebra.TC75XDF,
                Zebra.TC77,
                Zebra.TC78,
                Zebra.TC78T,
                Zebra.TC8000,
                Zebra.TC83B0,
                Zebra.TC83BH
            )

    /**
     * Enterprise tablets (ET series) (15 devices)
     */
    public val tablets: List<String> = listOf(
                Zebra.ET40L,
                Zebra.ET40S,
                Zebra.ET45L,
                Zebra.ET45S,
                Zebra.ET50E,
                Zebra.ET50T,
                Zebra.ET51L,
                Zebra.ET51S,
                Zebra.ET55E,
                Zebra.ET55T,
                Zebra.ET56L,
                Zebra.ET56S,
                Zebra.ET60,
                Zebra.ET65,
                Zebra.L10AW
            )

    /**
     * Vehicle-mounted computers (VC series) (3 devices)
     */
    public val vehicleComputers: List<String> = listOf(
                Zebra.VC80X,
                Zebra.VC8308,
                Zebra.VC8310
            )

    /**
     * Wearable computers and devices (WT series) (2 devices)
     */
    public val wearables: List<String> = listOf(
                Zebra.WT63B0,
                Zebra.WT6400
            )

    /**
     * Other Zebra devices (10 devices)
     */
    public val others: List<String> = listOf(
                Zebra.CC605LN,
                Zebra.CC610LC,
                Zebra.CC610PC,
                Zebra.EC30RT,
                Zebra.EC50,
                Zebra.EC55,
                Zebra.EM45,
                Zebra.KC50L,
                Zebra.KC50S,
                Zebra.PS20JP
            )
  }
}
