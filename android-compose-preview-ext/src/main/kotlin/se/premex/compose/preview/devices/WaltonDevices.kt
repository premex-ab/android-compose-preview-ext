package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Walton device specifications for Android Compose previews.
 *
 * This extension provides Walton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Walton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Walton: Any
  get() = object {
      /** Walton osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Walton Primo_G8i */
      val PRIMO_G8I = "spec:width=480,height=960,unit=px,dpi=240"

      /** Walton Primo_G8i_4G */
      val PRIMO_G8I_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Walton Primo_GF7 */
      val PRIMO_GF7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Walton Primo_GM2 */
      val PRIMO_GM2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Walton Primo_GM2_Plus */
      val PRIMO_GM2_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Walton Primo_H7s */
      val PRIMO_H7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Walton Primo_NF3 */
      val PRIMO_NF3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Walton Primo_NH3 */
      val PRIMO_NH3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Walton Primo_NH3_Lite */
      val PRIMO_NH3_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Walton Primo_RX6 */
      val PRIMO_RX6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Walton Walpad10HProMax */
      val WALPAD10HPROMAX = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Walton WALPAD_9G */
      val WALPAD_9G = "spec:width=800,height=1340,unit=px,dpi=213"

  }
