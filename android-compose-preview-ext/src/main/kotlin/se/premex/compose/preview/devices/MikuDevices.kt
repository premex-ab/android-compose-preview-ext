package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MIKU device specifications for Android Compose previews.
 *
 * This extension provides MIKU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Miku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Miku: Any
  get() = object {
      /** MIKU TAB63A */
      val TAB63A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
