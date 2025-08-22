package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOXELECTRONICS device specifications for Android Compose previews.
 *
 * This extension provides VOXELECTRONICS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Voxelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Voxelectronics: Any
  get() = object {
      /** VOXELECTRONICS elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** VOXELECTRONICS hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VOXELECTRONICS lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VOXELECTRONICS mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
