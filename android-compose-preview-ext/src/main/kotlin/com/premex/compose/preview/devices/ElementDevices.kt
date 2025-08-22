package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELEMENT device specifications for Android Compose previews.
 *
 * This extension provides ELEMENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Element.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Element: Any
  get() = object {
      /** ELEMENT hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ELEMENT khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
