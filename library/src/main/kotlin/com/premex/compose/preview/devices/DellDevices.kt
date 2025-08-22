package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * dell device specifications for Android Compose previews.
 *
 * This extension provides dell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dell: Any
  get() = object {
      /** dell thunderbird */
      val THUNDERBIRD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** dell yellowtail */
      val YELLOWTAIL = "spec:width=800,height=1280,unit=px,dpi=213"

  }
