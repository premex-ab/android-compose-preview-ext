package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Senwa device specifications for Android Compose previews.
 *
 * This extension provides Senwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Senwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Senwa: Any
  get() = object {
      /** Senwa LS5018FP */
      val LS5018FP = "spec:width=480,height=960,unit=px,dpi=213"

  }
