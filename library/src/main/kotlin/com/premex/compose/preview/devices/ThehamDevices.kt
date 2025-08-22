package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * THEHAM device specifications for Android Compose previews.
 *
 * This extension provides THEHAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Theham.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Theham: Any
  get() = object {
      /** THEHAM hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** THEHAM stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THEHAM vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** THEHAM zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
