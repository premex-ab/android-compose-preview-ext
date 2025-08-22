package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Changhong device specifications for Android Compose previews.
 *
 * This extension provides Changhong device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Changhong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Changhong: Any
  get() = object {
      /** Changhong hapjeong */
      val HAPJEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Changhong ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Changhong longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Changhong redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Changhong samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Changhong sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
