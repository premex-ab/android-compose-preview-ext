package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobiistar device specifications for Android Compose previews.
 *
 * This extension provides mobiistar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiistar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiistar: Any
  get() = object {
      /** mobiistar C1_Lite */
      val C1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** mobiistar E1_Selfie */
      val E1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** mobiistar mobiistar_C1 */
      val MOBIISTAR_C1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** mobiistar mobiistar_C1_Shine */
      val MOBIISTAR_C1_SHINE = "spec:width=480,height=960,unit=px,dpi=240"

      /** mobiistar mobiistar_C2 */
      val MOBIISTAR_C2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** mobiistar mobiistar_E_Selfie */
      val MOBIISTAR_E_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** mobiistar mobiistar_X */
      val MOBIISTAR_X = "spec:width=720,height=1520,unit=px,dpi=320"

      /** mobiistar Mobiistar_Zumbo_J2 */
      val MOBIISTAR_ZUMBO_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** mobiistar X1_Dual */
      val X1_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** mobiistar X1_Notch */
      val X1_NOTCH = "spec:width=720,height=1498,unit=px,dpi=320"

      /** mobiistar X1_Selfie */
      val X1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** mobiistar XQ_Dual */
      val XQ_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** mobiistar Zumbo_S_2017_Lite */
      val ZUMBO_S_2017_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
