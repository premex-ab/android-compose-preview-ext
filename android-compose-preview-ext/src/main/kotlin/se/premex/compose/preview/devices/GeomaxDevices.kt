package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GeoMax device specifications for Android Compose previews.
 *
 * This extension provides GeoMax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geomax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geomax: Any
  get() = object {
      /** GeoMax Zenius08 */
      val ZENIUS08 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
