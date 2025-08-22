package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ziox device specifications for Android Compose previews.
 *
 * This extension provides Ziox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ziox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ziox: Any
  get() = object {
      /** Ziox Duopix_F9_Pro */
      val DUOPIX_F9_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
