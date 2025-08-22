package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Own device specifications for Android Compose previews.
 *
 * This extension provides Own device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Own.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Own: Any
  get() = object {
      /** Own Smart8 */
      val SMART8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Own SMART_PLUS_LTE */
      val SMART_PLUS_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
