package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * docomo device specifications for Android Compose previews.
 *
 * This extension provides docomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Docomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Docomo: Any
  get() = object {
      /** docomo P-01K */
      val P_01K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo P-02E */
      val P_02E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo P-03E */
      val P_03E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01E */
      val SO_01E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** docomo SO-01F */
      val SO_01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01G */
      val SO_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01H */
      val SO_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01J */
      val SO_01J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01K */
      val SO_01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-01L */
      val SO_01L = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** docomo SO-01M */
      val SO_01M = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-02E */
      val SO_02E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-02F */
      val SO_02F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-02G */
      val SO_02G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-02H */
      val SO_02H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-02J */
      val SO_02J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-02K */
      val SO_02K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-02L */
      val SO_02L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** docomo SO-03E */
      val SO_03E = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** docomo SO-03F */
      val SO_03F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-03G */
      val SO_03G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-03H */
      val SO_03H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-03J */
      val SO_03J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-03K */
      val SO_03K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** docomo SO-03L */
      val SO_03L = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** docomo SO-04D */
      val SO_04D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** docomo SO-04E */
      val SO_04E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-04F */
      val SO_04F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-04G */
      val SO_04G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** docomo SO-04H */
      val SO_04H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-04J */
      val SO_04J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** docomo SO-04K */
      val SO_04K = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** docomo SO-05D */
      val SO_05D = "spec:width=540,height=888,unit=px,dpi=240"

      /** docomo SO-05F */
      val SO_05F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** docomo SO-05G */
      val SO_05G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** docomo SO-05K */
      val SO_05K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** docomo SO-41A */
      val SO_41A = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-41B */
      val SO_41B = "spec:width=720,height=1496,unit=px,dpi=300"

      /** docomo SO-51A */
      val SO_51A = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** docomo SO-51B */
      val SO_51B = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** docomo SO-51C */
      val SO_51C = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** docomo SO-51D */
      val SO_51D = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** docomo SO-51E */
      val SO_51E = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** docomo SO-51F */
      val SO_51F = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** docomo SO-52A */
      val SO_52A = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-52B */
      val SO_52B = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-52C */
      val SO_52C = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-52D */
      val SO_52D = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** docomo SO-52E */
      val SO_52E = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** docomo SO-53B */
      val SO_53B = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** docomo SO-53C */
      val SO_53C = "spec:width=720,height=1496,unit=px,dpi=300"

      /** docomo SO-53D */
      val SO_53D = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** docomo SO-54C */
      val SO_54C = "spec:width=1080,height=2520,unit=px,dpi=450"

  }
