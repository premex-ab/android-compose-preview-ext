package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * REGZA device specifications for Android Compose previews.
 *
 * This extension provides REGZA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Regza.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Regza: Any
  get() = object {
      /** REGZA hengshan */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** REGZA YYT */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
