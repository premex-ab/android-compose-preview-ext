package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELESYSTEM device specifications for Android Compose previews.
 *
 * This extension provides TELESYSTEM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telesystem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telesystem: Any
  get() = object {
      /** TELESYSTEM martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TELESYSTEM ONT2HD */
      val ONT2HD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TELESYSTEM UPT24K */
      val UPT24K = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
