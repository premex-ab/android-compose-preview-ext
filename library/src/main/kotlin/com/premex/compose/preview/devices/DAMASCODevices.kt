package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAMASCO device specifications for Android Compose previews.
 *
 * This extension provides DAMASCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAMASCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAMASCO: Any
  get() = object {
      /** DAMASCO elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DAMASCO lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DAMASCO lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DAMASCO mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DAMASCO mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DAMASCO nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DAMASCO pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
