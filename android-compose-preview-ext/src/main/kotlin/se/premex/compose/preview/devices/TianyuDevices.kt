package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TIANYU device specifications for Android Compose previews.
 *
 * This extension provides TIANYU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tianyu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tianyu: Any
  get() = object {
      /** TIANYU S40 */
      val S40 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
