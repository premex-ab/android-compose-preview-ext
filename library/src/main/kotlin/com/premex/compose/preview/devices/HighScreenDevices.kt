package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HighScreen device specifications for Android Compose previews.
 *
 * This extension provides HighScreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HighScreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HighScreen: Any
  get() = object {
      /** HighScreen Bay */
      val BAY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen BBL7353RV */
      val BBL7353RV = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen Expanse */
      val EXPANSE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HighScreen FestXL */
      val FESTXL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen FestXL-Pro */
      val FESTXL_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen PowerFive */
      val POWERFIVE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen PowerFour */
      val POWERFOUR = "spec:width=480,height=854,unit=px,dpi=240"

      /** HighScreen PowerIceMax */
      val POWERICEMAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen PowerRage */
      val POWERRAGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen PowerRageEvo */
      val POWERRAGEEVO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HighScreen PrimeL */
      val PRIMEL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
