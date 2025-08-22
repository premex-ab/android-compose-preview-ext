package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GREENHOUSE device specifications for Android Compose previews.
 *
 * This extension provides GREENHOUSE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greenhouse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greenhouse: Any
  get() = object {
      /** GREENHOUSE kannai */
      val KANNAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** GREENHOUSE piha */
      val PIHA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** GREENHOUSE SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** GREENHOUSE umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
