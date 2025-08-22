package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Chanbly device specifications for Android Compose previews.
 *
 * This extension provides Chanbly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chanbly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chanbly: Any
  get() = object {
      /** Chanbly q7 */
      val Q7 = "spec:width=480,height=800,unit=px,dpi=120"

  }
