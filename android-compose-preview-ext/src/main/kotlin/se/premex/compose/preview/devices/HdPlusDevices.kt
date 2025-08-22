package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HD_PLUS device specifications for Android Compose previews.
 *
 * This extension provides HD_PLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HdPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HdPlus: Any
  get() = object {
      /** HD_PLUS SEI900HDPLUS */
      val SEI900HDPLUS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
