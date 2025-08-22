package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GIGABYTE device specifications for Android Compose previews.
 *
 * This extension provides GIGABYTE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gigabyte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gigabyte: Any
  get() = object {
      /** GIGABYTE huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
