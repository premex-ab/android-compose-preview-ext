package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Proton device specifications for Android Compose previews.
 *
 * This extension provides Proton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Proton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Proton: Any
  get() = object {
      /** Proton P25_Ultra */
      val P25_ULTRA = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Proton Proton_X10_Pro */
      val PROTON_X10_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Proton Proton_X20_Pro */
      val PROTON_X20_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

  }
