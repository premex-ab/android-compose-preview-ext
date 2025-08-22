package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Yettel device specifications for Android Compose previews.
 *
 * This extension provides Yettel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yettel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yettel: Any
  get() = object {
      /** Yettel STB_BG_B866V2H01 */
      val STB_BG_B866V2H01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
