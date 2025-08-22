package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WHOOP device specifications for Android Compose previews.
 *
 * This extension provides WHOOP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WHOOP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WHOOP: Any
  get() = object {
      /** WHOOP TAB-8US2 */
      val TAB_8US2 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
