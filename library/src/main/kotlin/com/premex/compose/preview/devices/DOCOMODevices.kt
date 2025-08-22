package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DOCOMO device specifications for Android Compose previews.
 *
 * This extension provides DOCOMO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DOCOMO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DOCOMO: Any
  get() = object {
      /** DOCOMO DM-01H */
      val DM_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO DM-01J */
      val DM_01J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F01F */
      val F01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F01H */
      val F01H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F01J */
      val F01J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F01K */
      val F01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F01L */
      val F01L = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DOCOMO F02E */
      val F02E = "spec:width=1080,height=1776,unit=px,dpi=480"

      /** DOCOMO F02F */
      val F02F = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DOCOMO F02G */
      val F02G = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DOCOMO F02H */
      val F02H = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DOCOMO F02K */
      val F02K = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DOCOMO F02L */
      val F02L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F03F */
      val F03F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F03G */
      val F03G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DOCOMO F03H */
      val F03H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F03K */
      val F03K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F04E */
      val F04E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F04G */
      val F04G = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DOCOMO F04H */
      val F04H = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DOCOMO F04J */
      val F04J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F04K */
      val F04K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DOCOMO F05E */
      val F05E = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** DOCOMO F05F */
      val F05F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F05J */
      val F05J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F06E */
      val F06E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO F07E */
      val F07E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F09E */
      val F09E = "spec:width=540,height=960,unit=px,dpi=240"

      /** DOCOMO F10D */
      val F10D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO F41A */
      val F41A = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DOCOMO F42A */
      val F42A = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DOCOMO F51A */
      val F51A = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DOCOMO F52A */
      val F52A = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** DOCOMO Jerid */
      val JERID = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DOCOMO N-02E */
      val N_02E = "spec:width=480,height=800,unit=px,dpi=240"

      /** DOCOMO N-03E */
      val N_03E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO N-04E */
      val N_04E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO N-06E */
      val N_06E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO N-07D */
      val N_07D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO SH02E */
      val SH02E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO SH04E */
      val SH04E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO SH09D */
      val SH09D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO SH10D */
      val SH10D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DOCOMO SH-01F */
      val SH_01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-01FDQ */
      val SH_01FDQ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-01G */
      val SH_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-01H */
      val SH_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-01K */
      val SH_01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-01L */
      val SH_01L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DOCOMO SH-01M */
      val SH_01M = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DOCOMO SH-02F */
      val SH_02F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-02G */
      val SH_02G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-02H */
      val SH_02H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-02J */
      val SH_02J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO SH-02M */
      val SH_02M = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DOCOMO SH-03G */
      val SH_03G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-03J */
      val SH_03J = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DOCOMO SH-03K */
      val SH_03K = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** DOCOMO SH-04F */
      val SH_04F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-04G */
      val SH_04G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO SH-04H */
      val SH_04H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-04L */
      val SH_04L = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** DOCOMO SH-05F */
      val SH_05F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-05G */
      val SH_05G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DOCOMO SH-06E */
      val SH_06E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DOCOMO SH-06F */
      val SH_06F = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DOCOMO SH-07E */
      val SH_07E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DOCOMO SH-08E */
      val SH_08E = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DOCOMO SH-51A */
      val SH_51A = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DOCOMO SH-51B */
      val SH_51B = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DOCOMO SH-51C */
      val SH_51C = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DOCOMO SH-51D */
      val SH_51D = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DOCOMO SH-51E */
      val SH_51E = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DOCOMO SH-51F */
      val SH_51F = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DOCOMO SH-52C */
      val SH_52C = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DOCOMO SH-52D */
      val SH_52D = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DOCOMO SH-52E */
      val SH_52E = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DOCOMO SH-52F */
      val SH_52F = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DOCOMO SH-53A */
      val SH_53A = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DOCOMO SH-53C */
      val SH_53C = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DOCOMO SH-53D */
      val SH_53D = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DOCOMO SH-53E */
      val SH_53E = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DOCOMO SH-54B */
      val SH_54B = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DOCOMO SH-54D */
      val SH_54D = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DOCOMO SH-54E */
      val SH_54E = "spec:width=1440,height=3120,unit=px,dpi=520"

  }
