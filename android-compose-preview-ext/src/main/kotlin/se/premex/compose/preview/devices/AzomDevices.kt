package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Azom device specifications for Android Compose previews.
 *
 * This extension provides Azom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azom: Any
  get() = object {
      /** Azom Desert2 */
      val DESERT2 = "spec:width=1080,height=2310,unit=px,dpi=480"

  }
