package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TVcore device specifications for Android Compose previews.
 *
 * This extension provides TVcore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvcore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvcore: Any
  get() = object {
      /** TVcore ts401 */
      val TS401 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
