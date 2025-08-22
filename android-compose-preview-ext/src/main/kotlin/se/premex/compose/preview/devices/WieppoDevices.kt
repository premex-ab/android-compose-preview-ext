package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Wieppo device specifications for Android Compose previews.
 *
 * This extension provides Wieppo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wieppo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wieppo: Any
  get() = object {
      /** Wieppo t596_jw_wieppo */
      val T596_JW_WIEPPO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
