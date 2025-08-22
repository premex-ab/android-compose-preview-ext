package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAKAMICHI device specifications for Android Compose previews.
 *
 * This extension provides NAKAMICHI device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nakamichi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nakamichi: Any
  get() = object {
      /** NAKAMICHI stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NAKAMICHI zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
