package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Smartex device specifications for Android Compose previews.
 *
 * This extension provides Smartex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartex: Any
  get() = object {
      /** Smartex M530 */
      val M530 = "spec:width=480,height=960,unit=px,dpi=240"

  }
