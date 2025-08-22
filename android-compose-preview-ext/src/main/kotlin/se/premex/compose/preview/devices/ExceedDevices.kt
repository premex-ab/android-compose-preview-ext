package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Exceed device specifications for Android Compose previews.
 *
 * This extension provides Exceed device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Exceed.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Exceed: Any
  get() = object {
      /** Exceed Exceed_E22 */
      val EXCEED_E22 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
