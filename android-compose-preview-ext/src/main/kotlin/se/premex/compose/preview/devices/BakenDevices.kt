package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BAKEN device specifications for Android Compose previews.
 *
 * This extension provides BAKEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Baken.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Baken: Any
  get() = object {
      /** BAKEN M10_A03 */
      val M10_A03 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
