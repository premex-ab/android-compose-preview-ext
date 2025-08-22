package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * W_O device specifications for Android Compose previews.
 *
 * This extension provides W_O device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WO: Any
  get() = object {
      /** W_O X6 */
      val X6 = "spec:width=540,height=960,unit=px,dpi=240"

  }
