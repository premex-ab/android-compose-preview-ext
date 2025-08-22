package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART-TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides SMART-TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTTECHNOLOGY: Any
  get() = object {
      /** SMART-TECHNOLOGY elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SMART-TECHNOLOGY stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SMART-TECHNOLOGY zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
