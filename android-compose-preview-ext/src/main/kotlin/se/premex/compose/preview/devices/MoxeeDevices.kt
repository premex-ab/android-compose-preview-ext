package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Moxee device specifications for Android Compose previews.
 *
 * This extension provides Moxee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Moxee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Moxee: Any
  get() = object {
      /** Moxee m2307 */
      val M2307 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Moxee T2310 */
      val T2310 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
