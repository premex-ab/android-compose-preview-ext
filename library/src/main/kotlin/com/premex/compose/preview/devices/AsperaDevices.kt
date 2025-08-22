package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aspera device specifications for Android Compose previews.
 *
 * This extension provides Aspera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aspera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aspera: Any
  get() = object {
      /** Aspera A45_1 */
      val A45_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Aspera AS5 */
      val AS5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Aspera AS57 */
      val AS57 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Aspera AS6 */
      val AS6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Aspera AS7 */
      val AS7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Aspera AS8 */
      val AS8 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Aspera AS9 */
      val AS9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Aspera Aspera_Nitro */
      val ASPERA_NITRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** Aspera AS-10 */
      val AS_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Aspera Buzz */
      val BUZZ = "spec:width=480,height=854,unit=px,dpi=200"

      /** Aspera CHAT */
      val CHAT = "spec:width=576,height=1152,unit=px,dpi=220"

      /** Aspera GEM */
      val GEM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Aspera Jazz_2 */
      val JAZZ_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Aspera Nitro2 */
      val NITRO2 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
