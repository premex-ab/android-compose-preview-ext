package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SG device specifications for Android Compose previews.
 *
 * This extension provides SG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sg: Any
  get() = object {
      /** SG eve_sprout */
      val EVE_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG JeridB */
      val JERIDB = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SG Judau */
      val JUDAU = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG JudauL */
      val JUDAUL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG kaleido_sprout */
      val KALEIDO_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG Kamille */
      val KAMILLE = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG KamilleL */
      val KAMILLEL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG Levil */
      val LEVIL = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SG Levil5 */
      val LEVIL5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SG Lockon */
      val LOCKON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SG Mikazuki */
      val MIKAZUKI = "spec:width=1440,height=3120,unit=px,dpi=520"

      /** SG Mineva */
      val MINEVA = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG MinevaL */
      val MINEVAL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SG nasa_sprout */
      val NASA_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG Naze */
      val NAZE = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** SG Nee */
      val NEE = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** SG OI6 */
      val OI6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SG Orga */
      val ORGA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SG Quattro */
      val QUATTRO = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SG Recoa */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SG rome_sprout */
      val ROME_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG Sarah */
      val SARAH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** SG SG304SH */
      val SG304SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG305SH */
      val SG305SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG401SH */
      val SG401SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG402SH */
      val SG402SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG403SH */
      val SG403SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG404SH */
      val SG404SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG502SH */
      val SG502SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG503SH */
      val SG503SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG506SH */
      val SG506SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG509SH */
      val SG509SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG603SH */
      val SG603SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG605SH */
      val SG605SH = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** SG SG606SH */
      val SG606SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG701SH */
      val SG701SH = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** SG SG702SH */
      val SG702SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SG704SH */
      val SG704SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SG SG706SH */
      val SG706SH = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** SG SG801SH */
      val SG801SH = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** SG SG803SH */
      val SG803SH = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SG SG808SH */
      val SG808SH = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** SG SG901SH */
      val SG901SH = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** SG SG906SH */
      val SG906SH = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** SG SG907SH */
      val SG907SH = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SG SG908SH */
      val SG908SH = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** SG SGA002SH */
      val SGA002SH = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** SG SH-M12 */
      val SH_M12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SG SW001SH */
      val SW001SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SG SX1 */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SG SX3 */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SG SX4 */
      val SX4 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SG SX5 */
      val SX5 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SG SXI */
      val SXI = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SG vespa_sprout */
      val VESPA_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SG zeon_sprout */
      val ZEON_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
