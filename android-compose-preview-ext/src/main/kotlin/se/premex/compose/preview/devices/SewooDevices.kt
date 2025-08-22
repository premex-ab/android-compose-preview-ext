package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SEWOO device specifications for Android Compose previews.
 *
 * This extension provides SEWOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sewoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sewoo: Any
  get() = object {
      /** SEWOO NBP_65 */
      val NBP_65 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
