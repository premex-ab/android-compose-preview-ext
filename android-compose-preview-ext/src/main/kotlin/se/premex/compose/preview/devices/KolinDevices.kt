package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * kolin device specifications for Android Compose previews.
 *
 * This extension provides kolin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kolin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kolin: Any
  get() = object {
      /** kolin longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** kolin redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
