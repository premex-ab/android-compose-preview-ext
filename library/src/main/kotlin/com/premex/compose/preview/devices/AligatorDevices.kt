package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aligator device specifications for Android Compose previews.
 *
 * This extension provides Aligator device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aligator.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aligator: Any
  get() = object {
      /** Aligator Aligator_S5550 */
      val ALIGATOR_S5550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Aligator Aligator_S6100 */
      val ALIGATOR_S6100 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Aligator Aligator_S6550 */
      val ALIGATOR_S6550 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Aligator Aligator_S6600 */
      val ALIGATOR_S6600 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Aligator RX600 */
      val RX600 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Aligator RX700 */
      val RX700 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
