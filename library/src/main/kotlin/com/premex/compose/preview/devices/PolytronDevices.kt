package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Polytron device specifications for Android Compose previews.
 *
 * This extension provides Polytron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polytron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polytron: Any
  get() = object {
      /** Polytron hayward */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Polytron osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Polytron P500 */
      val P500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Polytron P551S */
      val P551S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Polytron songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
