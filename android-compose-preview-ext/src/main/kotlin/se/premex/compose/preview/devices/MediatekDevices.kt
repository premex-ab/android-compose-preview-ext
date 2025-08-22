package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MediaTek device specifications for Android Compose previews.
 *
 * This extension provides MediaTek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mediatek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mediatek: Any
  get() = object {
      /** MediaTek m7332_eu */
      val M7332_EU = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** MediaTek mt5862_512m */
      val MT5862_512M = "spec:width=720,height=1280,unit=px,dpi=160"

  }
