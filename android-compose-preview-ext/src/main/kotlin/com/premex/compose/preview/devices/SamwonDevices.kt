package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAMWON device specifications for Android Compose previews.
 *
 * This extension provides SAMWON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samwon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samwon: Any
  get() = object {
      /** SAMWON lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SAMWON mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SAMWON nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SAMWON pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
