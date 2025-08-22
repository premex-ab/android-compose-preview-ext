package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELECTROMAN device specifications for Android Compose previews.
 *
 * This extension provides ELECTROMAN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELECTROMAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELECTROMAN: Any
  get() = object {
      /** ELECTROMAN hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ELECTROMAN stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ELECTROMAN zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
