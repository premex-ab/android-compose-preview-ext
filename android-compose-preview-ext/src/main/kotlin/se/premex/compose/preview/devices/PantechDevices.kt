package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Pantech device specifications for Android Compose previews.
 *
 * This extension provides Pantech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pantech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pantech: Any
  get() = object {
      /** Pantech HS8929QC */
      val HS8929QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
