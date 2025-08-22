package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sunstech device specifications for Android Compose previews.
 *
 * This extension provides Sunstech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunstech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunstech: Any
  get() = object {
      /** Sunstech TAB1011 */
      val TAB1011 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
