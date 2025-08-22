package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TVSmart device specifications for Android Compose previews.
 *
 * This extension provides TVSmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvsmart: Any
  get() = object {
      /** TVSmart DV8981-KPV */
      val DV8981_KPV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
