package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Geniatech device specifications for Android Compose previews.
 *
 * This extension provides Geniatech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geniatech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geniatech: Any
  get() = object {
      /** Geniatech enjoytv */
      val ENJOYTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
