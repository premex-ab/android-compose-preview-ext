package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FPD device specifications for Android Compose previews.
 *
 * This extension provides FPD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fpd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fpd: Any
  get() = object {
      /** FPD elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** FPD hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FPD kapellen */
      val KAPELLEN = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** FPD khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FPD lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FPD mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
