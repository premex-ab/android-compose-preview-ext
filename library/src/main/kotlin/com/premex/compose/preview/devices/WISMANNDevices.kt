package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WISMANN device specifications for Android Compose previews.
 *
 * This extension provides WISMANN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WISMANN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WISMANN: Any
  get() = object {
      /** WISMANN stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** WISMANN zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
