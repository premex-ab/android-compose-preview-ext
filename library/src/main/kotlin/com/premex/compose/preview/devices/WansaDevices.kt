package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wansa device specifications for Android Compose previews.
 *
 * This extension provides Wansa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wansa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wansa: Any
  get() = object {
      /** Wansa longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Wansa redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Wansa samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Wansa xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
